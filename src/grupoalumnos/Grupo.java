package grupoalumnos;

import leerlib.Leer;

public class Grupo {

    final static int MAX = 30;
    private Alumno[] grupo;
    private int numAlu; // Número real de alumnos en el grupo

    public Grupo() {
        numAlu = 0;
        grupo = new Alumno[MAX];
    }

    //insertarAlumno(Alumno alu) en la primera posicion disponible
    /*public boolean insertarAlumno(Alumno alu) {
        if (numAlu < MAX) {
            grupo[numAlu] = alu;
            numAlu++;
            return true;
        } else {
            return false;
        }
    }*/
    
    public int damePosicion(Alumno alu){
        int i = 0;
        while ((i < numAlu) && (alu.getNombre().compareToIgnoreCase(grupo[i].getNombre()) > 0)){
            i++;
        }
        return i;
    }
        

    //insertarAlumno(Alumno a) en una posicion teniendo en cuenta que string es mayor que otro
    public boolean insertarAlumno(Alumno alu) {
        boolean insertar = false;
        int pos = damePosicion(alu);
        if (numAlu < MAX) {
            numAlu++;
            for (int j = numAlu; j > pos; j--) {
                grupo[j] = grupo[j - 1];
            }
            grupo[pos] = alu;
            insertar = true;
        }
        return insertar;
    }
    
    //buscarAlumno(String nombre) devuelve la posición dónde está el alumno
    public int buscarAlumno(String nombre) {
        int pos = -1;
        for (int i = 0; i < numAlu; i++) {
            if (nombre.equalsIgnoreCase(grupo[i].getNombre())) {
                pos = i;
            }
        }
        return pos;
    }
    
    //Solución de profesor
    /*public int buscarAlumno(String nombre){
        int i = 0;
        while (i <numAlu && !grupo[i].getNombre().equalsIsIgnoreCase(nombre)){
            i++;
        }
        return (i == numAlu) ? -1 : i; // Operador ternario '?' evalua condicion y devuelve el primero si es true y el segundo si es false
    */

    //numeroAprobados() devuelve cuántos alumnos hay aprobados
    public int numeroAprobados() {
        int aprobados = 0;
        for (int i = 0; i < numAlu; i++) {
            if (grupo[i].aprobado()) {
                aprobados++;
            }
        }
        return aprobados;
    }

    //Primera versión
    /*public int[] estadisticaSusp() {
        int[] suspensos = new int[4];

        for (int i = 0; i < numAlu; i++) {
            switch (grupo[i].numSuspensos()) {
                case 1:
                    suspensos[0]++;
                    break;
                case 2:
                    suspensos[1]++;
                    break;
                case 3:
                    suspensos[2]++;
                    break;
                case 4:
                    suspensos[3]++;
                    break;
                default:
                    break;
            }
        }
        return suspensos;
    }*/
    
    //Versión del profesor
    public int[] estadistica() {
        int[] suspensos = {0,0,0,0,0};

        for (int i = 0; i < numAlu; i++) {
            suspensos[grupo[i].numSuspensos()]++;
        }
        return suspensos;
    }
    
    // Coger una cadena "5,6,3,7,0" y pasarla a un array HACER!! POSIBLE EJER EXÁMEN!
    
    /*public int[] estadisticaAptos() {
        int[] aprobados = new int[4];

        for (int i = 0; i < numAlu; i++) {
            if (grupo[i].numAprobados() == 1) {
                aprobados[0]++;
            } else if (grupo[i].numAprobados() == 2) {
                aprobados[1]++;
            } else if (grupo[i].numAprobados() == 3) {
                aprobados[2]++;
            } else if (grupo[i].numAprobados() == 4) {
                aprobados[3]++;
            }
        }
        return aprobados;
    }*/

    //borrarAlumno(int posicion)
    public boolean borrarAlumno(int pos) {
        boolean borrado = false;
        
        if (pos >= 0 && pos < numAlu){
            for (int i = pos; i < numAlu - 1; i++) {
                grupo[i] = grupo[i + 1];
                borrado = true;
            }
            numAlu--;
        }
        return borrado;
    }

    @Override
    public String toString() {
        String salida = "";

        for (int i = 0; i < numAlu; i++) {
            salida += grupo[i].toString() + "\n";
        }
        return salida;
    }

}
