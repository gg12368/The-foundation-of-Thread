/**
 * 输出：
 * MyThread
 * 运行结束
 */
 
 /**
 * 人为控制输出结果，即在执行输出"运行结束"前，先执行代码Thread.sleep(200)，
 * 让run()方法有充足的时间来先输出"MyThread"，后输出"运行结束".
 */
public class TestRunDemo2 {
    public static void main(String[] args) throws InterruptedException{
        class MyThread extends Thread{
            @Override
            public void run(){
                super.run();
                System.out.println("MyThread");
            }
        }
        MyThread mythread=new MyThread();
        mythread.start();//耗时长
        Thread.sleep(200);
        System.out.println("运行结束");//耗时短
    }
}

强调：
在使用多线程技术时，代码的运行结果与代码的执行顺序或调用顺序无关。
另外，线程是一个子任务，CPU以不确定的方式来调用线程中的run()方法。
输出结果具有不确定性。
