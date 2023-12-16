/**
 * public static void main(String[] args) throws ClassNotFoundException {
 *     Below line loads the class without instantiating the object
 *     Class.forName("Mobile");
 * }
 */


class Mobile {
    String brand;
    int price;
    static String name;

    static {
        // This block is executed only once, on class load
        name = "Smart phone";
        System.out.println("Prints on class load");
    }


    Mobile(){
        System.out.println("Prints on every instance of object created");
        brand = "";
        price = 200;
        /* If the name is a static variable, it is common for all the instantiated objects. 
            So it's not right to assign the same name multiple times.*/
        // name = "Smart phone";
    }

}

public class StaticBlock {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();       
        Mobile m2 = new Mobile();
    }
}
