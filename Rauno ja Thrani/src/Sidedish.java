import java.util.Random;


public class Sidedish {
    Sidedish(){
    }


    public void event(){
        String[] eventid = {"Tuan", "Rauno", "Cornelia"};
        Random suva = new Random();
        String a = eventid[suva.nextInt(eventid.length)];
        if(a.equals("Tuan")){
            tuan();
        }else if (a == ""){

        }
    }
    public void tuan(){
        System.out.println("Näed oma ees dzinni. Ta tutvustab end kui 'Tuan'. Mida teha?");
    }
}
