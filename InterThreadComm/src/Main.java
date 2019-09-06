/*
*  Demonstrating thread synchronization through implementing
*  queue data structure
* */
public class Main
{
    public static void main(String args [])
    {
        Queue que = new Queue();

        new Producer(que);
        new Consumer(que);

        System.out.println("Stop: ^c");
    }
}
