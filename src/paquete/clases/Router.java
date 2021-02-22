package paquete.clases;

import java.util.ArrayList;
import java.io.*; 
import java.util.*;

public class Router{
    
    public ArrayList<Interfaz> interfaces;
    public String nickname;
    
    public String [] IpsPropias;
    public String [] RedesVecinas;
    public int contRedesV=0;
    
    public String [] RTip;
    public String [] RTred;
    public String [] RTnombreRouter;
    public String [] RTinterfazSalida;
    public String [] RTnextHop;
    public int [] RThop;
    public int RTcontIngresados=0;
    
    
    // ArrayList<Interfaz> interfaces -> Creada con la finalidad de almacenar un numero variable de interfaces por router.
    // String nickname -> Creada con la finalidad de tener un pseudonimo del router. Ejms: R1, R2, ...
    
    
    
    
    //Se crea un metodo constructor.
    public Router(String nickname) {
        this.nickname = nickname;
        IpsPropias          = new String[3];
        RedesVecinas        = new String[3];                //MÁXIMA CANTIDAD DE RESDES QUE SE PUEDEN INGRESAR EN CISCO PACKET TRACER: 3
        interfaces          = new ArrayList<Interfaz>();
        
        RTip                = new String[50];
        RTred               = new String[50];
        RTnombreRouter      = new String[50];               //COMO MAXIMO EN LAS TOPOLOGIAS QUE IMPLEMENTAN RIP PUEDEN HABER HASTA 45 GATEWAYS
        RTinterfazSalida    = new String[50];
        RTnextHop           = new String[50];
        RThop               = new int[50];
    }
    
    
    //Se establecen los gettes y settes de la clase.
    public String   getNickname() {
        return nickname;
    }
    public void     setNickname(String nickname) {
        this.nickname = nickname;
    }
    public int      getContRedesV() {
        return contRedesV;
    }
    public void     setContRedesV(int contRedesV) {
        this.contRedesV = contRedesV;
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
    public String[] getIpsPropias() {
        return IpsPropias;
    }
    public void     setIpsPropias(String[] IpsPropias) {
        this.IpsPropias = IpsPropias;
    }

    public String[] getRTip() {
        return RTip;
    }
    public void     setRTip(String[] RTip) {
        this.RTip = RTip;
    }
    public String[] getRTred() {
        return RTred;
    }
    public void     setRTred(String[] RTred) {
        this.RTred = RTred;
    }
    public String[] getRTnombreRouter() {
        return RTnombreRouter;
    }
    public void     setRTnombreRouter(String[] RTnombreRouter) {
        this.RTnombreRouter = RTnombreRouter;
    }
    public String[] getRTinterfazSalida() {
        return RTinterfazSalida;
    }
    public void     setRTinterfazSalida(String[] RTinterfazSalida) {
        this.RTinterfazSalida = RTinterfazSalida;
    }
    public String[] getRTnextHop() {
        return RTnextHop;
    }
    public void     setRTnextHop(String[] RTnextHop) {
        this.RTnextHop = RTnextHop;
    }
    public int[]    getRThop() {
        return RThop;
    }
    public void     setRThop(int[] RThop) {
        this.RThop = RThop;
    }
    public int      getRTcontIngresados() {
        return RTcontIngresados;
    }
    public void     setRTcontIngresados(int RTcontIngresados) {
        this.RTcontIngresados = RTcontIngresados;
    }
    
    
    
    //Se incluye el metodo Adicionar para agregar objetos de la clase Interfaz
    public void Adicionar(Interfaz obj)
    {
        interfaces.add(obj);
    }
    
    
    
    //Se incluye el metodo GenerarIpsPropiasyRedesVecinas que sigue el siguiente algoritmo:
    public void GenerarIpsPropiasyRedesVecinas()
    {
        int i=0;                                                        //Se establece un contador que inicia en 0
        Iterator<Interfaz> puntero = interfaces.iterator();             //Se crea un iterador que recorrerá todo el arreglo
        while(puntero.hasNext()){                                       //Mientras hayan redes en el arreglo (recordar que las redes fueron agregadas arriba)
            Interfaz a = puntero.next();                                //Se almacenaran los datos de la interfaz almacenada en una variable de tipo Interfaz
            RedesVecinas[i]=a.getRed();                                 //Se guardará los datos de *red* de la interfaz en el *arreglo de redes vecinas*.
            IpsPropias[i]=a.getIp();
            i++;                                                        //Se aumentará el contador para almacenar los siguientes datos en el siguiente espacio de IpsV y IpsHopV
        }
        this.contRedesV=i;
    }
    
    public void InicializarTablaDeRuteo(){
        for (int i = 0; i < contRedesV; i++) {
            this.RTip[i] = this.IpsPropias[i];
            this.RTred[i] = this.RedesVecinas[i];
            this.RTnombreRouter[i] = this.nickname;
            this.RTinterfazSalida[i] = this.IpsPropias[i];
            this.RTnextHop[i] = this.IpsPropias[i];
            this.RThop[i] = 0;
            this.RTcontIngresados++;
        }
    }
    
    
    
    
    @Override
    public String toString() {
        return 
                "\n------------------------------------------------------"+
                "\n\t\tROUTER:"             + nickname                          +
                "\n\nNickname="             + nickname                          + 
                "\n\nInterfaces="           + interfaces.toString()             + 
                "\n\nIpsPropias=\t"         + Arrays.toString(IpsPropias)       + 
                "\nRedesVecinas=\t"         + Arrays.toString(RedesVecinas)     + 
                "\nContRedesV=\t"           + contRedesV                        +
                "\n\nRTip=\t\t\t"           + Arrays.toString(RTip)             + 
                "\n\nRTred=\t\t\t"          + Arrays.toString(RTred)            + 
                "\n\nRTnombreRouter=\t\t"   + Arrays.toString(RTnombreRouter)   + 
                "\n\nRTinterfazSalida=\t"   + Arrays.toString(RTinterfazSalida) + 
                "\n\nRTnextHop=\t\t"        + Arrays.toString(RTnextHop)        + 
                "\n\nRThop=\t\t\t"          + Arrays.toString(RThop)            +
                "\n\nIpsIngresadas=\t\t"  + RTcontIngresados                  +
                "\n------------------------------------------------------\n\n";
    }
    
    
    
    
    
    
    
    
    
}
