package lesson10.exercise2;

public class MyLinkedList<E> extends Node {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
        super();
    }

    public MyLinkedList(Object data) {
        super(data);
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;

        for (int i = 1; i < index && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }

    public E remove(int index) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = temp.next.next;
        numNodes--;
        return (E) holder.getData();
    }

    public boolean remove(Object e) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data == e) {
                remove(i);
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public E clone() {
        return null;
    }

    public boolean contains(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data == o) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data == o) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

//    public boolean add(E e) {
//    }
//
//    public void ensureCapacity(int minCapacity) {
//    }

    public E get(int i) {
        Node temp = head;
        for (int j = 1; j < i; j++){
            temp = temp.next;
        }
        return (E)temp.data;
    }

    public E getFirst() {
        return (E)head.data;
    }

    public E getLast() {
        Node temp = head;
        for (int j = 1; j < numNodes; j++){
            temp = temp.next;
        }
        return (E)temp.data;
    }

    public void clear() {
        head = null;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
        System.out.println();
    }

}
