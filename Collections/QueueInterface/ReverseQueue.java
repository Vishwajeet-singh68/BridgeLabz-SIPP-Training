package Collections.QueueInterface;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

    public static void reverse(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }

        //Remove front element
        int front = q.remove();

        //Reverse the remaining queue
        reverse(q);

        //Add the removed element back at the back
        q.add(front);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Original Queue: " + q);
        reverse(q);
        System.out.println("Reversed Queue: " + q);
    }
}
