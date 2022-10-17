package day11.bt1;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        this.size = capacity;
    }

    public void add(int index, E element) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Object[] elementData = this.elements;
        final int s = this.size;
        System.arraycopy(elementData, index, elementData, index + 1, s - index);
        elementData[index] = element;
        size = s + 1;
    }

    public E remove(int index) {
        E e = (E) elements[index];

        final int newSize = size - 1;
        if (newSize > index) {
            System.arraycopy(elements, index + 1, elements, index, newSize - index);
        }
        elements[newSize] = null;
        size--;
        return e;
    }

    public int size() {
        return size;
    }

    public E clone() {
        E element;
        element = (E) Arrays.copyOf(elements, size);
        return element;
    }

    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(elements.length);
        }
        elements[size++] = e;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        int newSize = minCapacity * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        if (i > size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        this.size = 0;
    }
    public void print() {
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            System.out.print((E)elements[i] + "\t");
        }
    }

}
