import java.util.*;
public class QueueExample{
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Queue ="+q);

        // peek
        System.out.println("Front Element ="+q.peek());
        // remove
        System.out.println("Remove Element ="+q.remove());
        System.out.println("Queue ="+q);
        // Size
        System.out.println("Queue ="+q.size());

        // Empty
        System.out.println("Queue ="+q.isEmpty());

    }
}