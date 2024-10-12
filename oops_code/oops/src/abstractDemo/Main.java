package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(20);
        System.out.println(son.age);
        son.career();
        son.partner();

        Daughter daughter = new Daughter(30);
        System.out.println(daughter.age);
        daughter.career();
        daughter.partner();

        // if i created the object of the parent we need to override this.
//        Parent parent = new Parent() {
//            @Override
//            void career() {
//
//            }
//
//            @Override
//            void partner() {
//
//            }
//        };
//        parent.career();

        Parent.greet();
        son.normal();
        System.out.println();
    }
}
