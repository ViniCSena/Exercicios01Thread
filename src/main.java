public class main {
    public static void main(String[] args) {
        Thread t1 = new ThreadId();
        Thread t2 = new ThreadId();
        Thread t3 = new ThreadId();
        Thread t4 = new ThreadId();
        Thread t5 = new ThreadId();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
