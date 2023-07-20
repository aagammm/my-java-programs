abstract class Parent {
    public Parent() {
        System.out.println("Parent ka constructor hoon");
    }

    public void sayHello() {
        System.out.println("hello");
    }

    abstract void greet();

    abstract void greet2();
}

class Child extends Parent {
    public void greet() {
        System.out.println("Good Morning");
    }

    public void greet2() {
        System.out.println("Good Afternoon");
    }
}

abstract class Child2 extends Parent {
    public void good() {
        System.out.println("Hello Im good");
    }
}

public class AbstractMethod {
    public static void main(String[] args) {
        Child c = new Child();
        // Parent p=new Parent(); --->Will show error
        // Child2 c2=new Child2();--->Will show error
        c.greet();
        c.greet2();
    }
}
