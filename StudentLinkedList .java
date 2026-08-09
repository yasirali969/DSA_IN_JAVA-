class Node {
    String name;
    int rollNo;
    Node next;

    Node(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.next = null;
    }
}

public class StudentLinkedList {

    Node head;

    // Add student at the end
    public void addStudent(String name, int rollNo) {

        Node newNode = new Node(name, rollNo);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Move to the last node
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        // Connect last node to new node
        temp.next = newNode;
    }

    // Display all students
    public void displayStudents() {

        Node temp = head;

        while (temp != null) {
            System.out.println(
                "Name: " + temp.name +
                ", Roll No: " + temp.rollNo
            );

            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addStudent("Yasir", 101);
        list.addStudent("Ali", 102);
        list.addStudent("Ahmed", 103);

        list.displayStudents();
    }
}