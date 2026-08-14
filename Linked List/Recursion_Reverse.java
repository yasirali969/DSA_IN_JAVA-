public class Recursion_Reverse{

    static class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=next;
    }
}
    static Node Reverse(int []arr,int index,int size,Node prev){
        if(index==size){
            return prev;
        }

        else {
            Node temp;
            temp=new Node(arr[index]);
            temp.next=prev;
            return Reverse(arr,index+1,size,temp);

        }
        }
    
    public static void main(String [] args){
        Node head=null;

        int [] arr={3,6,9,12,15};

        head=Reverse(arr,0,5,head);

        Node p=head;

        while(p!=null){
            System.out.print(p.data+" ");
            p=p.next;
        }

    }
}