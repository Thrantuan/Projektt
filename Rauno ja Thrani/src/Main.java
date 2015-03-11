import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Mis on sinu(Kangelase) nimi?");
        String nimi = scan.next();
        System.out.println("Tere "+ nimi + ", oled kangelane, kelle elutee avaneb järgmise 5-10 minuti jooksul. Elus tuleb valida ja valida tuleb hästi, muidu ootab sind sama saatus mis teisi..");
        System.out.println("MUNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");


        while(true){
            System.out.println("Alustame su esimesest valikust..: Mets, Kõrb või Linn");
            String esimene_valik = scan.next();
            if (esimene_valik.equals("Kõrb")) {
                Kõrb kõrb = new Kõrb(nimi);
                kõrb.kõrb_algus();
                break;
            } else if (esimene_valik.equals("Mets")) {

            } else if (esimene_valik.equals("Linn")) {

            } else {
                System.out.println("Sisestasite valesti, proovige uuesti");
            }
        }

    }
}
