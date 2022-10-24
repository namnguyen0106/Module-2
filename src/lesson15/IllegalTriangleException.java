package lesson15;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
    }

    public void getMsg(String msg) {
        System.out.println(msg);
    }

}
