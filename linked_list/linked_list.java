class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node (int data1){
        this.data = data1;
        this.next = null;

    }
};


public class linked_list { 
    private static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    private static int length_ll(Node head){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            count ++;
            
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7};
        // Node x = new  Node(arr[1]); // creating one node with null
        // System.out.println(x.data);

        Node head = convertArr2LL(arr);
        // System.out.println(head.data);
        // traverse in ll
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        // length of the ll
        System.out.println();
        System.out.println(length_ll(head));

    }
}
