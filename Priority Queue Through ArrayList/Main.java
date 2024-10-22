public class Main{
        public static void main(String[] args) {
        PrioityQueueArrayList priorityQueue = new PrioityQueueArrayList();

        priorityQueue.enqueue(1, 10);
        priorityQueue.enqueue(4, 20);
        priorityQueue.enqueue(3, 30);
        priorityQueue.enqueue(2, 40);

        System.out.println("\nPriority Queue After Enqueue Elements");

        priorityQueue.display();

        priorityQueue.dequeue();

        System.out.println("\nPriority Queue After Dequeue Element");

        priorityQueue.display();

        System.out.println("\nPriority Queue Peek Element is " + priorityQueue.peek());

        System.out.println("\nQueue is Empty: " + priorityQueue.isEmpty());

        priorityQueue.display();

        priorityQueue.enqueue(5, 50);

        System.out.println("\nPriority Queue After Enqueue Element");

        priorityQueue.display();

        priorityQueue.clear();

        System.out.println("\nPriority Queue After Cleared!!");

        priorityQueue.display();

        System.out.println("\nQueue is Empty: " + priorityQueue.isEmpty());
    }

}