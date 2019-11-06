class MyThread2 implements Runnable {
    private String title;

    public MyThread2(String title) {
        this.title = title;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.title + ",i=" + i);
        }
    }
}
/*
 * 程序写到这里会发现，此时MyThread类继承的不再是Thread类而实现了Runnable接口，
 * 虽然解决了单继承局限问题，但是没有start方法被继承了。 这时就要关注Thread类提供的构造方法。 public Thread(Runnable
 * target) 作用：可以接收Runnable接口对象
 */
/*
 * 多线程的启动永远都是Thread类的start()方法
 */
public class CreateThreadSecond {
    public static void main(String[] args) {
        MyThread2 myThread1 = new MyThread2("thread1");
        MyThread2 myThread2 = new MyThread2("thread2");
        MyThread2 myThread3 = new MyThread2("thread3");
        new Thread(myThread1).start();
        new Thread(myThread2).start();
        new Thread(myThread3).start();
    }
}



运行结果：
thread2,i=0
thread3,i=0
thread1,i=0
thread3,i=1
thread2,i=1
thread3,i=2
thread1,i=1
thread3,i=3
thread2,i=2
thread3,i=4
thread1,i=2
thread1,i=3
thread1,i=4
thread2,i=3
thread2,i=4
