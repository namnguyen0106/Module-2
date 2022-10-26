package lesson18.exercise1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new NumberGenerator("maxPriority");
        Thread thread2 = new NumberGenerator("minPriority");
        thread1.start();
        thread2.start();
    }
}
