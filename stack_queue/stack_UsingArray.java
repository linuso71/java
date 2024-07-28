

public class stack_UsingArray {
    public static void main(String[] args) {
        // int[] arr = new int[5];
        // arr.push(5);
        Stack_UsingArray stack = new Stack_UsingArray(5);
        stack.push(3);
        System.out.println(stack.top());
        stack.push(4);
        stack.push(5);
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.size());
    }
}

class Stack_UsingArray{
    private int size;
    private int[] intArray;
    private int top;
    public Stack_UsingArray(int size){
        this.size = size;
        intArray = new int[size];
        top = -1;
    }
    public void push(int data){
        if(!isFull()){
            intArray[++top] = data;
        }
        else{
            System.out.println("stack is full");
        }
    }
    public void pop(){
        if(!isEmpty()){
            top--;
        }
    }
    public boolean isFull(){
        return (top==size-1);
    }
    public int top(){
        return intArray[top];
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public int size(){
        if (isEmpty()){
            return 1;
        }
        return (top+1);
    }
}


