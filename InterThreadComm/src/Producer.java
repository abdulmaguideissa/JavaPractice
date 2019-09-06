public class Producer implements Runnable
{
    private Queue que;

    public Producer(Queue que) {
        this.que = que;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int num = 0;

        while (true)
            que.put(num++);
    }
}
