import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner vartotojo_irasai = new Scanner(System.in);                    // padarau, kad vartotojo irasus butu galima gauti;

    public static void main(String[] args) {

        do {
            rodyti_turini();                                                     // cia kad vartotojui rodytu turini ir pasirinkimus;
            int vartotojo_pasirinkimas = gauti_vartotojo_pasirinkima();         //cia po apacia reiketu irasyti metodus su if 1, if 2, if 3, if 4, if 5;
            if (vartotojo_pasirinkimas == 5) {
                System.out.println("Iki pasimatymo!");                          //iseina is meniu
                break;
            }
        } while (true);


    }

    // kintamieji
    static String[] kino_filmai = new String[7];                                    //kino filmu pavadinimu masyvas
    static String[] kino_sales = new String[2];                                     //kino saliu pavadinimu masyvas


    // metodai/funkcijos


    static void rodyti_turini() {                                                   //vartotojui rodomas turinys konsoleje (apačioj nurodytos funkcijos);
        System.out.println("_____________________________\n - Turinys - \n");
        System.out.println("1 - Rezervuoti vietą");
        System.out.println("2 - Atšaukti vietą");
        System.out.println("3 - Rodyti filmų repertuarą");
        System.out.println("4 - Top filmai (statistika)");
        System.out.println("5 - Išeiti");
    }

    static int gauti_vartotojo_pasirinkima() {                                      //vartotojas padaro pasirinkima is konsoleje pateiktu options;
        System.out.print("Option: ");
        int option = vartotojo_irasai.nextInt();
        vartotojo_irasai.nextLine();
        System.out.println();
        return option;
    }

    static void kino_saliu_pavadinimai() {                                          //kino saliu pavadinimu masyvas
        kino_sales[0] = "Mažoji salė";
        kino_sales[1] = "Didžioji salė";
    }

    static void kino_filmu_pavadinimai() {                                          //kino filmu pavadinimu masyvas
        kino_filmai[0] = "Altered States";
        kino_filmai[1] = "Triangle";
        kino_filmai[2] = "Predestination";
        kino_filmai[3] = "Abre los Ojos";
        kino_filmai[4] = "Identity";
        kino_filmai[5] = "Mind Game";
        kino_filmai[6] = "Mr. Nobody";
    }


}
