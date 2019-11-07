Runnnable中的run()方法没有返回值。它的设计也遵循了主方法的设计原则；线程一开始就不回头。
但是很多时间需要一些返回值，例如某些线程执行完成后可能带来一些返回结果，这种情况下就只能利用Callable来实现多线程。

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
class MyThread5 implements Callable<String> {
    private int ticket = 5;// 一共5张票
    public String call() throws Exception {
        while (this.ticket > 0) {
            System.out.println("剩余票数：" + this.ticket--);
        }
        return "票已经售完";
    }
}
public class CreateThreadThird {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        FutureTask<String> task = new FutureTask<>(new MyThread5());
        new Thread(task).start();
        new Thread(task).start();
        System.out.println(task.get());
    }
}



运行结果：
剩余票数：5
剩余票数：4
剩余票数：3
剩余票数：2
剩余票数：1
票已经售完
