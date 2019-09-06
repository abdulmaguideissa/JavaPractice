
public class Queue
{
    int num;
    private boolean value_set = false;

    // Get a value from the queue front
    // Using synchronization and process communication methods,
    // wait() and notify()
    synchronized int get()
    {
        while (!value_set) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupt exception caught");
            }
        }
        System.out.println("Got: " + num);
        value_set = false;
        notify();
        return this.num;
    }

    synchronized void put(int num)
    {
        while (value_set) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(" Interrupt exception caught");
            }
        }
        this.num = num;
        value_set = true;
        System.out.println("Put: " + num);
        notify();
    }
}
