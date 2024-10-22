public class PrioityQueueArrayList {
    private static final int INITIAL_CAPACITY = 10;
    private Node[] array;
    private int size;

    PrioityQueueArrayList() {
        this.array = new Node[INITIAL_CAPACITY];
        this.size = 0;
    }

    public void enqueue(int priority, int data) {
        ensureCapacity();
        Node newNode = new Node(priority, data);

        int index = size;
        while (index > 0 && newNode.priority > array[index - 1].priority) {
            array[index] = array[index - 1];
            index--;
        }
        array[index] = newNode;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("List is Empty, Can't Dequeue Element");
        } else {
            for (int i = 0; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return array[0].data;
    }

    public void clear() {
        size = 0;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("List is Empty");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(array[i].data + " ");
            }
            System.out.println();
        }
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            Node[] newArray = new Node[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

}

