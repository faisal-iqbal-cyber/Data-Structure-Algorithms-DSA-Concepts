public class PriorityDoublyLinkedList {
    Node head;
    int size;

    PriorityDoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Modified addFirst method with priority
    public void addFirst(int data, int priority) {
        Node newNode = new Node(data, priority);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        size++;
    }

    // Modified addSecondFirst method with priority
    public void addSecondFirst(int data, int priority) {
        Node newNode = new Node(data, priority);
        if (head == null || head.priority < priority) {
            newNode.next = head;
            if (head != null) {
                head.previous = newNode;
            }
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.priority >= priority) {
                current = current.next;
            }

            newNode.next = current.next;
            if (current.next != null) {
                current.next.previous = newNode;
            }
            current.next = newNode;
            newNode.previous = current;
        }
        size++;
    }

    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("List is Empty, cannot dequeue elements.");
        } else {
            head = head.next;
            if (head != null) {
                head.previous = null;
            }
            size--;
        }
    }

    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("List is Empty, cannot dequeue elements.");
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            if (current.previous != null) {
                current.previous.next = null;
            } else {
                head = null;
            }
            size--;
        }
    }

    public int peek() {
        return head.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
        head = null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("List is Empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + "(" + current.priority + ") ");
                current = current.next;
            }
            System.out.println();
        }
    }

    
}

