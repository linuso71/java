package cloning;

public class Human implements Cloneable{
    String name;
    int age;
    int[] arr;


    public Human(String name,int age){
        this.name = name;
        this.age = age;
        this.arr = new int[]{1,2,3,4,5};

    }
    // shallow copy
//    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
//    }

    // deep copy manually adding values to it
        public Object clone() throws CloneNotSupportedException{
        Human twin =  (Human)super.clone(); // this is shallow copy only

        twin.arr = new int[twin.arr.length];
        for (int i=0;i<twin.arr.length;i++){
            twin.arr[i] = this.arr[i];
        }
        return twin;



    }

}

