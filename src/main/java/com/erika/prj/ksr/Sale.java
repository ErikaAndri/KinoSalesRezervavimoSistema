package com.erika.prj.ksr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sale {


    private String pavadinimas;
    private List<Filmas> filmai = new ArrayList<Filmas>();
    private Rezervacija[] sedimosVietos;

    public Sale(String pavadinimas, int salesVietuKiekis, Filmas... filmai) {

        this.pavadinimas = pavadinimas;
        this.filmai.addAll(Arrays.asList(filmai));
        this.sedimosVietos = new Rezervacija[salesVietuKiekis];
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public List<Filmas> getFilmai() {
        return filmai;
    }

    public Rezervacija[] getSedimosVietos() {
        return sedimosVietos;
    }
}
