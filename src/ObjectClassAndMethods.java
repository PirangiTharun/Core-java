/**
 * Every Class extends Object class even though we don't see it
 * We discuss few of the methods which are inbuilt for object
 * Everytime you try to print obj, it calls toString() method by default
 * 1) toString() -> When you try to print obj you see "ClassName@hex(hashcode)"
 *    -> We can define our own toString() method to override the parents implementation
 *    -> You can also right click in class and Source action to autogenerate code (atleast in VScode)
 * 2) .hashCode() -> this method returns a integer value that represents a hashcode of an object
 *    -> It is an unique identifier that is used to compare objects
 *    -> You can also override this method by public String hashCode(){}
 * 3) .equals() -> You can override how you want to be compared.
 */

class A {
    public String name="Tharun";
    public int age=23;
    
    public String toString(){
        return "Hi I am "+name+", "+age+" old";
    }

    public int hashCode(){
        return age*10;
    }

    public boolean equals(A that){
        if(this.hashCode() == that.hashCode()) return true;
        return false;
    }

}


public class ObjectClassAndMethods {
    public static void main(String[] args) {
        A obj = new A();
        A obj1 = new A();
        System.out.println(obj);
        System.out.println(obj.equals(obj1));
    }
}