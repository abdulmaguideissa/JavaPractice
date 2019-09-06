/*
* Thread creation java class
* Using "interface" method, by implementing the Runnable interface
* Other method involves "extends" the Thread class
*  i.e. public class NewThread extends Thread{}
* */

import java.lang.Runnable;

public class NewThread implements Runnable
{
    private String thread_name;
    protected Thread thread;

    NewThread(String thread_name)
    {
        this.thread_name = thread_name;
        thread = new Thread(this, thread_name);
        System.out.println("New thread is created " + thread);
        thread.start();
    }

    // run method must be created as it is the runnable method of the thread
    public void run()
    {
        try
        {
            for (int i = 0; i < 5; i++)
            {
                System.out.println("Thread " + this.thread_name + "   " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(this.thread_name + " was interrupted");
        }
        System.out.println(this.thread_name + " exits");
    }
}
