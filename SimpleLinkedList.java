class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SimpleLinkedList {

    public static void main(String[] args) {

        // Create 3 nodes
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Connect the nodes
        first.next = second;
        second.next = third;

        // Start from first node
        Node current = first;

        // Traverse the Linked List
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}