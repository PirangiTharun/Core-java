/**
 * A obj = new A();
 * Here obj is called reference variable
 * new A(); -> This is called Anonymous object as it has no name
 * AnonymousObject can be used only once
 * 
 */
class A {
    public A() {
        System.out.println("Inside constructor");
    }
}


public class AnonymousObject {
    public static void main(String[] args) {
        new A();
    }
}
