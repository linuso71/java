package generics.comparing;

public class Main {
    Student s1 = new Student(1,99.9f);
    Student s2 = new Student(2,67.4f);


    if (s1.compareTo(s2)<0){
        System.out.println(s1+" has more marks than " + s2);
    }
}
