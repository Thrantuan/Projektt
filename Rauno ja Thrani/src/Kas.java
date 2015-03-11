import java.util.Random;

public class Kas extends Main {

    Random rand = new Random();
    Kas(){}
    Sidedish event = new Sidedish();

    public void random(){
        int õnn = rand.nextInt(3);
        System.out.println(õnn);
        if(õnn == 2){
            event.event();
        }else if(õnn == 1){
            //kaklus
        }else{
            //do nothing
        }
    }
}
