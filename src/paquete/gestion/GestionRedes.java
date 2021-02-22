package paquete.gestion;

import java.util.Random;        //Se importa para utilizar la clase Ramdon.
import javax.swing.JOptionPane; //Se importa para poder mostrar ventanas emergentes que se utilizará en el futuro (JFrame Form).
import paquete.clases.*;        //Se importa el paquete clases para hacer uso de las clases creadas.

public class GestionRedes {
    private Router[] arreglo;
    private int cont;
    //Router[] arreglo -> Se crea un arreglo llamado "arreglo" en el que se almacenará objetos de tipo "Router"
    //int cont -> Se creará un contador "cont" que almacenará la el número de routers agregados al arreglo "arreglo"
    
    
    //Se crea el metodo constructor de la clase.
    public GestionRedes() {
        arreglo = new Router[20];   //Se establecen 20 routers como maximo, a pesar de que el algoritmo solo sería eficiente hasta el router 15 (Explicacion Teoria).
        cont=0;                     //Se inicial el objeto con el contador a 0 siempre.
    }
    
    
    //Se crean los metodos getters y setters de la clase.
    public Router[] getArreglo() {
        return arreglo;
    }
    public void setArreglo(Router[] arreglo) {
        this.arreglo = arreglo;
    }
    public int getCont() {
        return cont;
    }
    public void setCont(int cont) {
        this.cont = cont;
    }
    
    
    //Se crea el metodo IngresarRouter, en el que se agregará un router al arreglo "arreglo" siempre y cuando el contador "cont" sea menor a 50.
    public void IngresarRouter(Router obj)
    {
        if(cont<20){
            arreglo[cont]=obj;
            cont++;
        }else{       //Si la condición no se cumple, una ventana emergente informará que no existe más espacio para almacenar otro router.
            JOptionPane.showMessageDialog(null, "No existe espacio para mas routers");
        }
    }
    
    
    //Se eliminará un router por medio de: Ingreso de una variable String con el nickname a eliminar.
    public void EliminarPorNick(String nick)
    {
        int conf;                                               //Se crea una variable "conf" que almacenará el mismo valor que tiene el contador "cont" (solo se usa en el condicional final)
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
    
    
    public void IntercambioTablasRouteo (){
        
        boolean AK=false;
        
        int auxEmisor=0;
        int auxReceptor=0;
        String auxInterfazSalida="";
        String auxNextHop="";
        
        boolean compartenRedVecina=false;
        
        boolean encontro=false;
        int auxPosicionEmisor;
        int auxPosicionReceptor;
        
        int aux10=0;
        
        
        do {
            AK=false;
            
            for (int i = 0; i < cont; i++) {                //ESTE ES EL ORDEN DEL ROUTER QUE ENVIARA SU TABLA DE ROUTEO
                for (int j = 0; j < cont; j++) {            //ESTE ES EL ORDEN DEL ROUTER QUE RECIBIRA LA TABLA DE ROUTEO Y DECIDIRA SI QUIERE COPIAR O CAMBIAR ALGO
                    
                    if (i!=j) {
                        
                        compartenRedVecina=false;
                        
                        for (int k = 0; k < this.arreglo[i].contRedesV; k++) {
                            for (int l = 0; l < this.arreglo[j].contRedesV; l++) {
                                if(this.arreglo[i].RedesVecinas[k].equalsIgnoreCase(this.arreglo[j].RedesVecinas[l])){
                                    compartenRedVecina=true;
                                    auxEmisor=k;
                                    auxReceptor=l;
                                    auxInterfazSalida=this.arreglo[j].IpsPropias[l];
                                    auxNextHop=this.arreglo[i].IpsPropias[k];
                                }
                            }
                        }
                        
                        if(compartenRedVecina==true){
                            for (int k = 0; k < this.arreglo[i].RTcontIngresados; k++) {
                                encontro = false;
                                for (int l = 0; l < this.arreglo[j].RTcontIngresados; l++) {

                                    if(this.arreglo[i].RTip[k].equalsIgnoreCase(this.arreglo[j].RTip[l])){

                                        if(this.arreglo[i].RThop[k]<this.arreglo[j].RThop[l]-1){
                                            this.arreglo[j].RTinterfazSalida[l] = auxInterfazSalida;
                                            this.arreglo[j].RTnextHop[l]        = auxNextHop;
                                            this.arreglo[j].RThop[l]            = this.arreglo[i].RThop[k]+1;
                                            AK=true;
                                        }
                                        encontro = true;
                                    }
                                }
                                if(encontro==false){
                                    aux10=this.arreglo[j].RTcontIngresados;
                                    this.arreglo[j].RTip[aux10]             = this.arreglo[i].RTip[k];
                                    this.arreglo[j].RTred[aux10]            = this.arreglo[i].RTred[k];
                                    this.arreglo[j].RTnombreRouter[aux10]   = this.arreglo[i].RTnombreRouter[k];
                                    this.arreglo[j].RTinterfazSalida[aux10] = auxInterfazSalida;
                                    this.arreglo[j].RTnextHop[aux10]        = auxNextHop;
                                    this.arreglo[j].RThop[aux10]            = this.arreglo[i].RThop[k]+1;
                                    this.arreglo[j].RTcontIngresados++;
                                    AK=true;
                                }
                            }
                        }
                    }
                }
            }
        } while (AK==true);
        
    }
    
}