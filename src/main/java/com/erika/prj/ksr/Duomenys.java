package com.erika.prj.ksr;

import java.util.List;

public class Duomenys {

    public static void main(String[] args) {

        Filmas filmoRef = new Filmas("Altered States");
        Filmas filmoRef2 = new Filmas("Triangle");

        Sale mazoiSale = new Sale("Mažoji salė", 5);
        Sale didziojiSale = new Sale("Didžioji salė", 6);


        KinoTeatras vingis = new KinoTeatras();
        vingis.getRepertuaras().add(new Seansas("A123456", mazoiSale, filmoRef, "14:30 val.", false));
        vingis.getRepertuaras().add(new Seansas("V852369", mazoiSale, filmoRef, "12:30 val.", false));
        vingis.getRepertuaras().add(new Seansas("E741258", didziojiSale, filmoRef, "10:30 val.", false));
        vingis.getRepertuaras().add(new Seansas("B365412", didziojiSale, filmoRef2, "17:00 val.", false));
        vingis.getRepertuaras().add(new Seansas("H879546", didziojiSale, filmoRef2, "13:00 val.", false));

        List<Seansas> rodytiSeansus = vingis.rodytiSeansus();
        System.out.println(rodytiSeansus);

        System.out.println(vingis.rezervuoti("A123456", true));
        System.out.println(vingis.rezervuoti("A123456", true));
        System.out.println(vingis.rezervuoti("A123456", true));
        System.out.println(vingis.rezervuoti("A123456", true));
        System.out.println(vingis.rezervuoti("V852369", true));
        System.out.println(vingis.rezervuoti("V852369", true));
        System.out.println(vingis.rezervuoti("E741258", true));
        System.out.println(vingis.rezervuoti("E741258", true));
        System.out.println(vingis.rezervuoti("B365412", true));
        System.out.println(vingis.rezervuoti("H879546", true));

    }
}
