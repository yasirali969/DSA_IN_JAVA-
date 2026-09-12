class Student_Queue_ManagementSystem{
    class Student{
        int StudentId;
        String StudentName;
        int StudentAge;
        double StudentGPA;
        double Studentpercentage;
        Student(int StudentId,String StudentName,int StudentAge,double StudentGPA,double Studentpercentage){
            this.StudentId = StudentId;
            this.StudentName = StudentName;
            this.StudentAge = StudentAge;
            this.Studentpercentage = Studentpercentage;
            this.StudentGPA = StudentGPA;
        }
    }

    Student []queue;
    int front;
    int rear;
    int size;
    int capacity;
        Student_Queue_ManagementSystem(int capacity){
            this.capacity = capacity;
            queue =new Student[capacity];
            front = 0;
            rear = -1;
            size =  0;
        }

        void Enqueue(Student s1){
              if(IsFull()){
                System.out.println("Queue is Full!");
                return;
        }
            rear = (rear + 1) % capacity;
            queue[rear] = s1;
            size++;
        }

        void Dequeue(){
             if (IsEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
            queue[front]=null;
            front = (front+1)%capacity;
            size--;
        }

          boolean IsFull(){
            return size == capacity;
        }
      

        boolean IsEmpty(){
            return size==0;
        }

        void peek(){
            System.out.println("------------- Peek ------------------");
            System.out.println("Student ID: " +queue[front].StudentId);
            System.out.println("Student Name: " +queue[front].StudentName);
            System.out.println("Student Age: " +queue[front].StudentAge);
            System.out.println("Student GPA: " +queue[front].StudentGPA);
            System.out.println("Student Percentage: " +queue[front].Studentpercentage);
            System.out.println("-------------------------");   
        }
        int size(){
            return size;
        }

        int capacity(){
            return capacity;
        }
        void DisplayQueue() {

        if (IsEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        int index= front;
        for (int i = 0; i < size; i++) {
            System.out.println("-------------------------");   
            System.out.println("Student ID: " + queue[index].StudentId);
            System.out.println("Student Name: " + queue[index].StudentName);
            System.out.println("Student Age: " + queue[index].StudentAge);
            System.out.println("Student GPA: " + queue[index].StudentGPA);
            System.out.println("Student Percentage: " + queue[index].Studentpercentage);
            System.out.println("-------------------------");   
                        index = (index + 1) % capacity;

                 }

        System.out.println();
    }


        public static void main(String []args){
            Student_Queue_ManagementSystem SQM = new Student_Queue_ManagementSystem(3);

            Student s1=SQM.new Student(122,"Yasir ALi",23,3.5,94.5);
            Student s2=SQM.new Student(101, "Ali", 20, 3.2, 78.5);
            Student s3=SQM.new Student(102, "Ahmed", 21, 3.6, 85.0);
            Student s4=SQM.new Student(104, "Hassan", 22, 3.8, 91.0);

            SQM.Enqueue(s1);
            SQM.Enqueue(s2);
            SQM.Enqueue(s3);
            SQM.Dequeue();
            SQM.DisplayQueue();

            SQM.peek();

            System.out.println("Size ="+ SQM.size());
            System.out.println("Capacity ="+SQM.capacity());
            System.out.println(SQM.IsEmpty());
            System.out.println(SQM.IsFull());
            SQM.Enqueue(s4);
            SQM.DisplayQueue();


        }
    
}