class DoubleLinkedList{
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head;
        DoubleLinkedList(){
            head = null;
        }

        void AddFront(int data){
            Node newnode = new Node(data);
            if(head == null){
                head = newnode;
                head.prev = null;
                return;
            }

            newnode.next = head;
            head.prev = newnode;
            head = newnode;

        }

        void AddBack(int data){
            Node newnode = new Node(data);
            if(head == null){
              head = newnode;
              head.prev = null;
              return;  
            }

            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newnode;
            newnode.prev = current;

        }

        void AddAfter(int target , int data){
            Node newnode = new Node(data);
            if(head == null){
                head = newnode;
                head.prev = null;
                return;  
            }

            Node current = head;

            while(current!=null && current.data != target){
                    current = current.next;
            }
            newnode.next = current.next;
            newnode.prev = current;
            if(current.next != null){
                current.next.prev = newnode;
            }
            current.next = newnode;
        }

        void AddBefore(int target , int data){
            Node newnode = new Node(data);
            if(head == null){
                head = newnode;
                head.prev = null;
                return; 
            }

            if(head.data == target){
                newnode.next = head;
                head.prev = newnode;
                head = newnode;
                return;
            }

            Node current = head;
            while(current!=null && current.data != target){
                current = current.next;
            }

            if(current == null){
                System.out.println("Target does not exist!");
                return;
            }

                newnode.next = current;
                newnode.prev = current.prev;
                current.prev.next = newnode;
                current.prev = newnode;
        }

        void DeleteFront(){
            if(head == null){
                System.out.println("Empty linkedlist!");
                return;
            }
            head = head.next;
            if(head!=null){
                head.prev= null;
            }
        }

        void DeleteBack(){
            if(head == null){
                System.out.println("Empty linkedlist!");
                return;
            }

            if(head.next == null){
                head = null;
                return;
            }

            Node current = head;
            while(current.next!=null){
                 current = current.next;
            }

            current.prev.next = null;

        }

        void Delete(int target){
            if(head == null){
                System.out.println("Empty linkedlist!");
                return;
            }

            if(head.data == target){
                head = head.next;
                return;
            }

            Node current = head;
            while(current.next!=null && current.data != target){
                    if(current.next == null){
                        current.prev.next = null;
                        return;
                    }
                    current = current.next;
            }

                if(current.next == null){
                    System.out.println("Target does not exist!");
                    return;
                }

             current.prev.next = current.next.next;

        }
        void Display(){
        Node current = head;

        while(current!=null){
            System.out.println(current.data+" ");
            current = current.next;
        }
    }

    public static void main(String []args){
        DoubleLinkedList DL = new DoubleLinkedList();
        DL.AddFront(50);
        DL.AddFront(40);
        DL.AddFront(30);
        DL.AddFront(20);
        DL.AddFront(10);

        DL.AddBack(60);
        DL.AddBack(70);
        DL.AddBack(80);

        // AddAfter
        DL.AddAfter(60,66);

        // AddBefore
        DL.AddBefore(40,35);

        // DeleteFront
        DL.DeleteFront();

        // DeleteBack
        DL.DeleteBack();

        // Delete
        DL.Delete(60);
        DL.Display();
    }
}