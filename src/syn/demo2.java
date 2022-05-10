package syn;

public class demo2 {
    //使用runnable接口创建线程;
    public static void main(String[] args){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"running");
            }
        };
        Thread thread = new Thread(runnable);
        thread.setName("[thread created by runnable] ");
        thread.start();

    }
}
