class SingleStudentlinkedTail{
        static class Student{
        int sid;
        String Name;
        int Age;
        double CGPA;
        double Percentage;
        Student(int sid,String Name, int Age,double CGPA,double Percentage){
            this.sid = sid;
            this.Name = Name;
            this.Age  = Age;
            this.CGPA = CGPA;
            this.Percentage = Percentage;
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
    Node tail;
    SingleStudentlinkedTail(){
        head = null;
        tail = null;
    }

    void AddFront(Student s1){
        Node newnode = new Node(s1);

        if(head == null){
            head = newnode;
            tail = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    void AddBack(Student s4){
         Node newnode = new Node(s4);

        if(head == null){
            head = newnode;
            tail = newnode;
            return;
        }

        tail.next = newnode;
        tail = newnode;

    }

    void Addafter(int sid,Student s5){
        Node newnode = new Node(s5);
        if(head == null){
            System.out.println("Empty linkedlist!");
            return;
        }

        Node current = head;
        while(current!=null && current.data.sid != sid){
              if(current == tail){
                tail.next = newnode;
                tail = newnode;
                return;
              }
               current = current.next;
        }

            if(current==null){
                System.out.println("Student does not exist!");
                return;
            }

            newnode.next = current.next;
            current.next = newnode;
            
    }

    void AddBefore(int sid, Student s6){
        Node newnode = new Node(s6);
        if(head == null){
            System.out.println("Empty linkedlist!");
            return;
        }

        if(head.data.sid == sid){
            newnode.next = head;
            head = newnode;
            return;
        }
        Node current = head;

        while(current.next!=null && current.next.data.sid != sid){
            current = current.next;  // 1 2 3 4 6 7
        }

            if(current.next == null){
                System.out.println("Student id does not exist");
                return;
            }
            newnode.next = current.next;
            current.next = newnode;

            if(current == tail){
                tail = current;
            }

    }

    void DeleteFront(){
        if(head == null){
            System.out.println("Empty Linkedlist!");
            return;
        }

        if(head == tail){
            head = null;
            tail = null;
            return;
        }
         head = head.next;
    }

    void DeleteBack(){
        if(head == null){
            System.out.println("Empty linkedlist!");
            return;
        }

        if(head == tail){
            head = null;
            tail = null;
            return;
        }

        Node current = head;

        while(current.next!=tail){
            current = current.next;
        }
            current.next = null;
            tail = current;
    }

    void Delete(int sid){
        if(head == null){
            System.out.println("Empty linkedlist!");
            return;
        }

        if(head.data.sid == sid){
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next!=null && current.next.data.sid!=sid){
            current = current.next;
        }
         if(current.next== null){
            System.out.println("Studet id does not exist!");
            return;
         }

         if(current.next == tail){
            tail = current;
         }

         current.next = current.next.next;
    }

    boolean Search(int sid){
        if(head == null){
            System.out.println("Empty linkedlist!");
            return false;
        }

        Node current = head;
        while(current!=null){
                    if(current.data.sid == sid){
                        return true;
                    }
               current = current.next;
        }

            return false;


    }

    void Update(int sid,Student s10){
        
        if(head == null){
            System.out.println("Empty linkedlist!");
            return;
        }

        Node current = head;
        while(current!=null && current.data.sid!= sid){
            current = current.next;
        }
        
            if(current==null){
                System.out.println("Student does not exist!");
                return;
            }

            current.data.sid = s10.sid;
            current.data.Name = s10.Name;
            current.data.Age = s10.Age;
            current.data.CGPA = s10.CGPA;
            current.data.Percentage = s10.Percentage;


        
    }
    void Display(){
        Node current = head;

        while(current!=null){
            System.out.println("=================================");
            System.out.println("Student Id :"+ current.data.sid);
            System.out.println("Student Name :"+ current.data.Name);
            System.out.println("Student Age :"+ current.data.Age);
            System.out.println("Student CGPA :"+ current.data.CGPA);
            System.out.println("Student Percentage :"+ current.data.Percentage);
            current = current.next;
        }
    }

    public static void main(String []args){
        SingleStudentlinkedTail SL = new SingleStudentlinkedTail();
        Student s1 = new Student(12,"Yasir",15,3.4,86.5);
        Student s2 = new Student(13,"Umair",23,3.5,91.5);
        Student s3 = new Student(42,"Inam",32,3.12,75.5);
        Student s4 = new Student(43,"Ali",21,3.45,82.5);
        Student s5 = new Student(44,"Ahmed",24,2.98,68.5);
        Student s6 = new Student(45,"Hamza",20,3.75,88.0);
        Student s7 = new Student(46,"Usman",23,3.12,74.0);
        Student s8 = new Student(47,"Bilal",22,2.85,65.5);
        Student s9 = new Student(48,"Hassan",25,3.60,91.0);
        Student s10 = new Student(49,"Rehan",21,3.25,79.5);       
        
        // Add Front
        SL.AddFront(s1);
        SL.AddFront(s2);
        SL.AddFront(s3);

        // Add Back
        SL.AddBack(s4);

        // Add After
        SL.Addafter(13,s5);

        // Add Before
        SL.AddBefore(42,s6);

        // Delete front
        SL.DeleteFront();

        // Delete Back
        SL.DeleteBack();

        // Delete 
        SL.Delete(44);

        //Searching
        System.out.println("Found :"+SL.Search(12));

        // Update 
        SL.Update(12,s10);
        SL.Display();

    }
}