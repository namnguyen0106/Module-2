package lesson18.exercise2;

public class EvenThread extends Thread{
    private Thread thread;
    @Override
    public void run() {
        System.out.println("Số chẵn: ");
        try {
            for (int i = 1; i < 11; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
                sleep(15);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void start() {
        if (thread == null){
            thread = new Thread(this);
            thread.start();
        }
    }
}
