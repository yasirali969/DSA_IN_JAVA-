import java.util.ArrayDeque;

public class ArrayDequeue {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(10);   // Front
        deque.addLast(20);    // Rear
        deque.addFirst(5);    // Front
        deque.addLast(30);    // Rear

        System.out.println(deque); // [5, 10, 20, 30]

        deque.removeFirst();
        deque.removeLast();

        System.out.println(deque); // [10, 20]
    }
}