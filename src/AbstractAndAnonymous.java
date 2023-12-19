/**
 * With the help of Anonymous inner class we are saving an extra class
 * Ideally we should create class B which extends A and implement the abstract method.
 * We did it directly by anonymous inner class.
 * 
 */

abstract class A {
    public abstract void show();
}


public class AbstractAndAnonymous {
    public static void main(String[] args) {
        A obj = new A(){
            // this is an anonymous inner class which is used to override show method of A class
            public void show(){
                System.out.println("In anonymous inner class show");
            }
        };
        obj.show();
    }    
}
