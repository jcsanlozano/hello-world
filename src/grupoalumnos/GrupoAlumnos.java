package grupoalumnos;

import java.util.Arrays;
import leerlib.Leer;

public class GrupoAlumnos {

    public static void main(String[] args) {
        Grupo clase = new Grupo();
        Alumno alu1 = new Alumno("Ana");
        Alumno alu2 = new Alumno("Pepe");
        Alumno alu3 = new Alumno("Luis");
        Alumno alu4 = new Alumno("Berto");

        //double[] notas = new double[4];
        double[] notas1 = {10, 6.7, 6.4, 2.1};
        double[] notas2 = {2.5, 7.6, 8.9, 5.6};
        double[] notas3 = {0, 0, 0, 1};
        double[] notas4 = {0, 0, 0, 0};

        alu1.setNotas(notas1);
        alu2.setNotas(notas2);
        alu3.setNotas(notas3);
        alu4.setNotas(notas4);

        System.out.println("¿Inserto?: " + clase.insertarAlumno(alu1));
        System.out.println("¿Inserto?: " + clase.insertarAlumno(alu2));
        System.out.println("¿Inserto?: " + clase.insertarAlumno(alu3));
        System.out.println("¿Inserto?: " + clase.insertarAlumno(alu4) + "\n");
        System.out.println(clase.toString());
        System.out.println("Aprobados en la clase: " + clase.numeroAprobados());
        System.out.println("Posición del alumno Ana: " + clase.buscarAlumno("Ana"));
        //System.out.println("Borramos: " + clase.borrarAlumno(clase.buscarAlumno("Pepe")));
        //System.out.println("Borramos: " + clase.borrarAlumno(clase.buscarAlumno("Antonio")));
        //System.out.println("\nBorramos: " + clase.borrarAlumno(clase.buscarAlumno("Juan")));
        System.out.println("\n" + clase.toString());
        System.out.println("Posición del alumno Ana: " + clase.buscarAlumno("Ana"));
        System.out.println("Posición del alumno Berto: " + clase.buscarAlumno("Berto"));
        System.out.println("Posición del alumno Pepe: " + clase.buscarAlumno("Pepe"));
        System.out.println("Posición del alumno Luis: " + clase.buscarAlumno("Luis"));
        System.out.println("\nNúmero de suspensos [0, 1, 2, 3, 4] asignaturas: " + Arrays.toString(clase.estadistica()));
        //System.out.println("Número de aprobados [1, 2, 3, 4] asignaturas: " + Arrays.toString(clase.estadisticaAptos()));
        System.out.println("Posición: " + clase.damePosicion(alu4));               

    }

}
