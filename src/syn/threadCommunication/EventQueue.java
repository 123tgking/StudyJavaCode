package syn.threadCommunication;

import java.util.LinkedList;

public class EventQueue {
    private final int max;
    private final LinkedList<Event> eventQueue = new LinkedList<>();
    private final static int DEFAULT_MAX_EVENT = 10;

    static class Event{}

    public EventQueue(){
        this(DEFAULT_MAX_EVENT);
    }

    public EventQueue(int max){
        this.max = max;
    }

    public void offer(Event event)
    {
        synchronized(eventQueue)
        {
            if(eventQueue.size() >= max)
            {
                console("queue is full");
                try {
                    eventQueue.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            console("new event is submitted");
            eventQueue.addLast(event);
            eventQueue.notify();
        }
    }

    public Event take()
    {
        synchronized (eventQueue)
        {
            if (eventQueue.isEmpty())
            {
                console("queue is empty");
                try {
                    eventQueue.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            Event event = eventQueue.removeFirst();
            this.eventQueue.notify();
            console("this event:"+ event +" is handled");
            return event;
        }
    }

    public void console(String message){
        System.out.printf("%s:%s\n",Thread.currentThread().getName(),message);
    }


}
