/** This is nothing but type casting */

class A {
    public void show1(){
        System.out.println("In show1");
    }
}

class B extends A {
    public void show2(){
        System.out.println("In show2");
    }
}

public class UpCasting {
    public static void main(String[] args) {
        /* This is upcasting. We are upgrading child object to parent reference object. This is implicit
         * Happens without specifying (A) also
         */
        A obj = (A) new B();
        obj.show1();

        /* This is downcasting. As we are degrading from parent reference object to child reference object */
        B obj1 = (B) obj;
        obj1.show2();
    }
}
