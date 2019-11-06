/**
 * 输出：
 * 运行结束
 * MyThread
 */
 
 /**
 * 上面代码使用start()方法来启动一个线程，线程启动后会自动调用线程对象中的run()方法，
 * run()方法里面的代码就是线程对象要执行的任务，是线程执行的入口。
 * 但是start()方法的执行比较耗时。
 * start()方法耗时的原因：
 * 1.通过JVM告诉操作系统创建Thread。
 * 2.操作系统开辟内存并利用createThread()函数创建Thread对象。
 * 3.操作系统对Thread对象进行调度，以确定执行时机。
 * 4.Thread在操作系统中被成功执行。
 */
public class TestRun1Demo{
    public static void main(String[] args) {
         class MyThread extends Thread{
            @Override
            public void run(){
                super.run();
                System.out.println("MyThread");
            }
        }
        MyThread mythread=new MyThread();
        mythread.start();//耗时长
        System.out.println("运行结束");//耗时短
    }
}
