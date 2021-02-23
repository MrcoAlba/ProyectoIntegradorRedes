package paquete.clases;

import java.util.ArrayList;     //Importado con la finalidad de utilizar los métodos para crear objetos del tipo ArrayList<E> y iterator.
import java.io.*; 
import java.util.*;

public class Router{
    
    //                                                      DECLARACIÓN DE ATRIBUTOS
    
    public ArrayList<Interfaz>  interfaces;         //Almacenará todas las interfaces pertenecientes al router
    public String               nickname;           //Pseudonico del router.
    
    public String []            IpsPropias;         //Almacenará las Ips de las interfaces que tenga el router.
    public String []            RedesVecinas;       //Almacenará las redes de las IpsPropias
    public String []            InterfacesPropias;  //Almacenará los nombres de las interfaces propias al router
    public int                  contRedesV=0;       //Tendrá el número de IpsPropias y RedesVecinas (siempre debe ser igual)
    
                                                    //¡¡¡CUANDO UN ATRIBUTO TENGA DE INICIAL "RT" SIGNIFICA QUE IRÁ EN LA TABLA DE ROUTEO!!!
                                                    //Los primeros datos que se agreguen a la tabla de routeo serán el mismo número de elementos que hay en contRedesV y serán los datos de las IpsPropias
    public String []            RTip;               //Almacenara todas las Ips (gateways)       que hayan en la topología 
    public String []            RTred;              //Almacenara todas las redes                que hayan en la topología       según la Ip
    public String []            RTnombreRouter;     //Almacenara todos los nombres de router    que hayan en la topología       según la Ip
    public String []            RTnombreSalida;     //Almacenara todos los nombres de salidas   que hayan en la topología       según la Ip
    public String []            RTinterfazSalida;   //Almacenara todas las interfaces de salida que hayan en la topología       según la Ip
    public String []            RTnextHop;          //Almacenara todos los nextHop              que hayan en la topología       según la Ip
    public int []               RThop;              //Almacenara todos los hops                 que hayan en la topología       según la Ip
    public int                  RTcontIngresados=0; //Almacenara el número de datos de la tabla de routeo en tiempo real 
    
    
    
    
    
    //                                                      CREACIÓN DE MÉTODOS BÁSICOS .1
    
    //Se recomienda darle al boton de [-] a todos los métodos dentro de esta sección.
    
    //Se crea un metodo constructor.
    public Router(String nickname) {                //RECORDAR QUE LOS NÚMERO INGRESADOS EN LOS ARREGLOS EN ESTA SECCIÓN SON VARIABLES SEGÚN SE DESEE ESCALAR EL ALGORITMO.
        this.nickname = nickname;
        IpsPropias          =   new String[3];      //MÁXIMA CANTIDAD DE GATEWAYS   QUE SE PUEDEN INGRESAR (pertenecientes a un router) EN CISCO PACKET TRACER: 3
        RedesVecinas        =   new String[3];      //MÁXIMA CANTIDAD DE RESDES     QUE SE PUEDEN INGRESAR (pertenecientes a un router) EN CISCO PACKET TRACER: 3
        InterfacesPropias   =   new String[3];      //MÁXIMA CANTIDAD DE INTERFACES QUE SE PUEDEN INGRESAR (pertenecientes a un router) EN CISCO PACKET TRACER: 3
        interfaces          =   new ArrayList<Interfaz>();
        
        RTip                =   new String[50];     //EXPLICACIÓN DEL NÚMERO 50 EN ESTOS ARREGLOS.
        RTred               =   new String[50];     //LAS TOPOLOGÍAS CON RIP TIENEN LAS SIGUIENTES CARACTERÍSTICAS:
        RTnombreRouter      =   new String[50];     //MÁXIMA CANTIDAD DE NODOS:                 15 NODOS
        RTnombreSalida      =   new String[50];
        RTinterfazSalida    =   new String[50];     //MÁXIMA CANTIDAD DE INTERFAZ POR UN NODO:  3 INTERFACES (nos limita el software Cisco Packet Tracer)
        RTnextHop           =   new String[50];     //MÁXIMA CANTIDAD DE GATEWAYS: (15 NODOS) * (3 INTERFACES) = 45 GATEWAYS
        RThop               =   new int[50];        //!!SE INGRESAN 50 GATEWAYS SOLO PARA REDONDEAR EL NÚMERO.
    }
    
    
    
