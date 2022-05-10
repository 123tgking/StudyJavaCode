package syn;

import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args)
    {
        ThreadGroup group = new ThreadGroup("ThreadGroup");
        new Thread(group,() ->
        {
            while (true)
            {
                try
                {
                    TimeUnit.MILLISECONDS.sleep(2);
                } catch (InterruptedException e)
                {
                    //throw new RuntimeException(e);
                    break;
                }
            }
            System.out.println("t1 will exit");
        },"t1").start();

        new Thread(group,() ->
        {
            while(true)
            {
                try {
                    TimeUnit.MILLISECONDS.sleep(1);
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println("t2 will exit");
        },"t2").start();

        group.interrupt();
    }
}
