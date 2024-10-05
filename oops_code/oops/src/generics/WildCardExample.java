package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardExample<T extends Number> {
    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildCardExample(){
        this.data = new Object[DEFAULT_SIZE];
    }

    // we can set any type which comes under number
    // we can't add element
    public void getList(List<? extends Number> lis) {
            System.out.println(lis.getClass());  // Use get(0) instead of getFirst()
        // do something
    }


    public void add(T num){
        if (this.isFull()){
            resize();
        }
        data[size++] = num;
    }

    public boolean isFull(){
        return size == data.length;
    }
    public void resize(){
        Object[] temp = new Object[data.length*2];
        for(int i=0;i<data.length;i++){
           temp[i] = data[i];
        }
//        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    public String display(){
        return Arrays.toString(Arrays.stream(data).limit(size).toArray());
    }

    public int getSize(){
        return size;
    }

    public Object remove(){
        return data[--size];
    }

    public T get(int index){
        return (T) data[index];
    }

    public void set(int index,int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "{"+ "data=" + display()+" "+ ", size =" + size +"}";
    }

    public static void main(String[] args) {
        WildCardExample<Integer> arr = new WildCardExample<>();
        arr.add(10);
        arr.add(6);
        arr.add(7);
        arr.add(2);
        arr.add(8);
        arr.add(4);
        arr.add(2);
        arr.add(10);
        arr.add(9);
        arr.add(0);
        arr.add(100);
        System.out.println(arr.display());
        System.out.println(arr.getSize());
        System.out.println(arr.remove());
        System.out.println(arr.getSize());
        arr.set(0,2);
        arr.display();
        System.out.println(arr.toString());

        WildCardExample<Integer> arr2 = new WildCardExample<>();
//        arr2.add("hello");
//        System.out.println(arr2.display());
        ArrayList<Integer> lis = new ArrayList<>(10);
        arr2.getList(lis);
    }
}
