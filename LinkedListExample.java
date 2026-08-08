class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListExample {

    public static void main(String[] args) {

        // Create first node
        Node head = new Node(20);

        // Add second node
        head.next = new Node(30);

        // Add third node
        head.next.next = new Node(40);

        // Insert 10 at the beginning
        Node newNode = new Node(10);
        newNode.next = head;
        head = newNode;

        // Display Linked List
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }
}