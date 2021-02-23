package paquete.gestion;

import java.util.Random;                //Se importa para utilizar la clase Ramdon.
import javax.swing.JOptionPane;         //Se importa para poder mostrar ventanas emergentes que se utilizará en el futuro (JFrame Form).
import paquete.clases.*;                //Se importa el paquete clases para hacer uso de las clases creadas.

public class GestionRedes {
    
    //                                                      DECLARACIÓN DE ATRIBUTOS
    
    private Router[] arreglo;                       //Se crea un arreglo llamado "arreglo" en el que se almacenará objetos de tipo "Router"
    private int cont;                               //Se creará un contador "cont" que almacenará el número de routers agregados al arreglo "arreglo"
    
    
    
    
    
    //                                                      CREACIÓN DE MÉTODOS BÁSICOS
    
    //Se crea el metodo constructor de la clase.
    public GestionRedes() {
        arreglo = new Router[16];   //Se establecen 16 routers como maximo, a pesar de que el algoritmo solo sería eficiente hasta el router 15 (Explicacion Teoria).
        cont=0;                     //Se inicial el objeto con el contador a 0 siempre.
    }
    
    
    
    //Se crean los metodos getters y setters de la clase.
    public Router[]     getArreglo() {
        return arreglo;
    }
    public void         setArreglo(Router[] arreglo) {
        this.arreglo = arreglo;
    }
    public int          getCont() {
        return cont;
    }
    public void         setCont(int cont) {
        this.cont = cont;
    }
    
    
    
    
    
    //                                                      CREACIÓN DE MÉTODOS COMPLEJOS
    
    //Se crea el metodo IngresarRouter, en el que se agregará un router al arreglo "arreglo" siempre y cuando el contador "cont" sea menor a 16.
    public void IngresarRouter(Router obj){
        if(cont<16){
            arreglo[cont]=obj;
            cont++;
        }else{       //Si la condición no se cumple, una ventana emergente informará que no existe más espacio para almacenar otro router.
            JOptionPane.showMessageDialog(null, "No existe espacio para mas routers");
        }
    }
    
    
    
    //Se eliminará un router por medio de: Ingreso de una variable String con el nickname a eliminar.
    public void EliminarPorNick(String nick)
    {
        int conf;                                               //Se crea una variable "conf" que almacenará el mismo valor que tiene el contador "cont" (solo se usa en el último condicional)
        conf=cont;
        for(int i=0;i<cont;i++){                                 //Se hará un recorrido arreglo "arreglo", para encontrar al router que tenga el nickName igual al que se ingresó para eliminar.
            if(arreglo[i].getNickname().equalsIgnoreCase(nick)){ //Si se encuentra el router con nickname igual->
                for(int j=i;j<cont-1;j++){                       //Se eliminará del arreglo y se llenará su espacio con los routers que están más adelante. OJO!!! -> TOMAR EN CUENTA QUE SE PUEDE ELIMINAR MÁS DE UN ROUTER CON EL MISMO NOMBRE, POR LO QUE SE RECOMIENDA NO REPETIR EL MISMO NICKNAME
                    arreglo[j]=arreglo[j+1];
                }
                arreglo[cont]=null;                             //Se eliminará el último objeto del arreglo "arreglo" porque estará duplicado
                cont--;                                         //Se disminuirá el contador y así se sabrá que se elimino un router
            }
        }
        if (conf==cont){                                        //Si "conf" y "cont" son iguales, significa que no se ha eliminado ningún router.
            JOptionPane.showMessageDialog(null, "No existe el router");
        }else{                                                  //Por lo menos se ha eliminado 1 router -> MIRAR *OJO!!!* de arriba
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente el router");
        }
    }
    
    
    
