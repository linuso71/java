package abstractDemo;

public class Daughter extends Parent{

    Daughter(int age){
        super(age);
//        this.age = age;
    }
    @Override
    void career(){
        System.out.println("i want to become doctor");
    }
    @Override
    void partner(){
        System.out.println("i love doctors");
    }
}
