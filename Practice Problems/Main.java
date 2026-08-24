class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Linkedlist{
    Node head;

    Linkedlist(){
        head=null;
    }

    void addFront(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    void deleteFront(){
        
        if(head==null){
            System.out.println("Null");
            return;
        }
        head=head.next;
    }

    void addback(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node current = head;

            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }

    boolean search(int data){
        Node current=head;
        while(current!=null){
            if(current.data==data){
                return true;
            }
            current=current.next;
        }
        return false;
    }

    void addAfter(int target,int data){
        Node newNode=new Node(data);
        Node current=head;

        while(current.data!=target){
            current=current.next;
        }
        newNode.next=current.next;
        current.next=newNode;
    }
    void deleteBack(){
        Node temp=head;
        if(head==null){
            System.out.println("Null");
            return;
        }

        if(head.next==null){
            head=null;
            return;
        }
        while(temp.next.next != null){
            temp=temp.next;
        }
        temp.next=null;
    }

        void deleteAfter(int data){
            Node current=head;

            while(current!=null && current.data!=data){
                 current=current.next;
            }
            current.next=current.next.next;

        }

        void Update(int oldval,int newval){
            Node current = head;
        
            while(current!=null){
                if(current.data==oldval){
                    current.data=newval;
                }
            current=current.next;
            }
        }

    void  Addbefore(int target,int data){
            Node newNode = new Node(data);
            Node current =head;
            Node prev=null;

            while(current.data!=target){
                prev=current;
                current = current.next;
            }

            newNode.next=current;
            prev.next=newNode;
            
        }

    void DeleteNode(int target){
        Node current = head;

        while(current.data!=target){
            current=current.next;
        }
        current.next=current.next.next;
    }

    void display(){
        Node current=head;

        while(current!=null){
            System.out.println(current.data+" ");
            current=current.next;
        }
    }
}

class Main{
    public static void main(String []args){
        Linkedlist list=new Linkedlist();
        list.addFront(50);
        list.addFront(40);
        list.addFront(30);
        

        list.addback(80);
        list.addback(90);
        list.addback(100);

        list.addAfter(30,60);
        list.addAfter(100,110);
        list.Addbefore(40,35);

    //    list.Update(40,150);

      

     //   list.deleteFront();

     //  list.deleteBack();
        list.deleteAfter(80);
        list.DeleteNode(40);

        list.display();
        
        boolean Search=list.search(50);
        System.out.println("Found :"+Search);
    }
}



// addBack, addMiddle, deleteBack, deleteMiddle, update, addAfter, deleteAfter