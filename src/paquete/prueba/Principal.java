package paquete.prueba;

import paquete.clases.*;
import paquete.gestion.*;
/**
 *
 * @author USER
 */
public class Principal {
    public static void main(String[] args) {
        
        //PRIMERA TOPOLOGÍA EN NIVEL DE COMPLEJIDAD
        
        
        
                    // CREACIÓN DE INTERFACES
        Interfaz RAI1 = new Interfaz("10.0.0.0", "10.0.0.2", "255.0.0.0", "Gig0/0");
        Interfaz RAI2 = new Interfaz("16.0.0.0", "16.0.0.1", "255.0.0.0", "Gig0/1");
        Interfaz RAI3 = new Interfaz("20.0.0.0", "20.0.0.1", "255.0.0.0", "Gig0/2");
        
        Interfaz RBI1 = new Interfaz("10.0.0.0", "10.0.0.1", "255.0.0.0", "Gig0/0");
        Interfaz RBI2 = new Interfaz("12.0.0.0", "12.0.0.1", "255.0.0.0", "Gig0/1");
        Interfaz RBI3 = new Interfaz("14.0.0.0", "14.0.0.1", "255.0.0.0", "Gig0/2");
        
        Interfaz RCI1 = new Interfaz("14.0.0.0", "14.0.0.2", "255.0.0.0", "Gig0/0/0");
        Interfaz RCI2 = new Interfaz("22.0.0.0", "22.0.0.2", "255.0.0.0", "Gig0/0/1");
        
        Interfaz RDI1 = new Interfaz("20.0.0.0", "20.0.0.2", "255.0.0.0", "Gig0/0/0");
        Interfaz RDI2 = new Interfaz("22.0.0.0", "22.0.0.1", "255.0.0.0", "Gig0/0/1");
        
        Interfaz REI1 = new Interfaz("12.0.0.0", "12.0.0.2", "255.0.0.0", "Gig0/0");
        Interfaz REI2 = new Interfaz("16.0.0.0", "16.0.0.2", "255.0.0.0", "Gig0/1");
        Interfaz REI3 = new Interfaz("18.0.0.0", "18.0.0.1", "255.0.0.0", "Gig0/2");
        
        Interfaz RFI1 = new Interfaz("18.0.0.0", "18.0.0.2", "255.0.0.0", "Gig0/0/0");
        
        
        
                    // CREACIÓN DE ROUTERS
        Router RA = new Router("A");
        Router RB = new Router("B");
        Router RC = new Router("C");
        Router RD = new Router("D");
        Router RE = new Router("E");
        Router RF = new Router("F");
        
        
        
                    // INGRESO DE INTERFACES A ROUTERS Y CREACIÓN DE TABLA DE ROUTEO
        RA.Adicionar(RAI1);
        RA.Adicionar(RAI2);
        RA.Adicionar(RAI3);
        
        RB.Adicionar(RBI1);
        RB.Adicionar(RBI2);
        RB.Adicionar(RBI3);
        
        RC.Adicionar(RCI1);
        RC.Adicionar(RCI2);
        
        RD.Adicionar(RDI1);
        RD.Adicionar(RDI2);
        
        RE.Adicionar(REI1);
        RE.Adicionar(REI2);
        RE.Adicionar(REI3);
        
        RF.Adicionar(RFI1);
        
        
        
        
        
        
                    // CREACIÓN DE GESTIÓN DE REDES
        GestionRedes GR1 = new GestionRedes();
        
        
        
                    // INGRESO DE ROUTERS A GESTIÓN
        GR1.IngresarRouter(RA);
        GR1.IngresarRouter(RB);
        GR1.IngresarRouter(RC);
        GR1.IngresarRouter(RD);
        GR1.IngresarRouter(RE);
        GR1.IngresarRouter(RF);
        
        
        
                    // LOS ROUTERS INGRESADOS A GESTIÓN INTERCAMBIAN TODAS SUS TABLAS DE ROUTEO Y SE TERMINA RIP.v2
        GR1.IntercambioTablasRouteo();
        
        
        
        
        
        System.out.println(GR1.getArreglo()[0].toString());
        System.out.println(GR1.getArreglo()[1].toString());
        System.out.println(GR1.getArreglo()[2].toString());
        System.out.println(GR1.getArreglo()[3].toString());
        System.out.println(GR1.getArreglo()[4].toString());
        System.out.println(GR1.getArreglo()[5].toString());
        
    }
}
