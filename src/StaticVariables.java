/**
 * 1) Static variables are common for all the objects of the class.
 * 2) We don't need an explicit object to access static variables
 * 3) We can directly access by using ClassName.staticVariable
 * 4) Change in static variables will be reflected for all objects
 * 5) Static variable is a class member not object member.
 * 6) We are saving memory by using static variable as each object doesn't create an instance for it
 */

class Mobile {
    String brand;
    int price;
    String name;
    public void show(){
        System.out.println(brand+" "+price+" "+name);
    }
}

class StaticMobile {
    String brand;
    int price;
    static String name; // static variable
    public void show() {
        System.out.println(brand+" "+price+" "+name);
    }
}

public class StaticVariables {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "iPhone";
        m1.price = 1500;
        m1.name = "Smartphone";

        m1.show();

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 1600;
        m2.name = "Smartphone";

        m2.show();

        // Static variable behaviour
        StaticMobile.name ="Smartphone";

        StaticMobile sm1 = new StaticMobile();
        sm1.brand = "iPhone";
        sm1.price = 1500;
        sm1.show();

        StaticMobile sm2 = new StaticMobile();
        sm2.brand = "Samsung";
        sm2.price = 1700;
        sm2.show();

    }    
}
