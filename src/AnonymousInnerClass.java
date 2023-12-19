/**
 * When you want to override show method of A class, you may create B class which extends A
 * and you override the method show(). So we are creating a new class only for one purpose (to override method)
 * 
 * Anonymous inner class is used to avoid creating new classes.
 */

class A {
    public void show(){
        System.out.println("In A show");
    }
}


public class AnonymousInnerClass {
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
