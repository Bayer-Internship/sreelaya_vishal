import java.util.HashMap;
import java.util.Map;

public class Flowers {
    Map<String,Integer> fprice=new HashMap<>();
    Map<String,Integer> fquantity=new HashMap<>();
    Flowers(){
        fprice.put("sunflower",20);
        fprice.put("tulip",50);
        //quantity
        fquantity.put("sunflower",60);
        fquantity.put("tulip",5);
    }
}
