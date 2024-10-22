public class Reverse {

    private static int initial_capacity = 5;
    private int[] array;
    private int top;

    public Reverse() {
        this.array = new int[initial_capacity];
        this.top = -1; 
    }// constructor

    public void Push(int value) {
        if (top == array.length - 1) {
            System.out.println("Cannot add further elements");
        } else {
            array[++top] = value; 
        }
    }// Push

    public int pop() {
        if (top < 0) {
            System.out.println("cannot pop an element");
            return -1; 
        } else {
            int store = array[top];
            top--;
            return store;
        }
    }// pop

    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int result = pop();
            arr[i] = result;
        }
    }// reverse

    public static void main(String[] args) {
        Reverse r1 = new Reverse();

        int[] arr = new int[5];

        r1.Push(1);
        r1.Push(3);
        r1.Push(5);
        r1.Push(7);
        r1.Push(9);

        System.out.println("Array before reverse:");
        

        for (int i = 0; i <= r1.top; i++) {
            arr[i] = r1.array[i];
            System.out.println(arr[i]);
        }

        r1.reverse(arr);

        System.out.println("Reversed array:");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }// main
}// class 
