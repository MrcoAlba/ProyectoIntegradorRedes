package paquete.clases;

import java.util.ArrayList;
import java.io.*; 
import java.util.*;

public class Router{
    public ArrayList<Interfaz> interfaces;
    public String nickname;
    public String [] IpsPropias;
    
    public String [] RedesVecinas;
    public String [] RedesRemotas;
    public int contRedesV=0;
    public int contRedesR=0;
    
    public String [] IpsV;
    public String [] IpsR;
    public int contIpsV=0;
    public int contIpsR=0;
    public int [] IpsHopV;
    public int [] IpsHopR;
    // ArrayList<Interfaz> interfaces -> Creada con la finalidad de almacenar un numero variable de interfaces por router.
    // int contRedesV=0 -> Creado con la finalidad de contar el numero de redes VECINAS que tiene el router. Se establece 0 y aumenta al añadir una interfaz.
    // int contRedesR=0 -> Creado con la finalidad de contar el numero de redes REMOTAS que tiene el router. El número aumenta en la clase gestion.
    // String nickname -> Creada con la finalidad de tener un pseudonido del router. Ejms: R1, R2, ...
    // String [] IpsV -> Creada con la finalidad de almacenar las redes VECINAS existentes en la topologia.
    // String [] IpsR -> Creada con la finalidad de almacenar las redes REMOTAS existentes en la topologia.
    // int [] IpsHopV -> Creado con la finalidad de saber cuantos saltos (hops) se necesita dar para llegar a la red VECINA. Siempre es uno por teoria.
    // int [] IpsHopR -> Creado con la finalidad de saber cuantos saltos (hops) se necesita dar para llegar a una red REMOTA. El numero es variable y se genera en la clase GestionRedes.
    
    
    //Se crea un metodo constructor.
    public Router(String nickname) {
        this.nickname = nickname;
        IpsPropias = new String[100];
        RedesVecinas = new String[100];      //Se establece el numero de redes vecinas de 100 a pesar de que los routers solo ofrezcan un maximo de 3 interfaces de conexion.
        RedesRemotas = new String[100];      //Se establece el numero de redes remotas a 100, a pesar de que el algoritmo Vector-Distancia (aplicado en RIPv2) no permita mas de 15 nodos por topologia.
        IpsV = new String[100];              //Se establece el numero de Ips vecinas de 100 a pesar de que los routers solo ofrezcan un maximo de 3 interfaces de conexion.
        IpsR = new String[100];              //Se establece el numero de Ips remotas a 100, a pesar de que el algoritmo Vector-Distancia (aplicado en RIPv2) no permita mas de 15 nodos por topologia.
        IpsHopV = new int[100];              //Se establece un arreglo de 100 debido a la explicación previa
        IpsHopR = new int[100];              //Se establece un arreglo de 100 debido a la explicación previa
        interfaces = new ArrayList<Interfaz>();
    }
    
    
    //Se establecen los gettes y settes de la clase.
    public String   getNickname() {
        return nickname;
    }
    public void     setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String[] getIpsV() {
        return IpsV;
    }
    public void     setIpsV(String[] IpsV) {
        this.IpsV = IpsV;
    }
    public String[] getIpsR() {
        return IpsR;
    }
    public void     setRedes(String[] RedesR) {
        this.IpsR = RedesR;
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
    public int[]    getIpsHopV() {
        return IpsHopV;
    }
    public void     setIpsHopV(int[] IpsHopV) {
        this.IpsHopV = IpsHopV;
    }
    public int[]    getIpsHopR() {
        return IpsHopR;
    }
    public void     setIpsHopR(int[] IpsHopR) {
        this.IpsHopR = IpsHopR;
    }
    public ArrayList<Interfaz> getInterfaces() {
        return interfaces;
    }
    public void     setInterfaces(ArrayList<Interfaz> interfaces) {
        this.interfaces = interfaces;
    }
    public String[] getRedesVecinas() {
        return RedesVecinas;
    }
    public void     setRedesVecinas(String[] RedesVecinas) {
        this.RedesVecinas = RedesVecinas;
    }
    public String[] getRedesRemotas() {
        return RedesRemotas;
    }
    public void     setRedesRemotas(String[] RedesRemotas) {
        this.RedesRemotas = RedesRemotas;
    }
    public int      getContIpsV() {
        return contIpsV;
    }
    public void     setContIpsV(int contIpsV) {
        this.contIpsV = contIpsV;
    }
    public int      getContIpsR() {
        return contIpsR;
    }
    public void     setContIpsR(int contIpsR) {
        this.contIpsR = contIpsR;
    }
    public String[] getIpsPropias() {
        return IpsPropias;
    }
    public void setIpsPropias(String[] IpsPropias) {
        this.IpsPropias = IpsPropias;
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
            RedesVecinas[i]=a.getRed();                                 //Se guardará los datos de *red* de la interfaz en el *arreglo de redes vecinas*.
            IpsPropias[i]=a.getIp();
            i++;                                                        //Se aumentará el contador para almacenar los siguientes datos en el siguiente espacio de IpsV y IpsHopV
        }
        this.contRedesV=i;
    }

    @Override
    public String toString() {
        return
                "\n\ninterfaces=" + interfaces.toString() + 
                "\n\nnickname=" + nickname + 
                "\n\nIpsPropias=" + Arrays.toString(IpsPropias) + 
                "\n\nRedesVecinas=" + Arrays.toString(RedesVecinas) + 
                "\n\nRedesRemotas=" + Arrays.toString(RedesRemotas) + 
                "\n\ncontRedesV=" + contRedesV + 
                "\n\ncontRedesR=" + contRedesR + 
                "\n\nIpsV=" + Arrays.toString(IpsV) + 
                "\n\nIpsR=" + Arrays.toString(IpsR) + 
                "\n\ncontIpsV=" + contIpsV + 
                "\n\ncontIpsR=" + contIpsR + 
                "\n\nIpsHopV=" + Arrays.toString(IpsHopV) + 
                "\n\nIpsHopR=" + Arrays.toString(IpsHopR) ;
    }
    
    
    
    
    
    
    
}
