package lesson15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        int a = 10;
        int b = -1;
        int c = 4;

        try {
            check(a, b, c);
        } catch (IllegalTriangleException e) {
            e.getMsg("ahihi");
        }
    }

    public static void check(int a, int b, int c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0
                || (a + b) < c || (a + c) < b || (b + c) < a) {
            throw new IllegalTriangleException();
        }
    }
}
