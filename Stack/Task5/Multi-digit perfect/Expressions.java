import java.util.Scanner;
import java.util.Stack;

public class Expressions {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("\nEnter the Infix Expression : ");
        String infix = read.nextLine();

        boolean balanced = CheckForBalancedDelimiters(infix);
        if (!balanced) {
            System.out.println("Expression has unbalanced delimiters. Please check and try again.");
            
        }else{
	
	System.out.println("The Given Expression is Balanced ");

	}

        String postfix = infixToPostfix(infix);
        System.out.println("\nPostfix Expression is: \n" + postfix);

        int postfixResult = evaluatePostfix(postfix);
        System.out.println("\nResult of evaluating postfix expression " + postfix + " is: " + postfixResult);
    }

    public static boolean CheckForBalancedDelimiters(String exp) {
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

    public static String infixToPostfix(String expression) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
                while (i + 1 < expression.length() && (Character.isDigit(expression.charAt(i + 1))
                        || expression.charAt(i + 1) == '.')) {
                    postfix.append(expression.charAt(++i));
                }
                postfix.append(' ');
            } else if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                while (!stack.isEmpty() && stack.peek() != '(' && stack.peek() != '{' && stack.peek() != '[') {
                    postfix.append(stack.pop()).append(' ');
                }
                stack.pop(); // Remove corresponding opening bracket
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix.append(stack.pop()).append(' ');
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(' || stack.peek() == '{' || stack.peek() == '[') {
                return "Invalid infix expression"; // Unbalanced parenthesis
            }
            postfix.append(stack.pop()).append(' ');
        }

        return postfix.toString().trim();
    }

    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (token.matches("-?\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                int result = performOperation(token.charAt(0), operand1, operand2);
                stack.push(result);
            }
        }

        return stack.pop();
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
        return 0; // Invalid operator
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
