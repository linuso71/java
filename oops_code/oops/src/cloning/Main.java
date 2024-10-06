package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human human = new Human("linus",23);
        Human human_new = (Human)human.clone();
        System.out.println(human_new.name + " " + human_new.age);
        human_new.arr[0] = 100;
        System.out.println(Arrays.toString(human.arr));
        System.out.println(Arrays.toString(human_new.arr));
    }
}
