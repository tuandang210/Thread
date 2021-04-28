package NumberGenerator;

public class Main {
    public static void main(String[] args) {
        NumberGenerator a = new NumberGenerator();
        NumberGenerator b = new NumberGenerator();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
