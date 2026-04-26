class Stack2{
    char arr[];
    int top;
    Stack2(){
        top=-1;
        arr = new char[20];
    }

    boolean isFull() {
        if(top == arr.length) {
            return true;
        }
        else {
            return false;
        }
    }

    public void push(char ele) {
        if(isFull()) {
            System.out.println("Stack is Full");
        }
        else {
            top++;
            arr[top] = ele;
        }
    }

    public boolean isEmpty() {
        if(top == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
        }
        else {
            System.out.println(arr[top] + " is Pop from stack");
            top--;
        }
    }

    char peak() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return '\0';
        }
        else {
            System.out.println(arr[top]);
            return arr[top];
        }
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
        }
        else {
            System.out.println();
            for(int i = top;i>=0;i--) {
                System.out.println("| " + arr[i] + " |");
                System.out.println("------");
            }
            System.out.println();
        }
    }
}

public class PostFix {

    public static int precedence(char ch){
        char[] ops = {'+','-','*','/'};
        int[] prec = {1,1,2,2};
        for(int i=0;i<ops.length;i++){
            if(ch == ops[i]){
                return prec[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        String infix = "(a+b)*c";

        Stack2 s = new Stack2();

        System.out.print("Postfix Expression: ");

        for(int i=0;i<infix.length();i++){
            char ch = infix.charAt(i);

            if(Character.isLetter(ch)){
                System.out.print(ch);
            }
            else if(ch == '('){
                s.push(ch);
            }
            else if(ch == ')'){
                while(!s.isEmpty() && s.arr[s.top] != '('){
                    System.out.print(s.arr[s.top]);
                    s.top--;
                }
                s.top--;
            }
            else{
                while(!s.isEmpty() && precedence(s.arr[s.top]) >= precedence(ch)){
                    System.out.print(s.arr[s.top]);
                    s.top--;
                }
                s.push(ch);
            }
        }

        while(!s.isEmpty()){
            System.out.print(s.arr[s.top]);
            s.top--;
        }
    }
}