import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        String str = sc.nextLine();

        
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

    }//main

    public static boolean isPalindrome(String str) {
        char[] stack = new char[str.length()];
        int top = 0;

        System.out.println("Original array:");
        for (int i = 0; i < str.length(); i++) {
            stack[top] = str.charAt(i);
            System.out.print(str.charAt(i) + " ");
            top++;
        }

        System.out.println(); 

        System.out.println("Reversed array:");

        char[] reversed = reverse(stack, top);
            for (int i = 0; i < str.length(); i++) {
                System.out.print(reversed[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != reversed[i]) {
                return false;
            }
        }
        
        return true;

    }//isPalindrome

    public static char[] reverse(char[] st, int t) {
        int top = t;
        char[] newArr = new char[st.length];
            if (st.length != 0) {
                for (int i = 0; i < st.length; i++) {
                    top--;
                    newArr[i] = st[top];
                
                 }
            }
        
        return newArr;
    }//reverse
}//class
