
class Stack1 {
    private char[] arr;
    private int top;

    public Stack1(int size) {
        arr = new char[size];
        top = -1;
    }

    public void push(char ch) {
        arr[++top] = ch;
    }

    public char pop() {
        return arr[top--];
    }
}

public class PalindromeUsingStack {
    public static void main(String[] args) {
        String str = "madam";

        Stack1 stack = new Stack1(str.length());

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String reversed = "";
        for (int i = 0; i < str.length(); i++) {
            reversed += stack.pop();
        }

        if (str.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}


