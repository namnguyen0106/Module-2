package lesson18.exercise1;

public class NumberGenerator extends Thread {
    private Thread thread;
    private final String threadName;

    public NumberGenerator(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Priority: " + Thread.currentThread().getPriority());
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            if (threadName.equals("maxPriority")) {
                thread.setPriority(MAX_PRIORITY);
            } else if (threadName.equals("minPriority")) {
                thread.setPriority(MIN_PRIORITY);
            }
            thread.start();
        }
    }
}