    //Se establecen los gettes y settes de la clase.
    public String               getNickname() {
        return nickname;
    }
    public void                 setNickname(String nickname) {
        this.nickname = nickname;
    }
    public int                  getContRedesV() {
        return contRedesV;
    }
    public void                 setContRedesV(int contRedesV) {
        this.contRedesV = contRedesV;
    }
    public ArrayList<Interfaz>  getInterfaces() {
        return interfaces;
    }
    public void                 setInterfaces(ArrayList<Interfaz> interfaces) {
        this.interfaces = interfaces;
    }
    public String[]             getRedesVecinas() {
        return RedesVecinas;
    }
    public void                 setRedesVecinas(String[] RedesVecinas) {
        this.RedesVecinas = RedesVecinas;
    }
    public String[]             getIpsPropias() {
        return IpsPropias;
    }
    public void                 setIpsPropias(String[] IpsPropias) {
        this.IpsPropias = IpsPropias;
    }
    public String[]             getRTip() {
        return RTip;
    }
    public void                 setRTip(String[] RTip) {
        this.RTip = RTip;
    }
    public String[]             getRTred() {
        return RTred;
    }
    public void                 setRTred(String[] RTred) {
        this.RTred = RTred;
    }
    public String[]             getRTnombreRouter() {
        return RTnombreRouter;
    }
    public void                 setRTnombreRouter(String[] RTnombreRouter) {
        this.RTnombreRouter = RTnombreRouter;
    }
    public String[]             getRTinterfazSalida() {
        return RTinterfazSalida;
    }
    public void                 setRTinterfazSalida(String[] RTinterfazSalida) {
        this.RTinterfazSalida = RTinterfazSalida;
    }
    public String[]             getRTnextHop() {
        return RTnextHop;
    }
    public void                 setRTnextHop(String[] RTnextHop) {
        this.RTnextHop = RTnextHop;
    }
    public int[]                getRThop() {
        return RThop;
    }
    public void                 setRThop(int[] RThop) {
        this.RThop = RThop;
    }
    public int                  getRTcontIngresados() {
        return RTcontIngresados;
    }
    public void                 setRTcontIngresados(int RTcontIngresados) {
        this.RTcontIngresados = RTcontIngresados;
    }
    public String[]             getInterfacesPropias() {
        return InterfacesPropias;
    }
    public void                 setInterfacesPropias(String[] InterfacesPropias) {
        this.InterfacesPropias = InterfacesPropias;
    }
    public String[]             getRTnombreSalida() {
        return RTnombreSalida;
    }
    public void                 setRTnombreSalida(String[] RTnombreSalida) {
        this.RTnombreSalida = RTnombreSalida;
    }
    
    
    
    
    
    //                                                      CREACIÓN DE MÉTODOS COMPLEJOS
    
    //Se incluye el metodo Adicionar para agregar objetos de la clase Interfaz
    public void Adicionar(Interfaz obj){
        interfaces.add(obj);
    }
    
    
    
    //Se incluye el metodo GenerarIpsPropiasyRedesVecinas que sirve para almacenar en el router las Ips que le pertenecen a sus gateways y las redes vecinas que tiene
    public void GenerarIpsPropiasyRedesVecinas()
    {
        int i=0;                                                        //Se establece un contador que inicia en 0 y nos dirá al final cuántas IpsPropias y RedesVecinas agregamos al router
        Iterator<Interfaz> puntero = interfaces.iterator();             //Se crea un iterador que recorrerá todo el arreglo de interfaces
        while(puntero.hasNext()){                                       //Mientras hayan redes en el arreglo (recordar que las redes fueron agregadas en el método Adicionar)
            Interfaz a              =   puntero.next();                 //Se almacenarán los datos de la interfaz siguiente en el objeto nuevo "a" de tipo Interfaz
            RedesVecinas[i]         =   a.getRed();                     //Se almacenaran los datos de la red            pertenecientes a la interfaz "a" en el arreglo RdesVecinas          del router
            IpsPropias[i]           =   a.getIp();                      //Se almacenaran los datos de la Ipv4           pertenecientes a la interfaz "a" en el arreglo IpsPropias           del router
            InterfacesPropias[i]    =   a.getNombre();                  //Se almacenaran los datos de nombre de red     pertenecientes a la interfaz "a" en el arreglo InterfacesPropias    del router
            i++;                                                        //Se aumentará el contador para almacenar los siguientes datos en el siguiente espacio de IpsV y IpsHopV
        }
        this.contRedesV=i;                                              //Se almacenara el número final de redes e ips agregadas al router (siempre son iguales por lo cual no hay problema que compartan dato)
    }
    
    
    
