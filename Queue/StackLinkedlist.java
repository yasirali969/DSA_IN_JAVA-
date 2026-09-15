import java.util.Scanner;
 class Student {
    int studentId;
    String studentName;
    int studentAge;
    double studentCgpa;
    double studentInterPer;
    
    Student(int studentId,String studentName,int studentAge,double studentCgpa,double studentInterPer){
        studentId = studentId;
        studentName = studentName;
        studentAge = studentAge;
        studentCgpa = studentCgpa;
        studentInterPer = studentInterPer;

    }
}

class Node {
    Student data;
    Node next;

    Node(Student data){
        this.data = data;
        this.next = null;
    }

}

class Stack{
    Node head;
    int size;

    Stack(){
        head = null;
        size = 0;
    }

    void push(Student data){
        Node newNode = new Node(data);
        if(head == null){
           head = newNode;
           size++;
           return;
        }

        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    void pop(){
        if(head == null){
            System.out.println("Nothing to delete!");
            return;

        }

        else{
            head = head.next;
        }
                    size--;

    }

    Node peak(){

        if(head == null){
            System.out.println("Nothing for display!");
            return null;
            
        }
        return head;

    }

    boolean isEmpty(){
        if(head == null){
            return  true;
        }

        return false;
    }

    int size(){
        return size;
    }

     void display(){

        if(head == null){
            System.out.println("Nothing to display!");
            return;

        }

        else{
            Node temp = head;
             do{
               System.out.println(temp.data.studentId + " " +temp.data.studentName + " "+
                                temp.data.studentAge + " " + temp.data.studentCgpa + " "+
                                temp.data.studentInterPer);
                                temp = temp.next;
            } 
            while(temp!= null);          
        
        
    }
    System.out.println("********************");

                                      
    }  
    
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Stack stack = new Stack();

    int choice;

    do {

        System.out.println("\n******** STACK MENU ********");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Peek");
        System.out.println("4. Is Empty");
        System.out.println("5. Size");
        System.out.println("6. Display");
        System.out.println("0. Exit");
        System.out.println("*****************************");

        System.out.print("Enter choice: ");
        choice = sc.nextInt();

        switch(choice) {

            case 1:

                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();

                System.out.print("Enter Student Name: ");
                String name = sc.next();

                System.out.print("Enter Student Age: ");
                int age = sc.nextInt();

                System.out.print("Enter Student CGPA: ");
                double cgpa = sc.nextDouble();

                System.out.print("Enter Intermediate Percentage: ");
                double per = sc.nextDouble();

                Student s = new Student(id, name, age, cgpa, per);

                stack.push(s);

                System.out.println("Student pushed successfully!");

                break;


            case 2:

                stack.pop();

                System.out.println("Student popped successfully!");

                break;


            case 3:

                Node top = stack.peak();

                if(top != null) {

                    System.out.println("Top Student: "
                            + top.data.studentName);

                }

                break;


            case 4:

                if(stack.isEmpty()) {
                    System.out.println("Stack is Empty!");
                }
                else {
                    System.out.println("Stack is not Empty!");
                }

                break;


            case 5:

                System.out.println("Stack Size: "
                        + stack.size());

                break;


            case 6:

                stack.display();

                break;


            case 0:

                System.out.println("Program Ended!");

                break;


            default:

                System.out.println("Invalid Choice!");

        }

    } while(choice != 0);

    sc.close();
}



}