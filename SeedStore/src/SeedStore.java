import java.util.*;
import java.util.function.BiConsumer;

public class SeedStore extends Item {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        SeedStore seed=new SeedStore();
        Fruits obj = new Fruits();
        Vegetables obj1= new Vegetables();
        Flowers obj2= new Flowers();
          //Map<String,Integer>basketPrice=new LinkedHashMap<>();
          Map<String,Integer>basketQuantity=new LinkedHashMap<>();

        BiConsumer<String, Integer> b = (n, m) -> {
            System.out.println(n + " : " + m);
        };

//        obj.quantity.forEach(b);
        System.out.println("fruits");
        obj.price.forEach(b);
        System.out.println("vegetables");
        obj1.vprice.forEach(b);
        System.out.println("flowers");
        obj2.fprice.forEach(b);




        int op;
        do {
               System.out.println("""
                1.customer
                2.seller
                3.exit
                """);
               op= sc.nextInt();
            switch (op) {
                case 1:
                        LogNew.setlogger();
                        LogNew.loggervar.info("User selected customer");
    //                    System.out.println(b);
                    do {
                        System.out.println("""
                                1.order
                                2.search
                                3.sort by price
                                4.exit
                                """);
                        int ch = sc.nextInt();
                        int total = 0;
                        int sel;



                            switch (ch) {

                                case 1 -> {

                                        System.out.println("""
                                                1.fruit
                                                2.vegetables
                                                3.flower
                                                4.bill
                                                5.back
                                                """);
                                        sel = sc.nextInt();
                                        String item;
                                        switch (sel) {
                                            case 1 -> {
                                                obj.price.forEach(b);
                                                System.out.println("type the name of the item to buy");
                                                item = sc.next();
                                                if (obj.price.containsKey(item)) {
                                                    System.out.println("enter the quantity");
                                                    int qty = sc.nextInt();
                                                    basketQuantity.put(item, qty);
                                                    total = total + qty * obj.price.get(item);
                                                    reduceQuantity(obj.quantity, item, qty);
                                                    obj.quantity.forEach(b);

                                                } else {
                                                    System.out.println("item is not found");
                                                }
                                            }
                                            case 2 -> {
                                                obj1.vprice.forEach(b);
                                                System.out.println("type the name of the item to buy");
                                                item = sc.next();
                                                if (obj1.vprice.containsKey(item)) {
                                                    System.out.println("enter the quantity");
                                                    int qty = sc.nextInt();
                                                    basketQuantity.put(item, qty);
                                                    total = total + qty * obj1.vprice.get(item);
                                                    reduceQuantity(obj1.vquantity, item, qty);


                                                } else {
                                                    System.out.println("item is not found");
                                                }
                                            }
                                            case 3 -> {
                                                obj2.fprice.forEach(b);
                                                System.out.println("type the name of the item to buy");
                                                item = sc.next();
                                                if (obj2.fprice.containsKey(item)) {
                                                    System.out.println("enter the quantity");
                                                    int qty = sc.nextInt();
                                                    basketQuantity.put(item, qty);
                                                    total = total + qty * obj2.fprice.get(item);
                                                    reduceQuantity(obj2.fquantity, item, qty);
                                                    obj2.fquantity.forEach(b);

                                                } else {
                                                    System.out.println("item is not found");
                                                }
                                            }
                                            case 4 -> {
                                                Set<String> key = basketQuantity.keySet();
                                                System.out.println("item  quantity  price ");
                                                for (String o : key) {
                                                    if (obj.price.containsKey(o)) {
                                                        System.out.println(o + "  " + basketQuantity.get(o) + "  " + obj.price.get(o) + "  " + (basketQuantity.get(o) * obj.price.get(o)));
                                                    } else if (obj1.vprice.containsKey(o)) {
                                                        System.out.println(o + " " + basketQuantity.get(o) + " " + obj1.vprice.get(o) + " " + (basketQuantity.get(o) * obj1.vprice.get(o)));
                                                    } else if (obj2.fprice.containsKey(o)) {
                                                        System.out.println(o + " " + basketQuantity.get(o) + " " + obj2.fprice.get(o) + " " + (basketQuantity.get(o) * obj2.fprice.get(o)));
                                                    } else {
                                                        System.out.println("no item selected");
                                                    }


                                                }
                                                System.out.println("the total amount is :" + total);
                                            }

                                        }
                                        break;



                                }

                                case 2 -> {
                                    seed.search();

                                }
                                case 3 -> {
                                    System.out.println("sorted list as per price");
                                    Map<String, Integer> f1 = new TreeMap(obj.price);
                                    f1.forEach(b);
                                }
                            }
                        }while (op !=5);
                case 2:
                        int sll;

                        do {
                            System.out.println("""
                                    1.add fruit
                                    2.delete a fruit
                                    3.back
                                    """);
                            sll = sc.nextInt();
                            String fitem;
                            String ditem;
                            int q;
                            int r;


                            switch (sll) {

                                case 1 -> {
                                    System.out.println("enter the item like-fruit,vegetable,flower");
                                    String itt= sc.next();
                                    if(itt.equalsIgnoreCase("fruit")){
                                        System.out.println("enter the fruit to insert");
                                        fitem = sc.next();
                                        System.out.println("enter the quantity of "+fitem);
                                        q = sc.nextInt();
                                        System.out.println("enter the rate of "+fitem);
                                        r = sc.nextInt();
                                        obj.quantity.put(fitem,q);
                                        obj.price.put(fitem,r);

                                    } else if (itt.equalsIgnoreCase("vegetable")) {
                                        System.out.println("enter the vegetable to insert");
                                        fitem = sc.next();
                                        System.out.println("enter the quantity of "+fitem);
                                        q = sc.nextInt();
                                        System.out.println("enter the rate of "+fitem);
                                        r = sc.nextInt();
                                        obj1.vquantity.put(fitem,q);
                                        obj1.vprice.put(fitem,r);

                                    } else if (itt.equalsIgnoreCase("vegetable")) {
                                        System.out.println("enter the vegetable to insert");
                                        fitem = sc.next();
                                        System.out.println("enter the quantity of "+fitem);
                                        q = sc.nextInt();
                                        System.out.println("enter the rate of "+fitem);
                                        r = sc.nextInt();
                                        obj2.fquantity.put(fitem,q);
                                        obj2.fprice.put(fitem,r);

                                    }
                                    break;
                                }

                                case 2 -> {
                                    System.out.println("item to remove");
                                    ditem = sc.next();
                                    obj.price.remove(ditem);
                                    obj.quantity.remove(ditem);
                                    break;
                                }

                            }


                } while (sll !=4);
                }

            }while (op != 3) ;


    }
}