package syn;


public class demo1 {
    //线程的创建
    //使用new Thread()创建
    public static void main(String[] args){
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"run in thread");
            }
        };

        thread.setName("thread1");//设置thread的名字;
        //thread.run();//不能用run，run不是真正的线程开启;
        thread.start();//start是真正的线程开启;

        System.out.println(Thread.currentThread().getName()+"run in main");
    }

}
