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
class DoublyWithTail{
        Node head;
        Node tail;
        DoublyWithTail(){
            head = null;
            tail = null;
        }

        void AddFront(int data){
            Node newNode = new Node(data);

            if(head == null){
                head = tail =newNode;
                return ;
            }

            newNode.next = head;
            head . prev =newNode;
            head = newNode;
        }

        void DisplayForward(){
            Node current = head;

            System.out.println("NULL <->");
            while(current !=null){
                System.out.println(current.data+" ");
                current = current.next;
            }
            System.out.println("NULL");
        }

        void DisplyReverse(){
            Node current = ;

            while(current.prev != null){
                System.out.println(current.prev+" ");
                current= current.prev;
            }
        }

        public static void main(String []args){
            DoublyWithTail DT = new DoublyWithTail();
            DT.AddFront(45);
            DT.AddFront(55);
            DT.AddFront(65);
            DT.AddFront(75);
            DT.DisplayForward();
            DT.DisplyReverse();
        }
}