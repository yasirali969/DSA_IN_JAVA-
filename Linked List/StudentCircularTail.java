public class StudentCircularTail{
 class Student{
    String Name;
    int semester;
    String Department;
    double gpa;
    Student(String Name,int semester,String Department,double gpa){
        this.Name = Name;
        this.semester = semester;
        this.Department = Department;
        this.gpa = gpa;
    }
 }
    class Node{
        Student data;
        Node next;
        Node(Student data){
            this.data = data;
            this.next = null;
        }
    }
     Node head;
     Node Tail;
     StudentCircularTail(){
        head = null;
        Tail = null;
     }

     void AddFront(String Name,int semester,String Department,double gpa){
           Student s = new Student(Name,semester,Department,gpa);
           Node newNode = new Node(s);

            // if empty linkedlist
           if(head == null){
                head = newNode;
                Tail = newNode;
                newNode.next = head;
                return;
           }

           newNode.next = head; 
           Tail.next = newNode;
           head = newNode;
     }

     void AddBack(String Name,int semester,String Department,double gpa){
        Student s = new Student(Name,semester,Department,gpa);
        Node newNode = new Node(s);
        
        if(head == null){
            head = newNode;
            Tail = newNode;
            newNode.next = newNode;
            return;
        }

        newNode.next = head ;
        Tail.next = newNode;
        Tail = newNode;
     }

     void AddAfter(String target,String Name,int semester,String Department,double gpa){
        Student s = new Student(Name,semester,Department,gpa);
        Node newNode = new Node(s);

        if(head == null){
            System.out.println("No linkedlist exist");
            return;
        }
        Node current = head;

      //current.data.Name==target

        do{
        if(current.data.Name.equals(target)){

            newNode.next =current.next;
            current.next = newNode;

               if(current==Tail){
                Tail = newNode;
            }
            return;
            }
            current = current.next;

        }while(current!=head);
        
            

     }

     void AddBefore(String target,String Name,int semester,String Department,double gpa){
        
        Student s = new Student(Name,semester,Department,gpa);
        Node newNode = new Node(s);

        if(head==null){
            System.out.println("No node exist!");
            return;
        }
       
        // if target is head
        if(head.data.Name == target){
            newNode.next = head;
            Tail.next = newNode;
            head = newNode;
            return;
        }

        Node current =  head;
        while(current.next!=head){

            if(current.next.data.Name==target){
                newNode.next = current.next;
                current.next =newNode;
                return;
            }

            current = current.next;
        }           
    }

        void DeleteFront(){
            // if linkedlist is empty
            if(head == null){
                System.out.println("Empty linkedlist!");
                return;
            }

            // if one node exist
            if(head == Tail){
                head = null;
                Tail = null;
                return;
            }
            head = head.next; // move head to next
            Tail.next = head; // last element must point head
        }

        void DeleteBack(){
            if(head == null){
                System.out.println("Empty LinkedList!");
                return;
            }
            Node current = head;
            // 1 3 4 5
        //  we will approach 3rd element and see if its next node refering head  then we will make current = current .next  it will delete the 3rd one make 2nd 
            while(current.next!=Tail){  
                current = current.next;
            }

            Tail  = current;
            Tail.next = head;
        }


        void DeleteAfter(String target){

            if(head == null){
                System.out.println("Empty linkedlist");
                return;
            }
        
        Node current = head;
        // 1 3 5 6 8
         while(current.next!=head){
            if (current.data.Name == target){

                Node deletenode = current.next; // first store next element to target in newnode
                // now check if that element is equal to head
                if (deletenode == head) {  
                head = head.next;
                Tail.next = head;
            }

            // If deleting Tail
            else if (deletenode == Tail) {
                Tail = current;
            }
                current.next = deletenode.next;  // move current to next to deleting element
                 return;
            }

        current =  current.next;
}

        System.out.println("Target Node does not exist!");
        }
    
    boolean Search(String target){
        if(head == null){
            System.out.println("Empty LinkedList");
            return false;
        }
         Node current = head;

        do{
            if(current.data.Name.equals(target)){
                return true;
            }
           current = current.next;

        }while(current!=head);
        return false;
    }

    void Update(String target,String Name,int semester,String Department,double gpa){
        

        if(head == null){
            System.out.println("Empty Linkedlist!");
            return;
        }
        Node current = head;
        do{
            if(current.data.Name == target){
                 current.data.Name = Name;
                 current.data.semester=semester;
                 current.data.Department= Department;
                 current.data.gpa = gpa;

                return;
            }

            current =  current.next;


        }while(current!=head);
    }
  
  
     void Display(){
            if(head == null){
                System.out.println("No Node exist!");
                return;
            }
            Node temp1=head;

            do {
                System.out.println("Name: " + temp1.data.Name +
                ", Semester: " + temp1.data.semester +
                ", Department: " + temp1.data.Department +
                ", GPA: " + temp1.data.gpa);

                temp1 =temp1.next;
            }while(temp1!=head);
        }

     public static void main(String []args){
        StudentCircularTail SC = new StudentCircularTail();
        SC.AddFront("Yasir",2,"Computer Science",3.45);
        SC.AddFront("Bilal",4,"Artificial Intelligence",3.85);
        SC.AddBack("Hassan",3,"Software Engineering",3.40);
        SC.AddBack("Saad", 1, "Data Science", 3.65);
        SC.AddAfter("Hassan", "Fahad",2, "Data Analyst", 3.52);
        SC.AddBefore("Yasir", "Asad",4, "Electrical Engineer", 3.52);
     //   SC.DeleteFront();
        SC.DeleteBack();
    //  SC.DeleteAfter("Yasir");
    //    boolean found =SC.Search("Yasir");
    //    System.out.println("Found ="+ found);
    //    SC.Update("Yasir","Yasir Ali",5,"BS Mathmatchis",3.65);


        SC.Display();
           
     }
}