/**
 * Static methods can be accessed without object.
 * We cannot access non static varialbes in static method.
 * 
 */

class Mobile {
    String brand;
    int price;
    static String name;
    
    public void show(){
        System.out.println(brand+" "+price+" "+name);
    }

    public static void show1() {
        /* Below line gives error. Accessing non static variables in static method */
        // System.out.println(brand+" "+price+" "+name);
    }

    public static void show2(Mobile obj) {
        System.out.println(obj.brand + " "+ obj.price+" "+name);
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "iPhone";
        m1.price = 1500;
        Mobile.name = "SmartPhone";

        m1.show();
        Mobile.show1();
        Mobile.show2(m1);
    }
}
