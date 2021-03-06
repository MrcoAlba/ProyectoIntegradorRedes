package paquete.clases;

public class Interfaz {
    public String red, ip, mascara, nombre;
    // String red ->        Creada con la finalidad de guardar la red de la ip que posee la interfaz.                       Ejm: red *192.168.1.0*
    // String ip ->         Creada con la finalidad de guardar la ip perteneciente a la interfaz con respecto a su red.     Ejm: ip *192.168.1.1*
    // String mascara ->    Creada con la finalidad de guardar la máscara de ip según corresponda.                          Ejm: mascara de red *255.255.255.0*
    // String nombre ->     Creada con la finalidad de guardar el nombre de la interfaz.                                    Ejm: red de nombre = *gig0/1*
    
    
    
    //Se crea un método constructor.
    public Interfaz(String red, String ip, String mascara, String nombre) {
        this.red        = red       ;
        this.ip         = ip        ;
        this.mascara    = mascara   ;
        this.nombre     = nombre    ;
    }
    
    
    
    //Se crean los getters y setters de la clase Interfaz que luego serán UTILIZADOS SOLO en la clase Router
    public String   getRed() {
        return red;
    }
    public void     setRed(String red) {
        this.red = red;
    }
    public String   getIp() {
        return ip;
    }
    public void     setIp(String ip) {
        this.ip = ip;
    }
    public String   getMascara() {
        return mascara;
    }
    public void     setMascara(String mascara) {
        this.mascara = mascara;
    }
    public String   getNombre() {
        return nombre;
    }
    public void     setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    @Override
    public String toString() {
        return 
                "\n\tred=\t\t"      + red       + 
                "\n\tip=\t\t"       + ip        + 
                "\n\tmascara=\t"    + mascara   + 
                "\n\tnombre=\t\t"   + nombre    +
                "\n"                            ;
    }
}
