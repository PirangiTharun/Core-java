/**
 * There are wrapper classes for all the primitive data types
 * 1) int -> Integer
 * 2) char -> Character and so on...
 */


public class WrapperClasses {
    public static void main(String[] args) {
        int num = 7;
        // below line is depricated
        Integer num1 = new Integer(num); // boxing 

        Integer num2 = num; // auto boxing

        int num3 = num1.intValue(); // unboxing
        int num4 = num1; // auto-unboxing

        System.out.println(num1+" "+num2+" "+num3+" "+num4);
    }
}
