public class Delete_FirstNode{
    static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }

    }
    public static void main(String[]args){

        int []arr={1,2,4,5,6};

        Node Head=new Node(arr[0]);
        Node temp=Head;

        for(int i=1;i<arr.length;i++){
            temp.next=new Node(arr[i]);
            temp=temp.next;
        }

        if(Head!=null){
                Head=Head.next;
        }
             temp=Head;
            while(temp!=null){
             System.out.print(temp.data+" ");
             temp=temp.next;
            }
        

    }
}