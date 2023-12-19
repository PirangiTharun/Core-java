/**
 * Every method in interface is public abstract by default
 * Every variable in interface is final and static by default
 * 
 */
interface Computer{
    void run();
    void code();
}

class Laptop implements Computer {
    public void run(){
        System.out.println("running");
    }
    public void code(){
        System.out.println("Coding...");
    }
}

class Desktop implements Computer {
    public void run(){
        System.out.println("Running fast");
    }
    public void code() {
        System.out.println("Coding.. fast");
    }
}

class Employee {
    public void code(Computer com){
        com.run();
        com.code();
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Computer lappy = new Laptop();
        Computer desky = new Desktop();

        Employee emp = new Employee();
        emp.code(lappy);        
        emp.code(desky);

    }
}
