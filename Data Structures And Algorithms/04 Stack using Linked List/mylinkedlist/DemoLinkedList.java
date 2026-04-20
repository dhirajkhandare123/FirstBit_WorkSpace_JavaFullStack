package mylinkedlist;

import java.util.Scanner;
import mylinkedlist.LinkedList;
import mylinkedlist.Node;

public class DemoLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList ll = new LinkedList();

        boolean flag = true;
        do {
            System.out.println("1. Insert at end");
            System.out.println("2. Insert at beginning");
            System.out.println("3. Insert at position");
            System.out.println("4. display");
            System.out.println("5. sort");
            System.out.println("6. reverse print");
            System.out.println("7. delete");
            System.out.println("8. Exit");

            System.out.println("Enter choice: ");
            int choice = sc.nextInt();

            int x;

            switch (choice) {
                case 1: {
                    System.out.println("Enter: ");
                    x = sc.nextInt();

                    ll.insertAtEnd(x);

                    break;
                }

                case 2: {
                    System.out.println("Enter: ");
                    x = sc.nextInt();

                    ll.insertAtBeg(x);

                    break;
                }

                case 3: {
                    System.out.println("Enter: ");
                    x = sc.nextInt();

                    System.out.println("insert position: ");
                    int pos = sc.nextInt();

                    ll.insertAtPos(x, pos);

                    break;
                }

                case 4: {
                    ll.display();
                    break;
                }

                case 5: {
                    ll.sort();
                    break;
                }

                case 6: {
                    Node node = ll.start;
                    ll.printReverse(node);
                    break;
                }

                case 7: {
                    System.out.println("Enter position: ");
                    int p = sc.nextInt();
                    ll.delteAtPos(p);
                    break;
                }

                case 8:{
                    flag=false;
                    break;
                }
                default:
                    throw new IllegalArgumentException("Unexpected value: " + choice);
            }

        }while(flag==true);

    }

}