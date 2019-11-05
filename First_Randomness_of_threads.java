class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("run=" + Thread.currentThread().getName());
        }
    }
}
public class FirstRandomThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 myThread = new MyThread1();
        myThread.setName("myThread");
        myThread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main=" + Thread.currentThread().getName());
        }
    }
}



运行结果：
run=myThread
main=main
run=myThread
main=main
run=myThread
main=main
run=myThread
main=main
run=myThread
main=main
main=main
main=main
main=main
main=main
main=main
