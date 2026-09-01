/* 
                    ** DSA Theory Assignment **
    ==================================================================
    Title:
            Student Managment System using Singly LinkedList with head and tail
    
    Submitted by   :    Yasir Ali
    Department     :    BSCS (C)
    Submitted to   :    Sir Faheem Akhtar Rajput


    Description :
            This program implements Student Managment System using Single
            linked list. This system maintain both head and Tail pointers 
            and performs insertion,deletion, updation, searching and display 
            operations.
    
    ====================================================================

*/

public class StudentRecord{
  class Student{
    String sid;   // StudentId
    String Name;  // Student Name
    String department; // Student Department
    int semester;      // Student semester
    double Gpa;        // Semester GPA

    // Student class constructor
    Student(String sid,String Name,String department,int semester ,double Gpa){
        this.sid = sid;
        this.Name = Name;
        this.department=department;
        this.semester = semester;
        this.Gpa = Gpa;
    }
}
    static class Node{
        Student data;   
        Node next;
        Node(Student data){
            this.data = data;
            this.next = null;
        }
    }
        Node head;
        Node Tail;
          StudentRecord(){
              head = null;
              Tail = null;
          }

        void AddStudentFront(String sid,String Name,String department,int semester ,double Gpa){
            Student student = new Student(sid, Name, department,semester,Gpa);

            Node newNode = new Node(student);
            Node current = head; // initially we use temporary varianle so that we can fix our head

            // Edge case when linkedlist is empty
            if(head == null){   
               head = newNode;   // Head will point to NewNode 
               Tail = newNode;  // Tail will point to NewNode
               return;
            }
           
            newNode.next  = head; // New node pointing the next Node 
            head = newNode;      // Then make newnode as head

        }

        void AddStudentBack(String sid,String Name,String department,int semester ,double Gpa){
            Student student = new Student(sid, Name, department,semester,Gpa);
            Node NewNode = new Node(student);

        // if no linked present then we will make newnode as head and tail
            if(head == null){
                head = NewNode;  // Head will point NewNode
                Tail = NewNode;  // Tail will point NewNode
                return;
            }

            Tail.next= NewNode;      // First Tail will point toward newnode so that previous linked list connection not break
            Tail = NewNode;          //After adding node at last we must have to update Tail 
        }

        void DeleteStudentFront(){
            // Edge case : First check either linkedlist is empty or not
            if(head == null){
                System.out.println("No linkedlist is exist");
                return;
            }

            

            head = head.next; // Move head simply to next node

        // Edge case : After Deleting element if no node is present next then make whole linkedlist null
            if(head == null){
                Tail = null;
            }

            
        }

        void DeleteStudentBack(){
            Node current = head;
        // Edge case : First we will check either linked list is empty or not
            if(head == null){
                Tail = null; // Tail will also be null when no linkedlist is present
                return;
            }

        // Edge case : Check if only one node exist in linkedlist
            if(head == Tail){
                head = null;  // we will make head null 
                Tail = null;  // we will make Tail null
                return;
            }

        // Run loop till the next to next element is not equal to null
            while(current.next.next!=null){
                current = current.next;
            }
               Tail = current; // we will make or current node as a Tail 
               Tail.next=null; // we will make next node to null so simply it will be deleted 
        
        }

        void searchStudent(String sid){
        //    Student student = new Student(sid);
            Node current = head;

            while(current!=null){
                if(current.data.sid.equals(sid)){
              System.out.println("==========================================");
              System.out.println("Student is Found!");
              System.out.println("StudentId :"+current.data.sid+"|"+
              "Name : "+ current.data.Name+" | "+
              "Department :"+current.data.department+ 
              " | "+"Semester :"+current.data.semester+" |"+
              "GPA :"+current.data.Gpa);
            System.out.println("==========================================");

              break;
                }
                
                current = current.next;
            }
        
        // Check if student id does not exist
            if(current == null){
                System.out.println("No Student found");
            }
        
        }

