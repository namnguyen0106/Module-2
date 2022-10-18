package day12.bt1;

import java.util.Arrays;
import java.util.Stack;

public class UseStackToReverse {
    public static void main(String[] args) {
        //đảo ngược mảng số nguyên
        int[] arr = {1,2,3,4,5};
        reverseIntegerArr(arr);

        //đảo ngược chuỗi
        String str = "abcde";
        reverseString(str);
    }

    public static void reverseIntegerArr(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            stack.push(i);
        }

        final int size = stack.size();
        for (int i = 0; i < size; i++) {
            arr[i] = stack.pop();
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void reverseString(String str) {
        String[] strArr = str.split("");
//        StringBuilder newStr = new StringBuilder();
        String newStr = "";
        Stack<String> stack = new Stack<>();
        for (String s : strArr) {
            stack.push(s);
        }

        final int size = stack.size();
        for (int i=0; i<size; i++) {
//            newStr.append(stack.pop());
            newStr+=stack.pop();
        }

        System.out.println(newStr);
    }
}
