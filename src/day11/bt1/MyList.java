package day11.bt1;

import java.util.ArrayList;
import java.util.List;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object[] elements = new Object[DEFAULT_CAPACITY];

    public MyList() {
    }

    public MyList(int size, Object[] elements) {
        this.size = size;
        this.elements = elements;
    }

    public void add(int index, E element) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = size-1; i >= index ; i--) {
            elements[i + 1] = elements[i];
            elements[index] = element;
        }
        size++;
    }

    public E remove(int index) {
        return null;
    }

    public int size() {
        return 0;
    }

    public E clone() {
        return null;
    }

    public boolean contains(E o) {
        return true;
    }

    public int indexOf(E o) {
        return 0;
    }

    public boolean add(E e) {
        return true;
    }

    public void ensureCapacity(int minCapacity) {

    }

    public E get(int i) {
        return null;
    }

    public void clear() {

    }
}
