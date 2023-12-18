/**
 * 1) There is always super(); method present in the first line of constructor by default, though we can't see it
 * 2) Every class in Java extends Object class - Class A extends Object {}
 * 3) Object is like Johncena
 * 4) this(); is used to call default constructor from parameterized constructor
 */

class A{
    public A(){
        super();
        System.out.println("Inside A constructor");
    }
    public A(int n){
        System.out.println("Inside A int constructor");
    }
}
class B extends A{
    public B(){
        System.out.println("Inside B constructor");
    }
    public B(int n){
        this();
        System.out.println("Inside B int constructor");
    }
}

public class SuperClass {
    public static void main(String[] args){
        B b = new B(3);
    }
}
