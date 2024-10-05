package inheritance;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//    Box box = new Box();
//    System.out.println(box.l + " " + box.b+" "+ box.h);
//    boxWeight box1 = new boxWeight(2,3,4,5);
//    System.out.println(box1.weight);

//        Box box3 = new boxWeight(2,3,4,5);
//        System.out.println(box3.b);
//        System.out.println(box3.weight); //error
//
//        boxWeight box4 = new Box(2,3,4); // error

//        Box box = new boxWeight(2,3,4,5);
////        boxWeight box1 = new boxWeight(box);
//        System.out.println(box.l);

        BoxSize size = new BoxSize();
        System.out.println(size.b);

        BoxColor color = new BoxColor(1,2,3,4,"blue");
        System.out.println(color.color);

    }
}