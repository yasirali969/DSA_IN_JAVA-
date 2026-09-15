class PirorityQueueUnsorted{
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
        PirorityQueueUnsorted(){
                head = null;
                Tail = null;
            }

    void insert(Student s){
        Node newnode = new Node(s);

        if(head == null){
            head = newnode;
            Tail = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;

    }

    Node Getmin(){

         if(head == null){
             throw new RuntimeException("Empty Queue!");
        }


        Node current = head;
        Node minGPA = head;
        Node prev = null;
        while(current!=null){
            if(current.data.StudentCGPA < minGPA.data.StudentCGPA){
                 minGPA = current;     
            }
             else if (current.data.StudentCGPA == minGPA.data.StudentCGPA
                    && current.data.StudentAge < minGPA.data.StudentAge) {

                   minGPA = current;
            }
            current = current.next;
        }
                return minGPA;
    }

    Student extractmin(){
        Node current = head;
        Node MinGpa =  head;
        Node prev = null;
        Node MinPrev = null;

        if(head == null){
             throw new RuntimeException("Empty Queue!");
        }
        

        while(current!=null){
            if(current.data.StudentCGPA < MinGpa.data.StudentCGPA){
                            MinGpa =  current;
                            MinPrev = prev;
                            
            }

             else if (current.data.StudentCGPA == MinGpa.data.StudentCGPA
                    && current.data.StudentAge < MinGpa.data.StudentAge) {

                MinGpa = current;
                MinPrev = prev;
            }
            prev = current;
            current = current.next;

        }

            if(head.data.StudentCGPA == MinGpa.data.StudentCGPA
            && current.data.StudentAge > MinGpa.data.StudentAge){
                MinPrev = head;
                head = head.next;
                return MinPrev.data;
            }

            if(MinGpa.next==null){
                Tail = MinPrev;
                MinPrev.next = null;
            }
            Student s = MinGpa.data;
            MinPrev.next = MinGpa.next;
            return s;
    }


    Node Getmax(){

        if(head == null){
             throw new RuntimeException("Empty Queue!");
        }
        Node current = head;
        Node maxGPA = head;
        Node prev = null;
        while(current!=null){
            if(current.data.StudentCGPA > maxGPA.data.StudentCGPA){
                 maxGPA = current;
                 
            }
                        else if (current.data.StudentCGPA == maxGPA.data.StudentCGPA
                    && current.data.StudentAge < maxGPA.data.StudentAge) {

                maxGPA = current;
            }

            current = current.next;
        }

        
                return maxGPA;
    }

    Student extractmax(){
        Node current = head;
        Node MaxGpa =  head;
        Node prev = null;
        Node MaxPrev = null;

        if(head == null){
             throw new RuntimeException("Empty Queue!");
        }
        

        while(current!=null){
            if(current.data.StudentCGPA > MaxGpa.data.StudentCGPA){
                            MaxGpa =  current;
                            MaxPrev = prev;
                            
            }
            prev = current;
            current = current.next;

        }

            if(head.data.StudentCGPA == MaxGpa.data.StudentCGPA
            && current.data.StudentAge < MaxGpa.data.StudentAge){
                MaxPrev = head;
                head = head.next;
                return MaxPrev.data;
            }

            if(MaxGpa.next==null){
                Tail = MaxPrev;
                MaxPrev.next = null;
            }
          MaxPrev.next = MaxGpa.next;
          Student s = MaxGpa.data;
          return s;
    }

    void Display(){
        Node current = head;

        while(current!= null){
            System.out.println("Student Id ="+current.data.StudentId);
            System.out.println("Student Name ="+current.data.StudentName);
            System.out.println("Student Age ="+current.data.StudentAge);
            System.out.println("Student CGPA ="+current.data.StudentCGPA);
            System.out.println("Student Percentage ="+current.data.StudentInterPercentage);
            System.out.println("=======================================");

            current = current.next;
        }
    }

        public static void main(String [] args){
            PirorityQueueUnsorted PQU = new PirorityQueueUnsorted();
            Student s = new Student(123,"Yasir ALi",23,3.45,89.4);
            Student s1 = new Student(432,"Zubair Anjum",41,3.54,91.4);
            Student s2 = new Student(123,"Rehan Shakih",23,3.67,79.4);
            Student s3 = new Student(124, "Ahmed Khan", 21, 3.25, 82.5);
            Student s4 = new Student(125, "Ali Raza", 22, 3.89, 91.2);
            Student s5 = new Student(126, "Hamza Malik", 20, 2.95, 74.8);
            Student s6 = new Student(127, "Usman Tariq", 24, 3.41, 86.7);           PQU.insert(s);
            PQU.insert(s1);
            PQU.insert(s2);
            PQU.insert(s3);
            PQU.insert(s4);
            PQU.insert(s5);
            PQU.insert(s6);

            Node s10 = PQU.Getmin();
            System.out.println("====================");
            System.out.println("Student "+s10.data.StudentName+" has lowest GPA of ="+s10.data.StudentCGPA);
            System.out.println("====================");


            


            Student Smin = PQU.extractmin();
            System.out.println(Smin.StudentName +" with CGPA of "+ Smin.StudentCGPA +"  has been removed!");
           

            Node smax = PQU.Getmax();
            System.out.println("====================");
            System.out.println("Student "+smax.data.StudentName+"   has lowest GPA of ="+smax.data.StudentCGPA);
            System.out.println("====================");

            Student Smax =PQU.extractmax();
            System.out.println(Smax.StudentName +"  with CGPA of "+ Smax.StudentCGPA +" has been removed!");

            
        }
}