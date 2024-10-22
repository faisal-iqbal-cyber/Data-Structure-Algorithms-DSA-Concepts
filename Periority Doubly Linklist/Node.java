class Node {
    int data;
    int priority;
    Node next;
    Node previous;

    Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
        this.previous = null;
    }
}
