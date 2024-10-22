import java.util.Scanner;
import java.util.Stack;

public class Expressions {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        String Expression1 = "[{(a+b) + (a-2 + (a-2))}]";
        String Expression2 = "[{a+(a+b + (a)}]";

        boolean result1 = CheckForBalanacedDelimiters(Expression1);
        boolean result2 = CheckForBalanacedDelimiters(Expression2);

        System.out.println("Expression 1 is Balanced : " + result1);
        System.out.println("Expression 2 is Balanced : " + result2);

        System.out.print("\nEnter the Infix Expression : ");
        String infix = read.nextLine();
       

        String postfix = InfixToPostfix(infix);
        System.out.println("\nPostfix Expression is  \n" + postfix);

        // Evaluate Postfix Expression
        String postfixExpression = postfix;
        int postfixResult = EvaluatePostFix(postfixExpression);
        System.out.println("\nResult of evaluating postfix expression "+postfixExpression+" is: " + postfixResult);
    }

    public static boolean CheckForBalanacedDelimiters(String exp) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.pop();
                    if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static String InfixToPostfix(String expression) {
        String postfix = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                postfix += c;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix += stack.pop();
                }
                stack.pop(); // Remove '('
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix += stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Invalid infix expression"; // Unbalanced parenthesis
            }
            postfix += stack.pop();
        }

        return postfix;
    }

    public static int EvaluatePostFix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
		int operand1 = stack.pop();
                int operand2 = stack.pop();
                

                switch (c) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1/ operand2);
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        }
        return -1;
    }
}
