package com.erika.prj.ksr;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FilmuPopuliarumas implements Comparable<FilmuPopuliarumas> {

    private Filmas filmas;
    private int rezervuotosVietos;

    List<Filmas> filmuPopuliarumas = new ArrayList<>();

    FilmuPopuliarumas(Filmas filmas, int rezervuotosVietos) {
        filmas.getPavadinimas();
        this.rezervuotosVietos=rezervuotosVietos;
    }

    @Override
    public String toString(){
        return "" + filmas + ": " + rezervuotosVietos;
    }

    @Override
    public int compareTo(FilmuPopuliarumas ats) {

        if (ats.rezervuotosVietos-rezervuotosVietos!=0){
            return ats.rezervuotosVietos - rezervuotosVietos;
        }
        return 0;
    }
}

// isrusiuoti filmus pagal rezervuotas vietas ir abecele; susikurti klase filmu populiarumas, turi du atributus
// filmas ir rezervuotos vietos; grazinti filmu populiaruma;
//ieskoti konkretaus filmo ir susideti kiek buvo ispirkta bilietu (panaudoti map'a) ir isrikiuoti;
// top filmai - visu ivykusiu filmu seansu rezervaciju kiekis