package proyectoFinal;

public class ArmaLarga extends Arma implements Comparable<ArmaLarga> {
    private boolean tieneSello;
    private String justificacionDeUso;
    private int nivel;


    public ArmaLarga(Policia policiaAsociado, int cantMuniciones, int alcanceEnMetros, String marca, int calibre, String estado, boolean tieneSello, String justificacionDeUso, int nivel) {
        super(policiaAsociado, cantMuniciones, alcanceEnMetros, marca, calibre, estado);
        this.tieneSello = tieneSello;
        this.justificacionDeUso = justificacionDeUso;
        setNivel(nivel);
    }

    private void setNivel(int nivel) {
        if (nivel < 1 || nivel > 5) {
            throw new IllegalArgumentException("El nivel debe estar entre 1 y 5.");
        }
        this.nivel = nivel;
    }

    @Override
    public int compareTo(ArmaLarga otraArma) {
        return Integer.compare(this.nivel, otraArma.nivel);
    }

    @Override
    public String toString() {
        return "Sello RENAR: " + (tieneSello ? "Sí" : "No") +
                ", Uso: " + justificacionDeUso + ", Nivel: " + nivel;
    }

}
