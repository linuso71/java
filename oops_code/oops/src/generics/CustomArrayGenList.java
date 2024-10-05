package generics;

import java.util.Arrays;

public class CustomArrayGenList<T> {
    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayGenList(){
        this.data = new Object[DEFAULT_SIZE];
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
        CustomArrayGenList<Integer> arr = new CustomArrayGenList<>();
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

        CustomArrayGenList<String> arr2 = new CustomArrayGenList<>();
        arr2.add("hello");
        System.out.println(arr2.display());
    }
}
