public class queue_UsingArray {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        System.out.println(queue.top());
        System.out.println(queue.size());
        queue.pop();
        System.out.println(queue.size());
        System.out.println(queue.top());

    }
}

class Queue{
    private int size;
    private int[] intArray;
    private int count;
    private int rear;
    private int front;

    public Queue(int size){
        this.size = size;
        intArray = new int[5];
        count = 0;
        rear = 0;
        front = 0;

    }
    public void push(int data){
        if(!isFull()){
            intArray[rear%size] = data;
            rear++;
            count++;
        }
    }
    public void pop(){
        if(!isEmpty()){
            intArray[front%size] = -1;
            front++;
            count--;
        }
    }
    public boolean isFull(){
        return (count == size);
    }
    public boolean isEmpty(){
        return (count == 0);
    }
    public int top(){
        return (intArray[front]);
    }
    public int size(){
        return count;
    }
}
