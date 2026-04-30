package stackusinglinkedlist;

public class LinkedList {
    Node start;
    int count;

    LinkedList() {
        start = null;
        count = 0;
    }

    boolean isEmpty() {
        if(start == null) {
            return true;
        }
        else {
            return false;
        }
    }



    public void insertAtBeg(int x) {
        Node nn = new Node(x);
        if(isEmpty()) {
            start = nn;
            return;
        }
        else {
            nn.next = start;
            start = nn;
            count++;
            return;
        }
    }






    int delteAtBeg() {
        if(isEmpty()) {
            System.out.println("List is Empty");
            return -1;
        }

        else {

            int p = start.data;
            start = start.getNext();
            return p;
        }

    }

    void display() {
        Node temp = start;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
