class PirorityQueueLinkedlist{
    static class Student{
        int StudentId;
        String StudentName;
        int StudentAge;
        double StudentCGPA;
        double StudentInterPercentage;

        Student(int StudentId,String StudentName,int StudentAge,double StudentCGPA,double StudentInterPercentage){
             this.StudentId = StudentId;
             this.StudentName = StudentName;
             this.StudentAge = StudentAge;
             this.StudentCGPA = StudentCGPA;
             this.StudentInterPercentage = StudentInterPercentage;
        }
    }

    static class Node{
        Student data;
        Node next;
        Node prev;
        Node(Student data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node Tail;
    int count;
    PirorityQueueLinkedlist(){
        head =  null;
        Tail =  null;
        count= 0;
    }

    void insert(Student s1){
        Node newnode = new Node(s1);
        if(head == null){
            head = newnode;
            Tail = newnode;
            head.prev = null;
            return;
        }

        // if we want to insert before head
        if(newnode.data.StudentCGPA < head.data.StudentCGPA){

                newnode.next= head; 
                newnode.prev=null;
                head.prev = newnode;
                head = newnode;
                return;
            }

        Node current = head;

        while(current.next!=null){

            if(newnode.data.StudentCGPA < current.data.StudentCGPA){
                 newnode.next = current;
                 newnode.prev = current.prev;
                 current.prev.next = newnode;
                 current.prev = newnode;
            }

            else if(newnode.data.StudentCGPA == current.data.StudentCGPA){
                if(newnode.data.StudentAge < current.data.StudentAge){
                        newnode.next = current;
                        newnode.prev = current.prev;
                        current.prev.next = newnode;
                        current.prev = newnode;


                }
            }

            current = current.next;            
        }

        // inserting at the end of node
        current.next = newnode;
        newnode.prev = current;
        newnode.next = null;
        Tail = newnode;
        

    }
    // Display Student Record
     void Display(){
        Node temp = head;

        while(temp!=null){
            System.out.println("---------------------------------");
            System.out.println("StudentId ="+ temp.data.StudentId);
            System.out.println("StudentName ="+ temp.data.StudentName);
            System.out.println("StudentAge =" +temp.data.StudentAge);
            System.out.println("StudentCGPA =" +temp.data.StudentCGPA);
            System.out.println("StudentInterPercentage ="+ temp.data.StudentInterPercentage);
            System.out.println("---------------------------------");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    Student extractMax (){
        if(head == null){
            throw new RuntimeException("Queue is Empty!");
        }

        if(head == Tail){
            head = null;
            Tail = null;
        }

        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        Student s = current.data;
        current.prev.next = null;
        Tail = current.prev;
        return s;
    }

    Student extractMin(){
        if(head == null){
            throw new RuntimeException("Queue is Empty!");
        }

        if(head == Tail){
            head = null;
            Tail = null;
        }


        Student min = head.data;
        head = head.next;
        head.prev = null;
        return min;
    }

    public static void main(String [] args){
        PirorityQueueLinkedlist PQ = new PirorityQueueLinkedlist();
        Student s1 = new Student(354,"Yasir Ali",23,3.35,93);
        Student s2 = new Student(653,"Umair Khan",43,3.25,54);
        Student s3 = new Student(943,"Prem Kumar",11,3.15,78);
        Student s4 = new Student(543,"Fakar Kumar",55,2.5,18);
            PQ.insert(s3);
            PQ.insert(s2);
            PQ.insert(s1);
            PQ.insert(s4);
            PQ.Display();

            Student s=PQ.extractMax();
            System.out.println("---------------------------------");
            System.out.println("StudentId ="+ s.StudentId);
            System.out.println("StudentName ="+ s.StudentName);
            System.out.println("StudentAge =" +s.StudentAge);
            System.out.println("StudentCGPA =" +s.StudentCGPA);
            System.out.println("StudentInterPercentage ="+ s.StudentInterPercentage);
            System.out.println("---------------------------------");
            PQ.Display();

            

            Student min=PQ.extractMin();
            System.out.println("---------------------------------");
            System.out.println("StudentId ="+ min.StudentId);
            System.out.println("StudentName ="+ min.StudentName);
            System.out.println("StudentAge =" +min.StudentAge);
            System.out.println("StudentCGPA =" +min.StudentCGPA);
            System.out.println("StudentInterPercentage ="+ min.StudentInterPercentage);
            System.out.println("---------------------------------");
            PQ.Display();
}
}