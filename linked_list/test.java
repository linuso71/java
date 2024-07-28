class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data = data1;
        this.next = next1;
    }
    
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}


public class test {
    private static Node arraytoLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    private static int ll_length(Node head) {
        Node temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    private static void traverseLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
       int[] arr = {1,2,3,4};
    //    Node y = new Node(arr[2]);
    //    System.out.println(y.data);
        Node head = arraytoLL(arr);
        // System.out.println(head.data);
        // System.out.println(ll_length(head)); 
        traverseLL(head);
    }
}
