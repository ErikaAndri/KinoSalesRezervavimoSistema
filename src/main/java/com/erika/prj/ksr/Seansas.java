package com.erika.prj.ksr;

public class Seansas {

    private String id;
    private Sale sale;
    private Filmas filmas;
    private String laikas;
    private boolean jauIvyko;
    private Rezervacija[] sedimosVietos;


    public Seansas(String id, Sale sale, Filmas filmas, String laikas, boolean jauIvyko) {
        this.id = id;
        this.sale = sale;
        this.filmas = filmas;
        this.laikas = laikas;
        this.jauIvyko = jauIvyko;
        sedimosVietos = new Rezervacija[sale.getVietuKiekis()];
    }

    public Sale getSale() {
        return sale;
    }

    public String getId() {
        return id;
    }

    public boolean isJauIvyko() {
        return jauIvyko;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Filmas getFilmas() {
        return filmas;
    }

    public void setJauIvyko(boolean jauIvyko) {
        this.jauIvyko = jauIvyko;
    }

    public void setFilmas(Filmas filmas) {
        this.filmas = filmas;
    }

    public String getLaikas() {
        return laikas;
    }

    public Rezervacija[] getSedimosVietos() {
        return sedimosVietos;
    }

    public void setLaikas(String laikas) {
        this.laikas = laikas;
    }
}
