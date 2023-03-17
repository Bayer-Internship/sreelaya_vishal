

import java.util.Map;
import java.util.Scanner;

public class Item {
    static Fruits obj = new Fruits();
    static Vegetables obj1=new Vegetables();
    static Flowers obj2=new Flowers();
    static Scanner sc=new Scanner(System.in);
    public static void reduceQuantity (Map<String,Integer> map, String item, int qty) {
        try {
            if (map.get(item) >= qty) {
                map.put(item, map.get(item) - qty);
            } else
                throw  new ExceptionNew("Not enough quantity available for " + item+"\nAvailable Quantity "+Vegetables.vquantity.get(item) );
        }

        catch(ExceptionNew e){
            System.out.println(e.getMessage());

        }
    }
    public static  void search(){
        System.out.println("enter the item to search:");
        String temp = sc.next();
        try {



            if (obj.price.containsKey(temp)) {

                System.out.println("item found");
                System.out.println(temp + " " + (obj.price.get(temp)));
            }
            else if (obj1.vprice.containsKey(temp) ){
                System.out.println("item found");
                System.out.println(temp + " " + (obj1.vprice.get(temp)));

            } else if (obj2.fprice.containsKey(temp)) {
                System.out.println("item found");
                System.out.println(temp + " " + (obj2.fprice.get(temp)));

            }
            else {
                throw new ExceptionNew("item not found");
            }
        }
        catch (ExceptionNew e){
            System.out.println(e);
        }
    }

}
