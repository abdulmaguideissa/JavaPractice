/* Demonstrating thread priorities through examples
* */

public class Clicker implements  Runnable
{
    long click = 0;
    Thread thread;
    private volatile boolean running = true;

    public Clicker(int pri)
    {
        thread = new Thread(this);
        thread.setPriority(pri);
    }

    public void run()
    {
        while (running)
            click++;
    }

    public void start()
    {
        thread.start();
    }

    public void stop()
    {
        running = false;
    }

    // Using synchronized keyword for thread synchronization
    // synchronized is used in the case of global shared resource
    synchronized public long clicks_checker()
    {
        return (click);
    }
}
