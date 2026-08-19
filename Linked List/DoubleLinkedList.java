public class DoubleLinkedList{
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
        Node head=null;
        Node tail=null;

        void Insertfirst(int data){
            Node Newnode=new Node(data);

            if (head==null){
                head = tail = Newnode;
            }
            else{
            Newnode.next=head;
            head.prev=Newnode;
            head=Newnode;
        }
    }

        void InsertEnd(int data){
                
                Node newNode=new Node(data);

                if(head==null){
                    head=tail=newNode;
                }
                else{
                    tail.next=newNode;
                    newNode.prev=tail;
                    tail=newNode;
                }
            }
        
        void InsertPosition(int data , int position){
            Node NewNode=new Node(data);

            if(position==1){
                Insertfirst(data);
                return;
            }

            Node temp=head;

            for(int i=0;i<position-1;i++){
                if(temp==null){
                    System.out.println("Invalid Position");
                }
                
                temp=temp.next;
            }

            NewNode.next=temp.next;
            NewNode.prev=temp;

            // if new Node is not inserted at end

            if(temp.next!=null){
                temp.next.prev=NewNode;
            }
            else{
                tail=NewNode;
            }
            temp.next = NewNode;
        }


        void DisplayForward(){
              
            Node temp=head;

                while(temp!=null){
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                }
                System.out.println("NULL");
            }

        void DisplayBackward(){
                Node temp=tail;

                while(temp!=null){
                    System.out.print(temp.data+" ");
                    temp=temp.prev;
                }
                System.out.println("NULL");
            
    }
      public static void main(String [] args){
         DoubleLinkedList DL=new DoubleLinkedList();

          DL.Insertfirst(20);
          DL.Insertfirst(10);

        DL.InsertEnd(40);
        DL.InsertEnd(50);

        DL.InsertPosition(30,2);

        System.out.println("Forward :");
        DL.DisplayForward();

        System.out.println("Backward :");
        DL.DisplayBackward();
    }
}
