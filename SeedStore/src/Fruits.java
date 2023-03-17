import java.util.HashMap;
import java.util.Map;

public class Fruits {
    Map<String,Integer> price=new HashMap<>();
    Map<String,Integer> quantity=new HashMap<>();
     Fruits(){
        price.put("apple",20);
        price.put("orange",50);
        //quantity
        quantity.put("apple",60);
        quantity.put("orange",5);
    }


}
