import java.util.Stack;
public class PriorityQueue {
    private Node head;
    private Stack<Node> tempStack;

    public PriorityQueue() {
        head = null;
        tempStack = new Stack<>();
    }

    public void enqueue(int data, int priority) {
        Node newNode = new Node(data, priority);

        while (head != null && head.priority > newNode.priority) {
            tempStack.push(head);
            head = head.next;
        }

        newNode.next = head;
        head = newNode;

        while (!tempStack.isEmpty()) {
            Node tempNode = tempStack.pop();
            tempNode.next = head;
            head = tempNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int data = head.data;
        head = head.next;
        return data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.enqueue(5, 4);
        pq.enqueue(10, 2);
        pq.enqueue(20, 5);
        pq.enqueue(12, 1);

        System.out.println(pq.dequeue()); 
        System.out.println(pq.dequeue()); 
        System.out.println(pq.dequeue()); 
        System.out.println(pq.dequeue()); 

    }
}
