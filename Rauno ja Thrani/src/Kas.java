import java.util.Random;

public class Kas extends Main {

    Random rand = new Random();
    Kas(){
    }

    public void random(){
        int õnn = rand.nextInt(3);
        System.out.println(õnn);
    }
}
