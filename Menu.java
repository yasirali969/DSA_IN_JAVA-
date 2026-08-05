import java.util.*;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Display");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                q.offer(100);
                System.out.println(q);
                break;

            case 2:
                q.poll();
                System.out.println(q);
                break;

            case 3:
                System.out.println(q);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}