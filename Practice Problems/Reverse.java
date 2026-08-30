public class Reverse{
    
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    Reverse(){
        head = null;
    }

    void Reverselinkedlist(){
         Node prev = null;
    Node current = head;

    while (current != null) {
        Node next = current.next; // save next node  20 30 40 50 null
        current.next = prev;      // reverse link    null 10 20 30 40
        prev = current;           // move prev forward  10 20 30 40 50
        current = next;           // move current forward 20 30 40 50 null
    }
        head = prev;
    }

        void displayNode(){
        Node current=head;

        while(current!=null){
            System.out.println(current.data+" ");
            current=current.next;
        }
    }
   

    public static void main(String []args){
        Reverse R = new Reverse();
        int[] arr = {10, 20, 30, 40,50};

         R.head = new Node(arr[0]);
         Node current = R.head;

        for (int i=1;i<arr.length;i++) {

         Node newNode = new Node(arr[i]);
         current.next = newNode;
         current = newNode;
  }
        R.Reverselinkedlist();
        R.displayNode();
    
    }
}