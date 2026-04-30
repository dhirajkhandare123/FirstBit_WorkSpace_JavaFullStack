package stackusinglinkedlist;



import java.util.Scanner;

import stackusinglinkedlist.Node;
import stackusinglinkedlist.LinkedList;

public class DemoStackUsingLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList ll = new LinkedList();

        boolean flag = true;
        do {
            System.out.println("1. Insert");
            System.out.println("2. display");
            System.out.println("3. display");
            System.out.println("4. Exit");

            System.out.println("Enter choice: ");
            int choice = sc.nextInt();

            int x;

            switch (choice) {
                case 1: {
                    System.out.println("Enter: ");
                    int n = sc.nextInt();
                    ll.insertAtBeg(n);

                    break;
                }

                case 2: {
                    System.out.println(ll.delteAtBeg() + " is deleted.");

                    break;
                }

                case 3: {
                    System.out.print("Stack: ");
                    ll.display();
                    System.out.println();
                    break;
                }

                case 4: {
                    flag = false;
                    break;
                }


                default:
                    throw new IllegalArgumentException("Unexpected value: " + choice);
            }

        }while(flag==true);
    }
}