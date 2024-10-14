package proyectoFinal;

public class ArmaCorta extends Arma {
    private boolean esAutomatica;

    public ArmaCorta(Policia policiaAsociado, int cantMuniciones, int alcanceEnMetros, String marca, int calibre, String estado, boolean esAutomatica) {
        super(policiaAsociado, cantMuniciones, alcanceEnMetros, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }

    public boolean puedeDispararALargaDistancia() {
        return getAlcanceMetros() > 200;
    }
}
