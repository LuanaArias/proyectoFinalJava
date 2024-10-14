package proyectoFinal;

import java.util.Arrays;
import java.util.List;

public abstract class Arma {
    private Policia policiaAsociado;
    private int cantMuniciones;
    private int alcanceEnMetros;
    private String marca;
    private int calibre;
    private String estado;
    private static final List<String> estadosValidos = Arrays.asList(
            "NUEVA", "EN_MANTENIMIENTO", "EN_USO"
    );
    public Arma(Policia policiaAsociado, int cantMuniciones, int alcanceEnMetros, String marca, int calibre, String estado) {
        this.policiaAsociado = policiaAsociado;
        this.cantMuniciones = cantMuniciones;
        this.alcanceEnMetros = alcanceEnMetros;
        this.marca = marca;
        this.calibre = calibre;
        setEstado(estado);
    }

    public void setEstado(String estado) {
        if (!estadosValidos.contains(estado)) {
            throw new IllegalArgumentException("Estado no válido: " + estado);
        }
        this.estado = estado;
    }

    public boolean estaEnCondicionesUso() {
        return "EN_USO".equals(estado) && this.calibre >= 9;
    }

    public Policia getPolicia() {
        return policiaAsociado;
    }

    public int getCantMuniciones() {
        return cantMuniciones;
    }

    public double getAlcanceMetros() {
        return alcanceEnMetros;
    }

    public String getMarca() {
        return marca;
    }

    public int getCalibre() {
        return calibre;
    }

    public String getEstado() {
        return estado;
    }

}
