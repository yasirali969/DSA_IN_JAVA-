class Node {
    int data;      // Stores the value
    Node next;     // Points to the next node

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListDemo {

    public static void main(String[] args) {

        // Create three nodes
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Link the nodes
        head.next = second;
        second.next = third;

        // Traverse and print the linked list
        Node temp = head;

        System.out.println("Linked List Elements:");

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }
}