package com.erika.prj.ksr;

public class Filmas {


    private String pavadinimas;
    private boolean jauIvyko;


    public Filmas(String pavadinimas, boolean jauIvyko) {
        this.pavadinimas = pavadinimas;
        this.jauIvyko = jauIvyko;

    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public boolean isJauIvyko() {
        return jauIvyko;
    }

    public void setJauIvyko(boolean jauIvyko) {
        this.jauIvyko = jauIvyko;
    }

}