    //Se incluye el metodo InicializarTablaDeRuteo que sirve para comenzar a llenar la tabla de routeo solo con la información perteneciente al router (solo sus gateways)
    public void InicializarTablaDeRuteo(){
        for (int i = 0; i < contRedesV; i++) {                          //Gracias al método GenerarIpsPropiasyRedesVecinas habremos obtenido el número final de ipsPropias por lo cual daremos esa cantidad de vueltas y agregaremos los datos
            this.RTip[i]                = this.IpsPropias[i];           //se agrega la Ipv4 correspondiente del arreglo IpsPropias
            this.RTred[i]               = this.RedesVecinas[i];         //se agrega la red  correspondiente del arreglo RedesVecinas
            this.RTnombreRouter[i]      = this.nickname;                //se agrega el nickname del mismo router que está ejecutando este método
            this.RTnombreSalida[i]      = this.InterfacesPropias[i];    //se agrega la interfaz de salida perteneciente al router que está ejecutando el método
            this.RTinterfazSalida[i]    = this.IpsPropias[i];           //se agrega la misma Ipv4 que se agregó en RTip porque por esa interfaz se sale
            this.RTnextHop[i]           = this.IpsPropias[i];           //se agrega la misma Ipv4 que se agregó en RTip porque por esa interfaz se llega
            this.RThop[i]               = 0;                            //por teoría siempre que se salte a uno mismo equivale a 0 saltos
            this.RTcontIngresados++;                                    //Se incrementará la cantidad de rutas agregadas la tabla de routeo (al finalizar todas las vueltas debería quedar igual al contRedes)
        }
    }
    
    
    
    public String MostrarRT(String [] arreglito){
        String cadena="[ ";
        for (int i = 0; i < this.RTcontIngresados; i++) {
            cadena+=arreglito[i].toString()+"\t ; ";
        }
        cadena+="]";
        return cadena;
    }
    
    public String MostrarRTnumeros(String [] arreglito){
        String cadena="[ ";
        for (int i = 0; i < this.RTcontIngresados; i++) {
            cadena+=arreglito[i].toString()+"\t\t ; ";
        }
        cadena+="]";
        return cadena;
    }
    
    public String MostrarRTinteger(int [] arreglitoInteger){
        String cadena="[ ";
        for (int i = 0; i < this.RTcontIngresados; i++) {
            cadena+=arreglitoInteger[i]+"\t\t ; ";
        }
        cadena+="]";
        return cadena;
    }
    
    
    
    //                                                      CREACIÓN DE MÉTODOS BÁSICOS .2
    
    //Se incluye el método toString que no será utilizado en la versión final de programa debido a que se implementará una interfaz gráfica.
    public String toString() {
        return 
                "\n------------------------------------------------------"+
                "\n\t\tROUTER:"             + nickname                          +
                "\n\nNickname="             + nickname                          + 
                "\n\nInterfaces="           + interfaces.toString()             + 
                "\n\nIpsPropias=\t"         + Arrays.toString(IpsPropias)       + 
                "\nRedesVecinas=\t"         + Arrays.toString(RedesVecinas)     + 
                "\nContRedesV=\t"           + contRedesV                        +
                "\n\nRTip=\t\t\t"           + MostrarRT(RTip)                   + 
                "\n\nRTred=\t\t\t"          + MostrarRT(RTred)                  + 
                "\n\nRTnombreRouter=\t\t"   + MostrarRTnumeros(RTnombreRouter)  + 
                "\n\nRTnombreSalida=\t\t"   + MostrarRT(RTnombreSalida)         + 
                "\n\nRTinterfazSalida=\t"   + MostrarRT(RTinterfazSalida)       + 
                "\n\nRTnextHop=\t\t"        + MostrarRT(RTnextHop)              + 
                "\n\nRThop=\t\t\t"          + MostrarRTinteger(RThop)           +
                "\n\nIpsIngresadas=\t\t"  + RTcontIngresados                    +
                "\n------------------------------------------------------\n\n";
    }
}