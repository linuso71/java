package abstractDemo;

public class Son extends Parent{
    Son(int age){
        super(age);
//        this.age = age;
//        System.out.println(value);
    }

    @Override
    public void normal(){
        System.out.println("i am son");
        System.out.println(value);
    }
    @Override
    void career() {
        System.out.println("i want to become coder");
    }

    @Override
    void partner() {
        System.out.println("i love coding");
    }
}
