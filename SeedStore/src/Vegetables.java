import java.util.HashMap;
import java.util.Map;

public class Vegetables {


    Map<String,Integer> vprice=new HashMap<>();
    static Map<String,Integer> vquantity=new HashMap<>();
    Vegetables(){
        vprice.put("potato",50);
        vprice.put("carrot",70);
        //quantity
        vquantity.put("potato",40);
        vquantity.put("carrot",10);
    }
}
