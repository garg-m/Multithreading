public class ProducerConsumer {
    public static void main(String[] args) {
        Shop c = new Shop();
        Producer p1 = new Producer(c, 1);
        Consumer c1 = new Consumer(c, 1);

        p1.start();
        // System.out.println("After first thread call.");
        c1.start();
        // System.out.println("After second thread call.");
    }
}
