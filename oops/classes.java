



public class classes {
    public static void main(String[] args) {
        Student user1 = new Student();
        Student user2 = new Student("linus",2,98.0f);
        Student user3 = new Student(user2);
        System.out.println(user3.name);
        // user1.name = "linus";
        // user1.rolno = 2;
        // System.out.println(user1);
        // System.out.println(user1.greet());
        System.out.println(user1.name);
    }
    
}
class Student{
    String name;
    int rolno;
    float marks = 90;

    // Student(){
    //     this.name = name; 
    //     this.rolno = rolno;
    // }
    String greet(){
        return "hello "+name+ " your roll no. is " + rolno;
    }
    Student(String name,int rolno,float marks){
        this.name = name;
        this.rolno = rolno;
        this.marks = marks;

    }
    // Student(){
    //     name = name;
    //     rolno = rolno;
    //     marks = marks;
    // }
    Student(Student other){
        name = other.name;
        rolno = other.rolno;
        marks = other.marks;
    }
    Student(){
        this("default name",0,0.0f);
    }

}