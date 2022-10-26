package lesson18.exercise2;

public class OddThread extends Thread {
    private Thread thread;

    @Override
    public void run() {
        System.out.println("Số lẻ: ");
        try {
            for (int i = 1; i < 11; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
                sleep(10);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
            try {
                thread.join(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
