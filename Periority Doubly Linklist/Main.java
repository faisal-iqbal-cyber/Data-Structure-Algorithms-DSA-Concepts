public class Main{
	public static void main(String[] args) {
        PriorityDoublyLinkedList priorityList = new PriorityDoublyLinkedList();

        priorityList.addFirst(10, 2);
        priorityList.addFirst(20, 1);
        priorityList.addFirst(30, 3);
        priorityList.addFirst(40, 2);

        System.out.println("\nAfter Adding Elements in Priority Doubly LinkedList");
        priorityList.display();

        priorityList.deleteFirst();

        System.out.println("\nPriority Doubly LinkedList After Removing Element");
        priorityList.display();

        System.out.println("\nPeek Element is " + priorityList.peek());

        System.out.println("\nList is Empty: " + priorityList.isEmpty());

        priorityList.display();

        priorityList.addFirst(50, 1);

        System.out.println("\nAfter Adding Elements in Priority Doubly LinkedList");
        priorityList.display();

        priorityList.clear();

        System.out.println("\nAfter List Cleared!!");
        priorityList.display();

        System.out.println("\nList is Empty: " + priorityList.isEmpty());

        priorityList.addSecondFirst(60, 2);

        System.out.println("\nAfter Adding Elements in Priority Doubly LinkedList");
        priorityList.display();

        priorityList.deleteLast();

        System.out.println("\nPriority Doubly LinkedList After Removing Element");
        priorityList.display();
    }
}