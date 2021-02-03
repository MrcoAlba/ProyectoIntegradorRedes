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
    public GestionRedes(int cont) {
        arreglo = new Router[50];   //Se establecen 50 routers como maximo, a pesar de que el algoritmo solo sería eficiente hasta el router 15 (Explicacion Teoria).
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
        if(cont<50){
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
    
    
    
    public void BusquedaRedR (){
        int pos,confl,conRR,rec;
        boolean conx=false;
        conRR=0;
        confl=0;
        pos=0;
        
        for(int i=0;i<cont;i++){                                                                                //Se recorren todos los router en el arreglo con variable i
            for (int j = 0; j < cont; j++) {                                                                    //Se recorrerá todos los routers en el arreglo con variable j
                if(i!=j){                                                                                       //Siempre que no sea el mismo router
                    for (int k = 0; k < arreglo[i].getContRedesV(); k++) {                                      //Se recorrerá el arreglo->Router->*contador de redes* del router con variable i
                        for (int ki = 0; ki < arreglo[j].getContRedesV(); ki++) {                               //Se recorrerá el arreglo->Router->*contador de redes* del router con variable j
                            if(arreglo[i].RedesV[k].equalsIgnoreCase(arreglo[j].RedesV[ki])){                   //Si el Router[i]->RedVecina[k] es igual al del Router[j]->RedVecina[ki]                                                                                                      
                                if(ki==(arreglo[j].getContRedesV()-1)){                                        //Si pos (# red vecina del segundo router) es igual al numero de redes vecinas del mismo router -1
                                    pos=-1;                                                                     //Se almacenará -1 en pos
                                }else if(ki==0){
                                    pos=-2;
                                }else{
                                    pos=ki; 
                                }
                                conx=true;                                                                      //será un booleano que informe que el router "i" y el router "j", tiene redVecina igual
                            }
                        }
                    }
                    if (conx==true){                                                                            //Solo entraran el router "i" y "j" que tengan una red en común.
                        rec=0;                                                                                  //Se reinicia variable "rec" a 0.
                        if (pos!=-1){                                                                           //Si la red encontrada similar en "j" con "i" es la penúltima...
                            for (int k = arreglo[i].contRedesR; k < arreglo[j].getContRedesV()-1; k++) {        //Se comenzará en ("contador de redes remotas del router "i""), hasta el ("contador de redes vecinas de "j"-1")
                                arreglo[i].RedesR[k]=arreglo[j].RedesV[rec];                                    //Se comenzará a añadir las redes vecinas del router "j" en el router "i" 
                                arreglo[i].hopR[k]=2;                                                           //Se establece el hop como 2 debido a que son vecinas de sus vecinas.
                                rec++;                                                                          //aumenta contador 
                            }
                        }else if (pos!=-2){                                                                           
                            for (int k = 1; k < arreglo[j].getContRedesV(); k++) {        
                                arreglo[i].RedesR[k]=arreglo[j].RedesV[rec];                                    
                                arreglo[i].hopR[k]=2;                                                           
                                rec++;                                                                          
                            }
                        }else{
                            for (int k = arreglo[i].contRedesR; k < pos; k++) {
                                arreglo[i].RedesR[k]=arreglo[j].RedesV[rec];
                                arreglo[i].hopR[k]=2;
                                rec++;
                            }
                            for (int k = arreglo[i].contRedesR+rec-1; k < arreglo[j].getContRedesV(); k++) {
                                arreglo[i].RedesR[k]=arreglo[j].RedesV[rec+1];
                                arreglo[i].hopR[k]=2;
                                rec++;
                            }
                        }
                    }
                }
            }
        }
    }
    
}
