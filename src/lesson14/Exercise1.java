package lesson14;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập dãy số nguyên cần sắp xếp (cách nhau bằng dấu ','):");
        String input = scanner.nextLine();
        String[] strings = input.split(",");
        int[] arr = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }
        insertionSort(arr);
    }

    public static void insertionSort(int[] array) { //chèn.
        int pos, x;
        for (int i = 1; i < array.length; i++) { //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
            System.out.println(Arrays.toString(array));
        }
    }
}
