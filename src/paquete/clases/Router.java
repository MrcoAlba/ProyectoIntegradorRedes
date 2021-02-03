
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

    public Router(String nickname) {
        this.nickname = nickname;
        RedesV = new String[10];
        RedesR = new String[30];
        hopV = new int[10];
        hopR = new int[30];
        interfaces = new ArrayList<Interfaz>();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String[] getRedesV() {
        return RedesV;
    }

    public void setRedesV(String[] RedesV) {
        this.RedesV = RedesV;
    }
    
    public String[] getRedesR() {
        return RedesR;
    }

    public void setRedes(String[] RedesR) {
        this.RedesR = RedesR;
    }
    
    public int getContRedesV() {
        return contRedesV;
    }

    public void setContRedesV(int contRedesV) {
        this.contRedesV = contRedesV;
    }
    
    public int getContRedesR() {
        return contRedesR;
    }

    public void setContRedesR(int contRedesR) {
        this.contRedesR = contRedesR;
    }
    
    public int[] getHopV() {
        return hopV;
    }

    public void setHopV(int[] hopV) {
        this.hopV = hopV;
    }

    public int[] getHopR() {
        return hopR;
    }

    public void setHopR(int[] hopR) {
        this.hopR = hopR;
    }
    
    public void Adicionar(Interfaz obj)
    {
        interfaces.add(obj);
    }
    
    public void GuardarRedes()
    {
        int i=0;
        Iterator<Interfaz> puntero = interfaces.iterator();
        while(puntero.hasNext())
        {
            Interfaz a = puntero.next();
            RedesV[i]=a.getRed();
            hopV[i]=1;
            i++;
        }
        this.contRedesV=i;
    }
}
