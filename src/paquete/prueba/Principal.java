package paquete.prueba;

import paquete.clases.*;
import paquete.gestion.*;
/**
 *
 * @author USER
 */
public class Principal {
    public static void main(String[] args) {
        
        Interfaz R1I1 = new Interfaz("10.0.0.0", "10.0.0.2", "255.0.0.0", "R1I1N1");
        Interfaz R1I2 = new Interfaz("20.0.0.0", "20.0.0.1", "255.0.0.0", "R1I2N2");
        
        Interfaz R2I1 = new Interfaz("10.0.0.0", "10.0.0.1", "255.0.0.0", "R2I1N1");
        Interfaz R2I2 = new Interfaz("14.0.0.0", "14.0.0.1", "255.0.0.0", "R2I2N2");
        
        Interfaz R3I1 = new Interfaz("14.0.0.0", "14.0.0.2", "255.0.0.0", "R3I1N1");
        Interfaz R3I2 = new Interfaz("22.0.0.0", "22.0.0.2", "255.0.0.0", "R3I2N2");
        
        Interfaz R4I1 = new Interfaz("22.0.0.0", "22.0.0.1", "255.0.0.0", "R4I1N1");
        Interfaz R4I2 = new Interfaz("20.0.0.0", "20.0.0.2", "255.0.0.0", "R4I2N2");
        
        Router R1 = new Router("A");
        Router R2 = new Router("B");
        Router R3 = new Router("C");
        Router R4 = new Router("D");
        
        
        
        
        
        R1.Adicionar(R1I1);
        R1.Adicionar(R1I2);
        R1.GenerarIpsPropiasyRedesVecinas();
        R1.InicializarTablaDeRuteo();
        
        R2.Adicionar(R2I1);
        R2.Adicionar(R2I2);
        R2.GenerarIpsPropiasyRedesVecinas();
        R2.InicializarTablaDeRuteo();
        
        R3.Adicionar(R3I1);
        R3.Adicionar(R3I2);
        R3.GenerarIpsPropiasyRedesVecinas();
        R3.InicializarTablaDeRuteo();
        
        R4.Adicionar(R4I1);
        R4.Adicionar(R4I2);
        R4.GenerarIpsPropiasyRedesVecinas();
        R4.InicializarTablaDeRuteo();
        
        
        
        
        
        GestionRedes GR1 = new GestionRedes();
        
        GR1.IngresarRouter(R1);
        GR1.IngresarRouter(R2);
        GR1.IngresarRouter(R3);
        GR1.IngresarRouter(R4);
        
        
        //GR1.IntercambioTablasRouteo();
        
        
        
        
        
        System.out.println(GR1.getArreglo()[0].toString());
        System.out.println(GR1.getArreglo()[1].toString());
        System.out.println(GR1.getArreglo()[2].toString());
        System.out.println(GR1.getArreglo()[3].toString());
        
    }
}
