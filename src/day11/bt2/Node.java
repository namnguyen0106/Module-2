package day11.bt2;

public class Node {
    Node next;
    Object data;

    public Node() {
    }

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }
}
