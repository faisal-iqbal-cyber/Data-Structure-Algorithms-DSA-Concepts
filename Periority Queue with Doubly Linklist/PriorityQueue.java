public class PriorityQueue {
    private Node head;

    PriorityQueue() {
        this.head = null;
    }

    public void enqueue(int data, int priority) {
        Node newNode = new Node(data, priority);
        if (head == null){
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current != null && priority <= current.priority) {
                current = current.next;
            }
            if(current.next!=null){
            newNode.next = current;
            

            current.prev = newNode;
            if (newNode.prev != null) {
                newNode.prev = current.prev;
                newNode.prev.next = newNode;
            }
        }
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue p1 = new PriorityQueue();
        p1.enqueue(10, 4);
        p1.enqueue(20, 7);
        p1.enqueue(30, 2);
        p1.enqueue(40, 5);
        p1.enqueue(50, 4);
        p1.display();
    }
}
