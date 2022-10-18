package lesson10.bt2;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
//        MyLinkedList<Integer> linkerList = new MyLinkedList<>(1);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        linkedList.addFirst(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
//        linkedList.printList();
        linkedList.add(3,100);
//        linkedList.printList();
        System.out.println(linkedList.get(3));
        System.out.println("-----------");

        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        System.out.println("In List: ");
        myLinkedList.printList();
        System.out.println("Trả về phần tử thứ 2: ");
        System.out.println(myLinkedList.remove(2));
        myLinkedList.addFirst(10);
        myLinkedList.addLast(11);
        myLinkedList.add(2, 11);
        System.out.println("In List sau khi thêm: ");
        myLinkedList.printList();
        System.out.println("Kiểm tra phần tử có hay khong: ");
        System.out.println(myLinkedList.contains(12));
        System.out.println("Trả về vị trí đầu tiên của phần tử: ");
        System.out.println(myLinkedList.indexOf(11));
        System.out.println("Trả về phần tử có hay không và xóa vị trí đầu tiên: ");
        System.out.println(myLinkedList.remove(11));
        System.out.println("In List sau khi xóa: ");
        myLinkedList.printList();
        System.out.println("Trả về các phần tử: ");
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.getLast());
    }
}