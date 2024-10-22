import java.util.Scanner;

public class Expressions {
    private char[] arr;
    private int capacity;
    private int top;

    Expressions(int capacity) {
        arr = new char[capacity];
        this.capacity = capacity;
        top = 0;
    }

    public void push(char item) {
        if (top == capacity) {
            System.out.println("Stack is Overflow");
        } else {
            arr[top] = item;
            top++;
        }
    }

    public char pop() {
        if (top == 0) {
            System.out.println("Stack is Empty");
            return '\0'; // Return null character to indicate empty stack or handle as per your logic
        }
        top--;
        return arr[top];
    }

    public char peek() {
        if (top == 0) {
            System.out.println("Stack is Empty");
            return '\0'; // Return null character to indicate empty stack or handle as per your logic
        }
        return arr[top - 1];
    }

    public boolean isEmpty() {
        return (top == 0);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("\nEnter the Infix Expression : ");
        String infix = read.nextLine();

        Expressions stack = new Expressions(infix.length() + 1); // Creating a custom stack

        String postfix = InfixToPostfix(infix, stack);
        System.out.println("\nPostfix Expression is  \n" + postfix);

        String postfixExpression = postfix;
        int postfixResult = EvaluatePostFix(postfixExpression, stack);
        System.out.println("\nResult of evaluating postfix expression " + postfixExpression + " is: " + postfixResult);
    }

    public static String InfixToPostfix(String expression, Expressions stack) {
        String postfix = "";
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                postfix += c;
            } else if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                while (!stack.isEmpty() && stack.peek() != '(' && stack.peek() != '{' && stack.peek() != '[') {
                    postfix += stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix += stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            postfix += stack.pop();
        }

        return postfix;
    }

    public static int EvaluatePostFix(String expression, Expressions stack) {
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                stack.push(c);
            } else {
                int operand2 = stack.pop() - '0';
                int operand1 = stack.pop() - '0';

                int result = performOperation(c, operand1, operand2);
                stack.push((char) (result + '0'));
            }
        }

        return stack.pop() - '0';
    }

    public static int performOperation(char operator, int operand1, int operand2) {
        if (operator == '+') {
            return operand1 + operand2;
        } else if (operator == '-') {
            return operand1 - operand2;
        } else if (operator == '*') {
            return operand1 * operand2;
        } else if (operator == '/') {
            return operand1 / operand2;
        } else if (operator == '^') {
            return (int) Math.pow(operand1, operand2);
        }
        return 0;
    }

    public static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        } else if (op == '^') {
            return 3;
        }
        return -1;
    }
}
