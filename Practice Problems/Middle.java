public class Middle{
    
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    Middle(){
        head = null;
    }

    int FindMiddle(int []arr){
        Node slow = head;
        Node fast = head;

        if(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }
   

    public static void main(String []args){
        Middle MD = new Middle();
        int[] arr = {10, 20, 30, 40,50};

         MD.head = new Node(arr[0]);
         Node current = MD.head;

        for (int i=1; i<arr.length;i++) {

         Node newNode = new Node(arr[i]);
         current.next = newNode;
         current = newNode;
  }
        int middle = MD.FindMiddle(arr);
        System.out.println("Middle ="+middle);
    
    }
}