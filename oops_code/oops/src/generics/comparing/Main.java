package generics.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Student s1 = new Student(1,99.9f);
        Student s2 = new Student(3,65.4f);
        Student s3 = new Student(6,67.4f);
        Student s4 = new Student(4,98.4f);
        Student s5 = new Student(5,22.4f);
        Student s6 = new Student(2,33.4f);


        Student[] lis = {s1,s2,s3,s4,s5,s6};
        System.out.println(Arrays.toString(lis));
        Arrays.sort(lis, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Float.compare(o1.marks,o2.marks);
            }
        });
        System.out.println(Arrays.toString(lis));
        Arrays.sort(lis);


//        if (s1.compareTo(s2)>0){
//            System.out.println(s1.toString()+" has more marks than " + s2.toString());
//        }
    }

}
