
package punto2;


public class Sala {
    private String nombre;
    private Programacion programacion1, programacion2, programacion3, programacion4;
  
    public Sala(String nombre, Programacion programacion1, Programacion porgramacion2,Programacion programacion3,Programacion programacion4) {
        this.nombre = nombre;
        this.programacion1 = programacion1;
        this.programacion2 = programacion2;
        this.programacion3 = programacion3;
        this.programacion4 = programacion4;
    }

  
    
    public String getNombre() {
        return nombre;
    }

   
   
}
