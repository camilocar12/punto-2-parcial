
package punto2;

public class Programacion {
private String nombre;
private Semana semana1, semana2, semana1_1, semana2_1;
    public Programacion(String nombre,Semana semana1, Semana semana2, Semana semana1_1, Semana semana2_1) {
        this.nombre = nombre;
        this.semana1 = semana1;
        this.semana2 = semana2;
        this.semana1_1 = semana1_1;
        this.semana2_1 = semana2_1;
    }

    public String getNombre() {
        return nombre;
    }



}
