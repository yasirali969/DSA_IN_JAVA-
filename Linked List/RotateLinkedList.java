public class RotateLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node rotateRight(Node head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Find length and tail
        int length = 1;
        Node tail = head;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Avoid unnecessary rotations
        k = k % length;

        if (k == 0) {
            return head;
        }

        // Make circular linked list
        tail.next = head;

        // Find new tail
        int steps = length - k;
        Node newTail = head;

        for (int i = 1; i < steps; i++) {
            newTail = newTail.next;
        }

        // New head
        Node newHead = newTail.next;

        // Break the circle
        newTail.next = null;

        return newHead;
    }

    static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original:");
        display(head);

        head = rotateRight(head, 2);

        System.out.println("After rotation:");
        display(head);
    }
}