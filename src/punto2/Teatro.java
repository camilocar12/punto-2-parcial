
package punto2;

public class Teatro {

    private Sala sala1, sala2;
  

public void CrearSala(){
    Programacion programacion1, programacion2, programacion3, programacion4;
    Semana semana1, semana2, semana1_1, semana2_1;
    Dia dia1, dia2, dia3, dia4;
    Segmento segmento1, segmento2, segmento3, segmento4;
    segmento1 = new Segmento ("1 pm", "3 pm");
    segmento2 = new Segmento ("3 pm", "5 pm");
    segmento3 = new Segmento ("7 pm", "9 pm");
    segmento4 = new Segmento ("9 pm", "11 pm");
    dia1= new Dia ("2 de Octubre", "Lunes", segmento1, segmento2, segmento3, segmento4);
    dia2= new Dia ("5 de Octubre", "Jueves", segmento1, segmento2, segmento3, segmento4);
    dia3= new Dia ("10 de Octubre", "Martes", segmento1, segmento2, segmento3, segmento4);
    dia4= new Dia ("14 de Octubre", "Sabado", segmento1, segmento2, segmento3, segmento4);
    semana1 = new Semana (1,dia1, dia2, dia3, dia4);
    semana2 = new Semana (2, dia1, dia2, dia3, dia4);
    semana1_1 = new Semana (1, dia1, dia2, dia3, dia4);
    semana2_1 = new Semana (2, dia1, dia2, dia3, dia4);
    programacion1= new Programacion ("PELICULA 1", semana1, semana2,semana1_1, semana2_1);
    programacion2= new Programacion ("PELICULA 2", semana1, semana2,semana1_1, semana2_1);
    programacion3= new Programacion ("PELICULA 3", semana1, semana2,semana1_1, semana2_1);
    programacion4= new Programacion ("PELICULA 4", semana1, semana2,semana1_1, semana2_1);
    this.sala1 = new Sala ("SALA 1", programacion1, programacion2, programacion3, programacion4);
    this.sala2 = new Sala ("SALA 2", programacion1, programacion2, programacion3, programacion4);
    System.out.println("////////////////////////////////////");
    System.out.println(sala1.getNombre());
    System.out.println("CARTELERA");
    System.out.println(programacion1.getNombre()+":");
    System.out.println("semana "+semana1.getNumero());
    System.out.println("fecha: "+dia1.date+ " dia: "+ dia1.name + " horario: "+segmento1.horaInicio+ " hasta "+ segmento1.horaFin);
    System.out.println("fecha: "+dia2.date+ " dia: "+ dia2.name + " horario: "+segmento3.horaInicio+ " hasta "+ segmento3.horaFin);
    System.out.println("");
    System.out.println("semana "+semana2.getNumero());
    System.out.println("fecha: "+dia3.date+ " dia: "+ dia3.name + " horario: "+segmento2.horaInicio+ " hasta "+ segmento2.horaFin);
    System.out.println("fecha: "+dia4.date+ " dia: "+ dia4.name + " horario: "+segmento4.horaInicio+ " hasta "+ segmento4.horaFin);
    System.out.println("");
    System.out.println(programacion2.getNombre()+" :");
    System.out.println("semana "+semana1.getNumero());
    System.out.println("fecha: "+dia1.date+ " dia: "+ dia1.name + " horario: "+segmento1.horaInicio+ " hasta "+ segmento1.horaFin);
    System.out.println("fecha: "+dia2.date+ " dia: "+ dia2.name + " horario: "+segmento3.horaInicio+ " hasta "+ segmento3.horaFin);
    System.out.println("");
    System.out.println("semana "+semana2.getNumero());
    System.out.println("fecha: "+dia3.date+ " dia: "+ dia3.name + " horario: "+segmento2.horaInicio+ " hasta "+ segmento2.horaFin);
    System.out.println("fecha: "+dia4.date+ " dia: "+ dia4.name + " horario: "+segmento4.horaInicio+ " hasta "+ segmento4.horaFin);
    System.out.println("");
    System.out.println("////////////////////////////////////");
    System.out.println(sala2.getNombre());
    System.out.println("CARTELERA");
    System.out.println(programacion3.getNombre()+" :");
    System.out.println("semana "+semana1_1.getNumero());
    System.out.println("fecha: "+dia1.date+ " dia: "+ dia1.name + " horario: "+segmento1.horaInicio+ " hasta "+ segmento1.horaFin);
    System.out.println("fecha: "+dia2.date+ " dia: "+ dia2.name + " horario: "+segmento3.horaInicio+ " hasta "+ segmento3.horaFin);
    System.out.println("");
    System.out.println(semana2_1.getNumero());
    System.out.println("fecha: "+dia3.date+ " dia: "+ dia3.name + " horario: "+segmento2.horaInicio+ " hasta "+ segmento2.horaFin);
    System.out.println("fecha: "+dia4.date+ " dia: "+ dia4.name + " horario: "+segmento4.horaInicio+ " hasta "+ segmento4.horaFin);
    System.out.println("");
    System.out.println(programacion4.getNombre());
    System.out.println(semana1_1.getNumero());
    System.out.println("fecha: "+dia1.date+ " dia: "+ dia1.name + " horario: "+segmento1.horaInicio+ " hasta "+ segmento1.horaFin);
    System.out.println("fecha: "+dia2.date+ " dia: "+ dia2.name + " horario: "+segmento3.horaInicio+ " hasta "+ segmento3.horaFin);
    System.out.println("");
    System.out.println(semana2_1.getNumero());
    System.out.println("fecha: "+dia3.date+ " dia: "+ dia3.name + " horario: "+segmento2.horaInicio+ " hasta "+ segmento2.horaFin);
    System.out.println("fecha: "+dia4.date+ " dia: "+ dia4.name + " horario: "+segmento4.horaInicio+ " hasta "+ segmento4.horaFin);
    System.out.println("");
}
public static void main (String args[]){
    Teatro teatro= new Teatro();
    teatro.CrearSala();
}

}

 