        void deleteStudent(String sid){
            Node current = head;

        // Edge case : First check maybe linkedlist is empty
            if(head == null){
                System.out.println("No Linkedlist is present");
                return;
            }

        // First node deletion case 
            if(head.data.sid.equals(sid)){    
                  head = head.next;         
                  if(head == null)     // Check maybe no element after deletion 
                {
                    Tail = null;
                  }
                 return;
            }

            if(current.next.next == null){
                Tail = current;         // last node deletion case
                Tail.next=null;
            }

            while(current.next!=null){
                if(current.next.data.sid.equals(sid)){

                        if(current.next == Tail){
                            Tail = current;
                        }
                        current.next = current.next.next;  // middle node deletion case
                        return;
                }
                current = current.next;
            }

            

                System.out.println("No reuslt found!");  // Node not found case
            
        }

        void AddStudentAfter(String searchid,String sid,String Name,String department,int semester,double Gpa){
                Student student = new Student(sid,Name,department,semester,Gpa);
                Node newNode = new Node(student);

         
       Node current = head;
       // in case of Empty linked list head and Tail will point to newNode 
        if( head == null){
            System.out.println("No Student Exit!");
            return;
        }
               
                while(current!=null && !current.data.sid.equals(searchid)){
                    current =  current.next;
                }

        // Check if student id does not exist
                if(current==null){
                    System.out.println("Student ID not found");
                    return;
                }
                

                
                newNode.next = current.next;
                current.next = newNode;

            if( current == Tail){
                Tail = newNode;
            }


        }

        void AddStudentBefore(String searchid,String sid,String Name,String department,int semester,double Gpa){
                Student student = new Student(sid,Name,department,semester,Gpa);
                Node newNode = new Node(student);

                Node current = head;

        // Edge case : First check maybe linkedlist is empty
               if( head == null){
                    System.out.println("No Node exist!");
                    return;
                }


        // Check if searching node is first node       
                if(head.data.sid.equals(searchid))
                {
                    newNode.next = current;
                       head = newNode;
                       return;
                }

        // We will run the loop till next element to current is not equal to require id
                while(current.next!=null && !current.next.data.sid.equals(searchid)){
                    current = current.next;
                }

        //  if student id does not exist 
                if(current.next == null){
                        System.out.println("Student id does not exist!");
                        return;
                }
        
                newNode.next = current.next;
                current.next = newNode;
        }

       void UpdateStudent(String Sid,String name,String department,int semester,double Gpa){
        Node current = head;

        
    // Loop will run till the current value is not equals ti require ones
        while(current !=null && !current.data.sid.equals(Sid)){
           
            current =  current.next;
        }

    //  if student id does not exist 

        if(current==null){
            System.out.println("Student id does not exist");
            return;
        }
          current.data.Name = name;  // Update the student name
          current.data.department=department;
          current.data.semester = semester;
          current.data.Gpa = Gpa;

        }


        void Display(){
           Node current = head;

           while(current!=null){
              System.out.println("StudentId :"+current.data.sid+"|"+
              "Name : "+ current.data.Name+" | "+
              "Department :"+current.data.department+
              " | "+"Semester :"+current.data.semester+" |"+
              "GPA :"+current.data.Gpa);
              current = current.next;
           }
        }

        public static void main(String []args){
            StudentRecord SR = new StudentRecord();
            SR.AddStudentFront("S-243","Yasir","CS",2,3.35);
            SR.AddStudentFront("S-547","Asad","SE",2,3.54);
            SR.AddStudentFront("S-432","Prem","AI",2,3.37);
            SR.AddStudentBack("S-321","Zohaib","CSE",4,3.54);
            SR.AddStudentBack("S-542","Rajveer","CS",3,3.44);
            SR.AddStudentBack("S-424","Sarmad","CS",3,3.43);
            SR.AddStudentBack("S-941","Daniyal","CSE",5,3.73);
            SR.AddStudentAfter("S-321","S-464","Perkash","BED",6,3.75);
            SR.AddStudentBefore("S-424","S-784","Abdullah","AF",5,3.89);
            SR.AddStudentBefore("S-547","S-940","Ramish","BBA",1,3.79);
            SR.UpdateStudent("S-941","M.Daniyal","AI",4,4.0);
            SR.DeleteStudentFront();
            SR.DeleteStudentBack();
            SR.deleteStudent("S-424");
         
           SR.Display();
            SR.searchStudent("S-321");

        }

}