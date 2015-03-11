import java.util.Scanner;

public class Kõrb extends Main {
    Scanner scan = new Scanner(System.in);
    String nimi;

    Kõrb(String nimi){
        this.nimi = nimi;
    }
    Kas random = new Kas();

    public void kõrb_algus(){
            System.out.println("Oled kõrbes,igal pool nägemisulatuses on liiv, kuum kõrvetav liiv. Näed oma ees kolmekordse maja suurust templi moodi ehitist. Templisse on kaks sisse pääsu: alumine ja ülemine kas astud alla või ronid üles?");
            String üles_alla = scan.next();
            if (üles_alla.equals("Üles")) {
                System.out.println("läksid üles");
                //Lae next meetod

            }else if(üles_alla.equals("Alla")){
                System.out.println("valisite allatee..;)");

                //lae next meetod
            }else{
                System.out.println("Kas sa meelega trükid halvasti?");
                kõrb_algus();
            }



    }

}