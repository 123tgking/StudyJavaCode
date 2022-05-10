package syn.threadCommunication;

import java.util.concurrent.TimeUnit;

public class EventClient {
    public static void main(String[] args) {
        final EventQueue eventQueue = new EventQueue();

        new Thread(() ->
        {
            while (true)
            {
                eventQueue.offer(new EventQueue.Event());
            }
        },"Producer").start();

        new Thread(() ->
        {
            while (true)
            {
                eventQueue.take();

                try {
                    TimeUnit.MILLISECONDS.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"Consumer").start();
    }
}
