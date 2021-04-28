package ChanLe;

public class Main {
    public static void main(String[] args) {
        Thread a = new Thread(new EvenN());
        Thread b = new Thread(new OddN());

        a.start();
        b.start();
    }
}
