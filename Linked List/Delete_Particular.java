public class Delete_Particular{
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
        int x=3;
        Node Head= new Node(arr[0]);
        Node curr=Head;

        for (int i = 1;i <arr.length;i++) {
            curr.next=new Node(arr[i]);
            curr=curr.next;
        }

        Node prev=null;
        curr=Head;

        x--;

        while(x>0){
            prev=curr;
            curr=curr.next;
            x--;
        }
        prev.next = curr.next;

        Node temp=Head;

        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }

       
        

    }
}