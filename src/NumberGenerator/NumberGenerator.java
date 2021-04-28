package NumberGenerator;

public class NumberGenerator implements Runnable {
    private final Thread myThread;

    public NumberGenerator() {
        myThread = new Thread(this, "my runnable thread");
        System.out.println("my thread created" + myThread);
    }

    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the count " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }
}
