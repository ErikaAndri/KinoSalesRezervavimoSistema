package com.erika.prj.ksr.KTFunkcijos;

import com.erika.prj.ksr.Elementai.Filmas;
import java.util.*;

public class FilmuPopuliarumas implements Comparable<FilmuPopuliarumas> {

    private String filmas;
    private int rezervuotosVietos;

    public static void filmuSortas () {
        List<String> filmass = new ArrayList<String>();
        Collections.sort(filmass);
        System.out.println(Arrays.toString(filmass.toArray()));
        Collections.sort(filmass, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
    }

    FilmuPopuliarumas(String filmas, int rezervuotosVietos) {
        this.filmas = filmas;
        this.rezervuotosVietos = rezervuotosVietos;
    }

    List<Filmas> filmuPopuliarumas = new ArrayList<>();

    @Override
    public int compareTo(FilmuPopuliarumas ats) {
        return ats.rezervuotosVietos - rezervuotosVietos;
    }
}

// isrusiuoti filmus pagal rezervuotas vietas ir abecele; susikurti klase filmu populiarumas, turi du atributus
// filmas ir rezervuotos vietos; grazinti filmu populiaruma;
//ieskoti konkretaus filmo ir susideti kiek buvo ispirkta bilietu (panaudoti map'a) ir isrikiuoti;
// top filmai - visu ivykusiu filmu seansu rezervaciju kiekis