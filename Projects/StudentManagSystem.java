import java.util.Scanner;


public class StudentManagSystem{

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }

    }
            Node head=null;


    void AddStudentFront(String data){
            Node newNode=new Node(data);

            if(head==null){
                head=newNode;
                return;
            }

            newNode.next=head;
            head=newNode;
            System.out.println("Student Added Successfully");
    }

    void AddStudentBack(String Name){
        Node newNode=new Node(Name);
        Node current=head;

        if(head==null){
            head=newNode;
            return;
        }
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }

    void  AddStudentAfter(String target,String NewStd){
            Node current=head;
            Node newNode=new Node(NewStd);

           


            while(current!=null && !current.data.equals(target)){
                current=current.next;
            }

             if(current==null){
                System.out.println("Not Found!");
                return ;
            }

                newNode.next=current.next;
                current.next=newNode;
        }
    
    void AddStudentBefore(String target,String newStudent){
         Node current=head;
         Node prev=null;
         Node newNode=new Node(newStudent);

         if(current.data.equals(target)){
            newNode.next=head;
            head=newNode;
            return;
         }

            while(!current.data.equals(target)){
                prev=current;
                current=current.next;
            }
            newNode.next=current;
            prev.next=newNode;


    }


    void DeleteStudentFront(){
        Node current = head;
        if(head==null){
            return;
        }

        current=current.next;
        head=current;

    }

    void DeleteStudentBack(){
        Node current=head;
        
        if(current==null){
            return;
        }

        if(current.next==null){
            head=null;
            return;
        }

        while(current.next.next!=null){
            current=current.next;
        }
        current.next=null;

    }

    void  DeleteStudent(String data){
        Node current=head;
        Node prev=null;

        if(head == null){
        System.out.println("List is empty");
        return;
    }

    // Delete first node
    if(head.data.equals(data)){
        head = head.next;
        System.out.println("Student Deleted Successfully");
        return;
    }

        while(!current.data.equals(data)){
            prev=current;
            current=current.next;
        }
            prev.next=current.next;
        }

        boolean SearchStudent(String data){
            Node current=head;
            while(current!=null){
                if(current.data.equals(data) ){
                    return true;
                }
                current=current.next;
            }
                return false;
            
        }

        void UpdateStudent(String oldName,String NewName){
            Node current=head;

            while(current !=null && !current.data.equals(oldName)){
                current=current.next;
            }
            current.data=NewName;
            System.out.println("Student Updated Successfully");

        }
        void display(){
            Node temp=head;

            while(temp!=null){
                System.out.println("Names :"+temp.data);
                temp=temp.next;
            }

        }

        public static void main(String []args){
            Scanner input=new Scanner(System.in);

            StudentManagSystem S=new StudentManagSystem();
            int choice;

            do{

            System.out.println("=======================");
            System.out.println("1) Add Student Front");
            System.out.println("2) Add Student Back");
            System.out.println("3) Add Student After");
            System.out.println("4) Add Student Before");
            System.out.println("5) Delete Student Front");
            System.out.println("6) Delete Student Back");
            System.out.println("7) Delete Specific Student");
            System.out.println("8) Search Student");
            System.out.println("9) Update Student ");
            System.out.println("10) Display");
            System.out.println("========================");

            System.out.println("Enter Choice :");
             choice=input.nextInt();
             input.nextLine();
            switch(choice){
                case 1:
                System.out.print("Enter student name: ");
                String name = input.nextLine();
                S.AddStudentFront(name);
                break;

                case 2:
                System.out.print("Enter student name: ");
                 name = input.nextLine();
                S.AddStudentBack(name);
                break;

                case 3:
                System.out.print("Enter target Student name: ");
                 name = input.nextLine();
                System.out.println("Enter New Student Name :");
                 String NewName=input.nextLine();
                S.AddStudentAfter(name,NewName);
                break;

                case 4:
                System.out.print("Enter target Student name: ");
                 name = input.nextLine();
                System.out.print("Enter new student name: ");
                String NewStd = input.nextLine();
                S.AddStudentBefore(name,NewStd);
                break;

                case 5:
                S.DeleteStudentFront();
                break;

                case 6:
                
                
                S.DeleteStudentBack();

                break;

                case 7:
                System.out.println("Enter the student name to delete :");
                name=input.nextLine();
                S.DeleteStudent(name);
                break;

                case 8:
                System.out.print("Enter student name to search: ");
                 name = input.nextLine();
                boolean found=S.SearchStudent(name);
                if(found){
                    System.out.println("Student Found");
                }
                else{
                    System.out.println("Student not Found");
                }
                
                break;
                case 9:
                System.out.print("Enter student name to update: ");
                 name = input.nextLine();
                System.out.print("Enter New Name of Student: ");
                String newname = input.nextLine();    
                S.UpdateStudent(name,newname);
                break;

                case 10:
                    S.display();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            
        }while(choice!=0);
            input.close();
        


        

    }
}
    
