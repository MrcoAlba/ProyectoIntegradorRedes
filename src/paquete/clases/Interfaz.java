
package paquete.clases;

public class Interfaz {
    public String red, ip, mascara, nombre;

    public Interfaz(String red, String ip, String mascara, String nombre) {
        this.red = red;
        this.ip = ip;
        this.mascara = mascara;
        this.nombre = nombre;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
