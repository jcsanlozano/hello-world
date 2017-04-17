package grupoalumnos;

public class Alumno {

    private String nombre;
    private double[] notas;

    public Alumno() {
        this.notas = new double[4];
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new double[4];
    }

    public boolean aprobado() {
        boolean estaAprobado = true;
        for (int i = 0; i < notas.length && estaAprobado; i++) {
            if (notas[i] < 5) {
                estaAprobado = false;
            }
        }
        return estaAprobado;
    }

    public int numAprobados() {
        int aptos = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aptos++;
            }
        }
        return aptos;
    }

    public int numSuspensos() {
        int susp = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 5) {
                susp++;
            }
        }
        return susp;
    }

    public double notaMedia() {
        double total = 0;
        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }
        return total / notas.length;
    }

    public double notaMax() {
        double max = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (max < notas[i]) {
                max = notas[i];
            }
        }
        return max;
    }

    public double notaMin() {
        double min = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (min > notas[i]) {
                min = notas[i];
            }
        }
        return min;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(double[] notas) {
        System.arraycopy(notas, 0, this.notas, 0, notas.length);
    }

    public String getNotas() {
        String salida = "";
        for (int i = 0; i < notas.length; i++) {
            salida += " " + String.valueOf(notas[i]);
        }
        return salida;
    }

    @Override
    public String toString() {
        String salida = "";
        salida = "Nombre: " + nombre + ". Notas:" + getNotas();
        return salida;
    }
}
