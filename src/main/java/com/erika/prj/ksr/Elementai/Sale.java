package com.erika.prj.ksr.Elementai;


public class Sale {


    private String pavadinimas;
    private int vietuKiekis;


    public Sale(String pavadinimas, int salesVietuKiekis) {

        this.pavadinimas = pavadinimas;
        this.vietuKiekis = salesVietuKiekis;
    }

    public int getVietuKiekis() {
        return vietuKiekis;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

}
