package Collections.ListInterface;

class ll {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    Node head, tail;

    public void addElement(int val) {
        Node nn = new Node(val);
        if (head == null) {
            head = nn;
            tail = head;
        } else {
            tail.next = nn;
            tail = nn;
        }
    }

    public void nthFromLast(int n) {
        if (head == null || n <= 0) {
            System.out.println("Invalid input or empty list.");
            return;
        }

        Node first = head;
        Node second = head;

        // Move first pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (first == null) {
                System.out.println("List has fewer than " + n + " elements.");
                return;
            }
            first = first.next;
        }

        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        System.out.println("The " + n + "th node from the end is: " + second.data);
    }
}

public class NthFromLast {
    public static void main(String[] args) {
        ll l = new ll();
        l.addElement(10);
        l.addElement(20);
        l.addElement(30);
        l.addElement(40);
        l.addElement(50);

        l.nthFromLast(2);
    }
}
