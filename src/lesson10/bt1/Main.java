package lesson10.bt1;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.print();
        System.out.println("abc: ");
        myList.add(4,10);
        myList.print();
    }
}