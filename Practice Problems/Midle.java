class Midle{
    class Node{
         int data;
         Node next;
         Node(int data){
            this.data = data;
            this.next = null;
         }
    }
    Node head;
    int size;
        Midle(){
            head = null;
            size = 0;
        }

    void Addfront(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            size++;
            return;
        }
        newnode.next = head;
        head = newnode;
        size++;
    }

    void  findMiddle(){
        int a = (size) / 2;
        Node current = head;
        while(a>0){
            a--;
            current = current.next;
        }
        System.out.println("Middle :"+current.data);

    }
    

    
    void Display(){
        Node current = head;
        while(current!=null){
            System.out.println(current.data+" ");
            current = current.next;
        }

    }


    public static void main(String []args){
        Midle c = new Midle();
        c.Addfront(50);
        c.Addfront(40);
        c.Addfront(30);
        c.Addfront(20);
        c.Addfront(10);
        c.Display();
        c.findMiddle();
        
    }

}