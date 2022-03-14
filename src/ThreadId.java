public class ThreadId extends  Thread {
    @Override
    public void run() {
        System.out.println("id da thread: "+this.getId());
    }
}
