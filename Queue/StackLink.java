class StackLink{
    static class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    Node top;
    int size;
        StackLink(){
            top = null;
            size = 0;

        }

    void push(String Name){
        Node newnode = new Node(Name);
        size++;
        if(IsEmpty()){
            top = newnode;
            return;
        }

        newnode.next = top;
        top = newnode;
    }

    String pop(){
        if(IsEmpty()){
            throw new RuntimeException("Stack is Empty!");
        }

        String topdata = top.data;
        top = top.next;
        size--;
        return topdata;
    }

    String Peek(){
        if(top == null){
            throw new RuntimeException("Stack is Empty!");
        }
        
        return top.data;
    }

    boolean IsEmpty(){
        return top == null;
    }

    int size(){
        return size;
    }

    void Display(){
        Node current = top;

        while(current!=null){
            System.out.println(current.data+" ");
            current = current.next;
        }
    }

    public static void main(String []args){
        StackLink  SL = new StackLink();
        SL.push("Yasir");
        SL.push("Asad");
        SL.push("Fahad");
        SL.push("Umer");
        SL.Display();
        System.out.println("======================================");
        String Getdata = SL.pop();
        System.out.println(Getdata +" has been removed from the linkedlist!");
        System.out.println("======================================");
        SL.Display();

        String Topdata = SL.Peek();
        System.out.println("Top element is ="+Topdata);

        System.out.println("Size ="+SL.size);


    }
}