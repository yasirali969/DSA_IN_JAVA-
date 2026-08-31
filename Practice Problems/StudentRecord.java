public class StudentRecord{
  class Student{
    String sid;
    String Name;
    String department;
    int semester;
    double Gpa;
    Student next;

    Student(String sid,String Name,String department,int semester ,double Gpa){
        this.sid = sid;
        this.Name = Name;
        this.department=department;
        this.semester = semester;
        this.Gpa = Gpa;
        this.next= null;
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
        //   StudentRecord(){
        //       head = null;
        //       Tail = null;
        //   }

        void AddStudentFront(String sid,String Name,String department,int semester ,double Gpa){
            Student student = new Student(sid, Name, department,semester,Gpa);

            Node newNode = new Node(student);
            Node current = head;

            if(head == null){
               head = newNode;
               Tail = newNode;
               return;
            }
           
            newNode.next  = head;
            head = newNode;

        }

        void AddStudentBack(String sid,String Name,String department,int semester ,double Gpa){
            Student student = new Student(sid, Name, department,semester,Gpa);
            Node NewNode = new Node(student);

            if(head == null){
                head = NewNode;
                Tail = NewNode;
            }

            Tail.next= NewNode;      // P-M
            Tail = NewNode;
        }

        void DeleteStudentFront(){
            if(head == null){
                System.out.println("No linkedlist is exist");
                return;
            }

            

            head = head.next;

            if(head == null){
                Tail = null;
            }

            
        }

        void DeleteStudentBack(){
            Node current = head;

            if(head == null){
                Tail = null;
            }

            while(current.next.next!=null){
                current = current.next;
            }

                 Tail = current;
        
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
            SR.DeleteStudentFront();
            SR.DeleteStudentBack();
            SR.Display();
        }

}