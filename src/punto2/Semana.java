
package punto2;
import java.util.ArrayList;

public class Semana {
    private int numero;
    private Dia dia1, dia2, dia3, dia4;

    public Semana(int numero, Dia dia1, Dia dia2, Dia dia3, Dia dia4) {
        this.numero = numero;
        this.dia1 = dia1;
        this.dia2 = dia2;
        this.dia3 = dia3;
        this.dia4 = dia4;
    }

   
   /*public CalcularSegmentosLibres(){
        return ArrayList<Segmento>;
    }*/
    public int getNumero() {
        return numero;
    }
    
    
}
