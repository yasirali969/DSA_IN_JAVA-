public class Delete_LastNode{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String []args){
        int []arr={2,3,4,5,6};

        Node Head= new Node(arr[0]);
        Node tail=Head;


        for(int i=1;i<arr.length;i++){
            tail.next=new Node(arr[i]);
            tail=tail.next;
}

         Node temp=Head;
         while(temp.next.next!=null){
            temp=temp.next;
         }
         temp.next=null;

         temp=Head;
         while(temp!=null){
            System.out.println(temp.data +" ");
            temp=temp.next;
         }

        

    }
}