    //Se implementa el método IntercambioTablasRouteo en el cual se terminaran de llenar las tablas de todos los routers que hayan en el arreglo "arreglo"
    public void IntercambioTablasRouteo (){
        
        for (int i = 0; i < cont; i++) {
            this.arreglo[i].BorrarTodaTablaDeRouteo();          //Se limpiarán todas las tablas de routeos en todos los routers de la topología
            this.arreglo[i].GenerarIpsPropiasyRedesVecinas();   //Se generarán los métodos necesarios de los routers
            this.arreglo[i].InicializarTablaDeRuteo();          //Se generarán los métodos necesarios de los routers
        }
        
        
        boolean AK=false;                   //Se usa para repetir todo el Do{}While de las lineas posteriores
        
        String auxInterfazSalida="";        //Almacenan las interfaces de salida para los routers receptores
        String nombreInterfazSalida="";     //Almacenan los nombres de las interfaces de salida para los routers receptores
        String auxNextHop="";               //Almacenan los nextHop para los routers receptores
        
        boolean compartenRedVecina=false;   //Informa si se cumple la segunda condición (más adelante se explican las condiciones de compartición) de compartición de tablas
        
        boolean encontro=false;             //Sirve para informar si la Ip compartida por el emisor al receptor ha sido encontrada en la tabla de routeo del receptor
        
        int aux10=0;                        //Se utiliza una sola vez para simplificar la vista del codigo
        
        
        do {
            AK=false;   //En cada vuelta se establecerá como falso y si se cambia a verdadero significa que ha habido alguna modificación, por lo cual quiero que haya otra vuelta para confirmar que ya no habrán más modificaciones.
                        //Solo hay dos formas que se cambie a verdadero: o ha habido alguna modificación en una tabla de routeo, o se ha agregado una dirección más a alguna tabla de routeo.
            
            for (int i = 0; i < cont; i++) {                //La "i" será siempre para el router emisor:    aquel router que comparte su tabla de routeo.
                for (int j = 0; j < cont; j++) {            //La "j" será siempre para el router receptor:  aquel router que recibe la tabla de routeo y decide si va a modificar o agregar algo en la suya.
                    
                                                                                                                        //TENEMOS QUE SABER QUE PARA QUE EL RECEPTOR ACEPTE AL EMISOR TENEMOS 2 CONDICIONES
                    
                    if (i!=j) {                                                                                         //!!!PRIMERA CONDICIÓN:     NO PUEDEN SER IGUALES LOS ROUTERS
                        
                        compartenRedVecina=false;                                                                           //Se establece como false "compartenRedVecina" antes de confirmar que los dos routers comparten alguna red vecina.
                        
                        for (int k = 0; k < this.arreglo[i].contRedesV; k++) {              //se recorren el contRedesVecinas del router emisor     ("i")
                            for (int l = 0; l < this.arreglo[j].contRedesV; l++) {          //se recorren el contRedesVecinas del router receptor   ("j")
                                
                                if(this.arreglo[i].RedesVecinas[k].equalsIgnoreCase(this.arreglo[j].RedesVecinas[l])){  //!!!SEGUNDA CONDICIÓN Primera Parte:     COMPARTEN ALGUNA RED VECINA ... ¡por lo general solo comparten una red vecina!
                                    compartenRedVecina=true;                            //se establece en true "compartenRedVecina"
                                    
                                    auxInterfazSalida=this.arreglo[j].IpsPropias[l];            //según el orden de los arreglos "IpsPropias" dentro de los routers receptores:
                                                                                                    //la posición "l" es la posición en la cual se encuentra la ip que está dentro de la misma red vecina que comparten ambos routers.
                                                                                                    //Por ello se quiere que se almacene en "auxInterfazSalida" la IpsPropia del router receptor que está en la red que comparte para ingresarla luego si es que hay ingresos o modificaciones en la tabla de routeo del receptor.
                                                                                                    
                                    nombreInterfazSalida=this.arreglo[j].InterfacesPropias[l];  //sigue la misma lógica de auxInterfazSalida
                                    
                                    auxNextHop=this.arreglo[i].IpsPropias[k];                   //según el orden de los arreglos "IpsPropias" dentro de los routers emisores:
                                                                                                    //la posición "k" es la posición en la cual se encuentra la ip que está dentro de la misma red vecina que comparten ambos routers.
                                                                                                    //Por ello se quiere que se almacene en "auxNextHop" la IpsPropia del router emisor que está en la red que comparte para ingresarla luego si es que hay ingresos o modificaciones en la tabla de routeo del receptor.
                                }
                            }
                        }
                        
                        if(compartenRedVecina==true){                                                                   //!!!SEGUNDA CONDICIÓN Segunda Parte:     Aquí se entrará solo si la primera parte dio positivo.
                            
                                                                                                                        //AL INGRESAR A ESTA SECCIÓN, TODAS LAS CONDICIONES PARA QUE EL EMISOR LE COMPARTA SU TABLA DE ROUTEO AL RECEPTOR
                                                                                                                        //SE HAN CUMPLIDO, POR LO CUAL QUEDAN 2 CAMINOS DE AQUÍ EN ADELANTE:
                                                                                                                        
                                                                                                                        //1.- El router Emi comparta una dirección que ya conozca el receptor y el receptor tome dos caminos:
                                                                                                                            //1.1.- El receptor quiera copiar su camino porque le ofrece un camino más rentable (respecto a hops)
                                                                                                                            //1.2.- El receptor no quiera copiar su camino porque no le ofrece un camino más rentable (respecto a hops)
                                                                                                                        //2.- El router Emi comparte una dirección que no conoce el receptor y el receptor ingresa esa dirección a su tabla de routeo.
                                                                                                                        
                            for (int k = 0; k < this.arreglo[i].RTcontIngresados; k++) {                                //Da "k" vueltas según el número de Ips ingresadas a la tabla de routeo del emisor
                                
                                encontro = false;       //Este booleano estará en falso cada que se repita esta vuelta para que sepa el router receptor que no hay una IP repetida
                                for (int l = 0; l < this.arreglo[j].RTcontIngresados; l++) {                            //Da "l" vueltas según el número de Ips ingresadas a la tabla de routeo del receptor

                                    if(this.arreglo[i].RTip[k].equalsIgnoreCase(this.arreglo[j].RTip[l])){              //Si el router receptor encuentra similitud entre la IP compartida por el emisor y una Ip que tiene él mismo...

                                        if(this.arreglo[i].RThop[k]<this.arreglo[j].RThop[l]-1){                        //El receptor tomará la decisión de modificar esta Ip solo si tiene un mejor camino para ofrecerle
                                            this.arreglo[j].RTinterfazSalida[l] = auxInterfazSalida;                        //SOLO SE MODIFICA LA INTERFAZ DE SALIDA    (RECORDAR QUE auxInterfazSalida SE EXPLICÓ ANTES)
                                            this.arreglo[j].RTnextHop[l]        = auxNextHop;                               //EL NEXTHOP                                (RECORDAR QUE auxNextHop SE EXPLICÓ ANTES)
                                            this.arreglo[j].RThop[l]            = this.arreglo[i].RThop[k]+1;               //Y EL HOP A MEJORAR, PORQUE LOS DEMÁS DATOS DE LA IP SON IGUALES.
                                            AK=true;                                                                                //PRIMERA VEZ QUE SE ACTIVA EL AK
                                        }
                                        encontro = true;//Se activa como positivo para que no entre a la siguiente condicional y dobletee la IP modificada en esta parte.
                                    }
                                }
                                if(encontro==false){    //Si no se cambio el estado de "encontro" justo arriba, significa que la IP que el emisor le ha compartido al receptor no la tenía previamente y la quiere incorporar.
                                    aux10=this.arreglo[j].RTcontIngresados;                                         //Se usa el "aux10" para que sea más visible al programador y sepa que siempre es {la última posición +1} de la tabla de routeo 
                                    this.arreglo[j].RTip[aux10]             = this.arreglo[i].RTip[k];              //Se ingresa el nombre de la IP en el receptor
                                    this.arreglo[j].RTred[aux10]            = this.arreglo[i].RTred[k];             //Se ingresa el nombre de la red en el receptor
                                    this.arreglo[j].RTnombreRouter[aux10]   = this.arreglo[i].RTnombreRouter[k];    //Se ingresa el nombre del router en el receptor
                                    this.arreglo[j].RTnombreSalida[aux10]   = nombreInterfazSalida;                 //Se ingresa el nombre de la interfaz de salida del receptor    (RECORDAR QUE nombreInterfazSalida SE EXPLICÓ ANTES)
                                    this.arreglo[j].RTinterfazSalida[aux10] = auxInterfazSalida;                    //Se ingresa la interfaz de salida del receptor                 (RECORDAR QUE auxIntefazSalida SE EXPLICÓ ANTES)
                                    this.arreglo[j].RTnextHop[aux10]        = auxNextHop;                           //Se ingresa el siguiente salto perteneciente al emisor         (RECORDAR QUE auxInterfazSalida SE EXPLICÓ ANTES)
                                    this.arreglo[j].RThop[aux10]            = this.arreglo[i].RThop[k]+1;           //Se le ingresa la misma cantidad de saltos del emisor +1 (porque son vecinos y entre ellos hay solo 1 salto)
                                    this.arreglo[j].RTcontIngresados++;                                             //Se aumenta en 1 la cantidad de elementos ingresados en la tabla de routeo
                                    AK=true;                                                                                        //SEGUNDA VEZ QUE SE ACTIVA EL AK
                                }
                            }
                        }
                    }
                }
            }
        } while (AK==true);                 //Si es que luego de algunas iteraciones, el estado del AK es false, 
                                                    //significa que ya no hay más modificaciones en las tablas de los routers de la topología
                                                        //Se puede dar como concluida la compartición de RIP v2
    }
}