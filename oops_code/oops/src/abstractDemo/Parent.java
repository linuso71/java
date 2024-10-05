package abstractDemo;

public abstract class Parent {
    int age;
    final int value;
    Parent(int age){
        this.age = age;
        value = 2;
    }


    abstract void career();
    abstract void partner();

    static void greet(){
        System.out.println("hello everyone");
    }

    public void normal(){
        System.out.println("i am normal method");
    }
}
