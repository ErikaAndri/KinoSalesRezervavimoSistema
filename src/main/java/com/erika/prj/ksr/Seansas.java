package com.erika.prj.ksr;

public class Seansas {

    private Sale sale;
    private Filmas filmas;
    private String laikas;

    public Sale getSale() {
        return sale;
    }

    public Seansas(Sale sale, Filmas filmas, String laikas) {
        this.sale = sale;
        this.filmas = filmas;
        this.laikas = laikas;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Filmas getFilmas() {
        return filmas;
    }

    public void setFilmas(Filmas filmas) {
        this.filmas = filmas;
    }

    public String getLaikas() {
        return laikas;
    }

    public void setLaikas(String laikas) {
        this.laikas = laikas;
    }
}
