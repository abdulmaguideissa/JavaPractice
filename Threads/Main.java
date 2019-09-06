/*
* Testing the NewThread class by creating as many threads as we need
* to assure that all threads finish their execution, the main thread must
* remain alive and be destroyed the last one by calling Thread.sleep().
* */
public class Main
{
    public static void main(String args[])
    {
        boolean newthread = false;

        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Clicker highp = new Clicker(Thread.NORM_PRIORITY + 2);
        Clicker lowp = new Clicker(Thread.NORM_PRIORITY - 2);

        highp.start();
        lowp.start();

        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }
        lowp.stop();
        highp.stop();

        // Wait for child threads to terminate
        try {
            lowp.thread.join();
            highp.thread.join();
        }
        catch (InterruptedException e) {
            System.out.println("InterruptedException happened");
        }

        System.out.println("Low priority thread clicks " + lowp.click);
        System.out.println("High priority thread clicks " + highp.click);

        if(newthread) {
            NewThread thread1 = new NewThread("One");         // Create thread no. 1
            NewThread thread2 = new NewThread("Two");
            NewThread thread3 = new NewThread("Three");

            System.out.println("Thread one is alive " + thread1.thread.isAlive());
            System.out.println("Thread two is alive " + thread2.thread.isAlive());
            System.out.println("Thread three is alive " + thread3.thread.isAlive());

            try {
                System.out.println("Waiting for threads to finish");
                thread1.thread.join();
                thread2.thread.join();
                thread3.thread.join();
            } catch (InterruptedException e) {
                System.out.println("Main thread was interrupted");
            }
            System.out.println("Thread one is alive " + thread1.thread.isAlive());
            System.out.println("Thread two is alive " + thread2.thread.isAlive());
            System.out.println("Thread three is alive " + thread3.thread.isAlive());
            System.out.println("Main thread exits");
        }
    }
}
