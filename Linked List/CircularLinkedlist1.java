class CircularLinkedlist1{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        Node head;
        CircularLinkedlist1(){
            head = null;
        }

        void Addfront(int data){
            Node newnode = new Node(data);
            if(head == null){
                head = newnode;
                head.next = head;
                return;
            }

            Node current = head;
            while(current.next!=head){
                current = current.next;
            }

            newnode.next = head;
            current.next = newnode;
            head = newnode;

        }

        void AddBack(int data){
            Node newnode = new Node(data);

            if(head == null){
                head = head;
                head.next = newnode;
                return;
            }
        
            Node current = head;

            while(current.next!=head){
                current = current.next;
            }

            newnode.next = head;
            current.next = newnode;
        }

        void AddAfter(int target , int data){
            Node newnode = new Node(data);

            Node current = head;

            if(head == null){
                System.out.println("Empty Linkedlist!");
                return;
            }

            if(current.data == target){
                newnode.next = current.next;
                current.next = newnode;
                return;
            }

            while(current.data!= target){
                 current = current.next;

                if(current == head){
                System.out.println("target does not exist");
                return;
            }
            }

            

            newnode.next = current.next;
            current.next = newnode;
        }

        void AddBefore(int target,int data){
            Node newnode = new Node(data);
            if(head == null){
                System.out.println("Empty linkedlist!");
                return;
            }

            if(head.data==target){
                Node current = head;

                while(current.next!=head){
                    current = current.next;
                }

                newnode.next = head;
                current.next = newnode;
                head = newnode;
                return;
            }

            Node current = head;

            while(current.next!=head && current.next.data !=target){
                    current = current.next;
            }

            if(current.next == head){
                System.out.println("Target does not exit!");
                return;
            }

            newnode.next = current.next;
            current.next = newnode;
        }

        void DeleteFront(){
            if(head == null){
                System.out.println("Empty Linkedlist!");
                return;
            }

            if(head.next == head){
                head = null;
                return;
            }

            Node current = head;

            while(current.next!=head){
                current = current.next;
            }
            
            head = head.next;
            current.next = head;
        }


        void DeleteBack(){

            if(head == null){
                System.out.println("Empty linkedlist!");
                return;
            }

            if(head.next == head){
                head = null;
                return;
            }

            Node current = head;
            while(current.next.next!=head){
                current = current.next;
            }

            current.next = head;

        }

        void Delete(int target){
            if(head == null){
                System.out.println("Empty linkedlist!");
                return;
            }

            if(head.data == target){
                     if(head.next==head){
                        head = null;
                        return;
                     }
            Node current = head;

            while(current.next!=head){
                current = current.next;
            }
            
            head = head.next;
            current.next = head;
                
            }

            Node current = head;

            while(current.next!=head && current.next.data !=target){
                    current = current.next;
            }
                    if(current.next == head){
                        System.out.println("Target does not exist!");
                        return;
                    }

                    if(current.next.next!=head){
                    current.next = current.next.next;
                 }

        }

        boolean Search(int target){
        
            if(head == null){
                System.out.println("Empty linkedlist!");
                return false;
            }

            Node current = head;

            do{
                 if(current.data == target){
                      return true;
                 }
                 current = current.next;
            }while(current!=head);

            return false;
        }

        void Display(){
        Node current = head;

        do{
            System.out.println(current.data+" ");
            current = current.next;
        }while(current!=head);
    }

    public static void main(String []args){
        CircularLinkedlist1 Cl = new CircularLinkedlist1();
        Cl.Addfront(5);
        Cl.Addfront(3);
        Cl.Addfront(2);
        Cl.Addfront(1);

        // AddBack
        Cl.AddBack(7);
        Cl.AddBack(8);
        Cl.AddBack(9);
        Cl.AddBack(10);


        // AddAfter
        Cl.AddAfter(5,6);
        Cl.AddBefore(5,4);

        // DeleteFront
        Cl.DeleteFront();

        // Delete Back
        Cl.DeleteBack();

        // Delete
        Cl.Delete(8);

        // Search
        System.out.println("Search Found :"+Cl.Search(9));
        Cl.Display(); 
          }
}