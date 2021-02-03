
package paquete.gestion;

import java.util.Random;
import javax.swing.JOptionPane;
import paquete.clases.*;

public class GestionRedes {
    private Router[] arreglo;
    private int cont;

    public GestionRedes(int cont) {
        arreglo = new Router[50];
        cont=0;
    }

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
    
    public void IngresarRouter(Router obj)
    {
        if(cont<300)
        {
            arreglo[cont]=obj;
            cont++;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No existe espacio para mas routers");
        }
    }
    
    public void EliminarPorNick(String nick)
    {
        int conf;
        conf=cont;
        for(int i=0;i<cont;i++)
        {
            if(arreglo[i].getNickname().equalsIgnoreCase(nick))
            {
                for(int j=i;j<cont-1;j++)
                {
                    arreglo[j]=arreglo[j+1];
                }
                arreglo[cont]=null;
                cont--;
            }
        }
        if (conf==cont){
            JOptionPane.showMessageDialog(null, "No existe el router");
        }else{
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente el router");
        }
    }
    
    public void BusquedaRedR (){
        int pos,confl,conRR,rec;
        boolean conx=false;
        conRR=0;
        confl=0;
        pos=0;
        for(int i=0;i<cont;i++){
            for (int j = 0; j < cont; j++) {
                if(arreglo[i].getNickname().equalsIgnoreCase(arreglo[j].getNickname())==false){
                    for (int k = 0; k < arreglo[i].getContRedesV(); k++) {
                        for (int ki = 0; ki < arreglo[j].getContRedesV(); ki++) {
                            if(arreglo[i].RedesV[k].equalsIgnoreCase(arreglo[j].RedesV[ki])){
                                pos=ki;
                                if(pos==(arreglo[j].getContRedesV()-1)){
                                    pos=-1;
                                }
                                conx=true;
                            }
                        }
                    }
                    if (conx==true){
                        rec=0;
                        if (pos!=-1){
                            for (int k = arreglo[i].contRedesR; k < arreglo[j].getContRedesV()-1; k++) {
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
