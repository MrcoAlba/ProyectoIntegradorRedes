
package paquete.clases;

import java.util.ArrayList;
import java.util.Iterator;

public class Router{
    public ArrayList<Interfaz> interfaces;
    public int contRedesV=0;
    public int contRedesR=0;
    public String nickname;
    public String [] RedesV;
    public String [] RedesR;
    public int [] hopV;
    public int [] hopR;
    // ArrayList<Interfaz> interfaces -> Creada con la finalidad de almacenar un numero variable de interfaces por router.
    // int contRedesV=0 -> Creado con la finalidad de contar el numero de redes VECINAS que tiene el router. Se establece 0 y aumenta al añadir una interfaz.
    // int contRedesR=0 -> Creado con la finalidad de contar el numero de redes REMOTAS que tiene el router. El número aumenta en la clase gestion.
    // String nickname -> Creada con la finalidad de tener un pseudonido del router. Ejms: R1, R2, ...
    // String [] RedesV -> Creada con la finalidad de almacenar las redes VECINAS existentes en la topologia.
    // String [] RedesR -> Creada con la finalidad de almacenar las redes REMOTAS existentes en la topologia.
    // int [] hopV -> Creado con la finalidad de saber cuantos saltos (hops) se necesita dar para llegar a la red VECINA. Siempre es uno por teoria.
    // int [] hopR -> Creado con la finalidad de saber cuantos saltos (hops) se necesita dar para llegar a una red REMOTA. El numero es variable y se genera en la clase GestionRedes.
    
    
    //Se crea un metodo constructor.
    public Router(String nickname) {
        this.nickname = nickname;
        RedesV = new String[10];    //Se establece el numero de redes vecinas de 10 a pesar de que los routers solo ofrezcan un maximo de 3 interfaces de conexion.
        RedesR = new String[30];    //Se establece el numero de redes remotas a 30, a pesar de que el algoritmo Vector-Distancia (aplicado en RIPv2) no permita mas de 15 nodos por topologia.
        hopV = new int[10];         //Se establece un arreglo de 10 debido a la explicación previa
        hopR = new int[30];         //Se establece un arreglo de 30 debido a la explicación previa
        interfaces = new ArrayList<Interfaz>();
    }
    
    
    //Se establecen los gettes y settes de la clase.
    public String   getNickname() {
        return nickname;
    }
    public void     setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String[] getRedesV() {
        return RedesV;
    }
    public void     setRedesV(String[] RedesV) {
        this.RedesV = RedesV;
    }
    public String[] getRedesR() {
        return RedesR;
    }
    public void     setRedes(String[] RedesR) {
        this.RedesR = RedesR;
    }
    public int      getContRedesV() {
        return contRedesV;
    }
    public void     setContRedesV(int contRedesV) {
        this.contRedesV = contRedesV;
    }
    public int      getContRedesR() {
        return contRedesR;
    }
    public void     setContRedesR(int contRedesR) {
        this.contRedesR = contRedesR;
    }
    public int[]    getHopV() {
        return hopV;
    }
    public void     setHopV(int[] hopV) {
        this.hopV = hopV;
    }
    public int[]    getHopR() {
        return hopR;
    }
    public void     setHopR(int[] hopR) {
        this.hopR = hopR;
    }
    
    
    //Se incluye el metodo Adicionar para agregar objetos de la clase Interfaz
    public void Adicionar(Interfaz obj)
    {
        interfaces.add(obj);
    }
    
    
    //Se incluye el metodo GuardarRedes que sigue el siguiente algoritmo:
    public void GuardarRedes()
    {
        int i=0;                                                        //Se establece un contador que inicia en 0
        Iterator<Interfaz> puntero = interfaces.iterator();             //Se crea un iterador que recorrerá todo el arreglo
        while(puntero.hasNext())                                        //Mientras hayan redes en el arreglo (recordar que las redes fueron agregadas arriba)
        {
            Interfaz a = puntero.next();                                //Se almacenaran los datos de la interfaz almacenada en una variable de tipo Interfaz
            RedesV[i]=a.getRed();                                       //Se guardará los datos de *red* de la interfaz en el *arreglo de redes vecinas*.
            hopV[i]=1;                                                  //Se establecerá 1 en todas las redes vecinas (Explicado por teoria de V-D)
            i++;                                                        //Se aumentará el contador para almacenar los siguientes datos en el siguiente espacio de RedesV y hopV
        }
        this.contRedesV=i;
    }
}
