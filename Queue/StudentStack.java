class StudentStack{
     static class Student{
        int StudentId;
        String StudentName;
        int StudentAge;
        double StudentCGPA;
        double StudentInterPercentage;

        Student(int id, String Name , int Age, double CGPA,double StudentPer){
            this.StudentId = id;
            this.StudentName = Name;
            this.StudentAge = Age;
            this.StudentCGPA = CGPA;
            this.StudentInterPercentage = StudentPer;
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

    Node top;
    int size;
      StudentStack(){
         top = null;
         size= 0;
      }


      void push(Student S){
        Node newnode = new Node(S);
        newnode.next = top;
        top = newnode;
        size++;
      }

      Student pop(){
        if(IsEmpty()){
          throw new RuntimeException("Stack is Empty!");
        }

        Student stop = top.data;
        top = top.next;

        return stop;

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
            System.out.println("=======================================");
            System.out.println("Student Id ="+ current.data.StudentId);
            System.out.println("Student Name ="+current.data.StudentName);
            System.out.println("Student Age ="+current.data.StudentAge);
            System.out.println("Student CGPA ="+current.data.StudentCGPA);
            System.out.println("Student Percentage ="+current.data.StudentInterPercentage);
            System.out.println("=======================================");

            current = current.next;
        }
      }
      public static void main(String [] args){
        StudentStack SS = new StudentStack();
        Student S = new Student(125,"Yasir",25,3.45,95);
        Student S1 = new Student(432,"Umer",42,3.91,36);
        Student S2 = new Student(920,"Nitesh Bahii",13,2.96,78);
        SS.push(S);
        SS.push(S1);
        SS.push(S2);
        System.out.println("Is Empty! ="+SS.IsEmpty());
        System.out.println("Size ="+SS.size());
        SS.Display();

        Student Delete = SS.pop();
          System.out.println("============== Delete Student ===============");

          System.out.println("Student Id ="+ Delete.StudentId);
          System.out.println("Student Name ="+Delete.StudentName);
          System.out.println("Student Age ="+Delete.StudentAge);
          System.out.println("Student CGPA ="+Delete.StudentCGPA);
          System.out.println("Student Percentage ="+Delete.StudentInterPercentage);
          System.out.println("===============================");
          System.out.println("======== After Deletion ========");
          SS.Display();

      }

}