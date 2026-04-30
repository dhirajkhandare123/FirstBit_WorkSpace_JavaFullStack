package stackusinglinkedlist;

public class Node {
    int data;
    Node next;
    public Node(int data) {

        this.data = data;
        this.next = null;
    }

    Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}

