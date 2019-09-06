public class Consumer implements Runnable
{
    private Queue que;

    public Consumer(Queue que) {
        this.que = que;
        new Thread(this, "Consumer").start();
    }

    public void run () {
        while (true)
            que.get();
    }
}
