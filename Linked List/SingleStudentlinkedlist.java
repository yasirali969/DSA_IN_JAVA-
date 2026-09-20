class SingleStudentlinkedlist{
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
       SingleStudentlinkedlist(){
          head = null;
       }
    
    void AddFront(Student s1){
        Node newnode = new Node(s1);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    void AddBack(Student s4){
        Node newnode = new Node(s4);

        if(head == null){
            head = newnode;
            return;
        }

        if(head.next ==null){
            head.next =newnode;
            return;
        }

        Node current = head;

        while(current.next!=null){
            current = current.next;
        }
        current.next = newnode;
    }

    void Addafter(int sid, Student s6){
        Node newnode = new Node(s6);

        if(head == null){
            System.out.println("Empty Linkedlist!");
            return;
        }

        Node current = head;
        while(current!=null && current.data.sid!=sid){
                current = current.next;
        }

        if(current==null){
            System.out.println("Target does not exist!");
            return;
        }

        newnode.next = current.next;
        current.next = newnode;
    }

    void addbefore(int sid,Student s7){
        Node newnode = new Node(s7);
        if(head == null){
            System.out.println("Empty linkedlist!");
            return;
        }

        if(head.data.sid== sid){
            newnode.next = head;
            head = newnode;
            return;
        }

        Node current = head;
        while(current.next!=null && current.next.data.sid!= sid){
                current = current.next;
        }

            if(current.next == null){
                System.out.println("Target does not exist!");
                return;
            }
 
            newnode.next = current.next;  // 1 2 3
            current.next = newnode;
    }

    void DeleteFront(){
        if(head == null){
            System.out.println("Empty linkedlist!");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        head = head.next;
    }

        void DeleteBack(){
            if(head == null){
                System.out.println("Empty Linkedlist!");
                return;
            }

            if(head.next == null){
                head = null;
                return;
            }

            Node current = head;
            while(current.next.next!=null){
                current = current.next;
            }
             current.next = null;
        }

        void Delete(int sid){
            if(head == null){
                System.out.println("Empty linkedlist!");
                return;
            }

            if( head.data.sid==sid){
                head = null;
                return;
            }

            Node current = head;
            while(current.next!=null && current.next.data.sid!=sid){
                        current = current.next;
            }

            if(current.next==null){
                System.out.println("Target does not exist!");
                return;
            }

            current.next = current.next.next;
        }

        boolean search(int sid){
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

    void Update(int sid , Student s8){
        Node newnode = new Node(s8);
        if(head == null){
            System.out.println("Empty linkedlist!");
            return;
        }

        Node current = head;
        while(current!=null && current.data.sid!=sid){
                current = current.next;
        }

        if(current==null){
            System.out.println("Student id does not exist!");
            return;
        }

        current.data.sid = newnode.data.sid;
        current.data.Name = newnode.data.Name;
        current.data.Age = newnode.data.Age;
        current.data.CGPA = newnode.data.CGPA;
        current.data.Percentage = newnode.data.Percentage;

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
        SingleStudentlinkedlist SS = new SingleStudentlinkedlist();
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
        SS.AddFront(s1);
        SS.AddFront(s2);
        SS.AddFront(s3);

        // Add Back
        SS.AddBack(s4);
        SS.AddBack(s5);

        // Addafter
        SS.Addafter(42,s6);

        // AddBefore
        SS.addbefore(42,s7);

        // Delete Front
        SS.DeleteFront();

        // DeleteBack
        SS.DeleteBack();

        // Delete
        SS.Delete(12);

        // Searching
        System.out.println("Found :"+ SS.search(43));

        // Update
        SS.Update(43,s8);
        SS.Display();
    }
}