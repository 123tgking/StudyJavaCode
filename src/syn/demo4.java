package syn;

public class demo4 implements Runnable {

    private int index;
    private final static int MAX = 500;

    public static void main(String[] args) {
        final demo4 task = new demo4();

        Thread thread1 = new Thread(task, "一号");
        Thread thread2 = new Thread(task, "二号");
        Thread thread3 = new Thread(task, "三号");
        Thread thread4 = new Thread(task, "四号");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

    @Override
    public void run(){
        while(index <= MAX){
            System.out.println(Thread.currentThread() + " 的号码是： " + (index ++));
        }
    }
}
