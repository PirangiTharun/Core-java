/**
 * Only inner classes can be static 
 * We need object of outer class to create object of inner class
 */

class A {
    int age;
    class B {
        public void show(){
            System.out.println("In B show");
        }
    }
    static class C {
        public void show1(){
            System.out.println("In C show");
        }
    }
}


public class InnerClasses {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.age);

        // To create object of B
        A.B obj1 = obj.new B();
        obj1.show();


        A.C obj2 = new A.C();
        obj2.show1();
    }
}
