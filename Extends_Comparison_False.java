class TicketWindows extends Thread{
    private int tickets=5;
    public void run(){
        while(true){
            if(tickets>0){
                System.out.println(Thread.currentThread().getName()+"正在发售第"+tickets--+"张票");
            }
        }
    }
}
public class ExtendsComparison extends Thread{
    public static void main(String[] args) {
        //分别创建4个线程对象TicketWindows并开启，来模拟4个售票窗口
        new TicketWindows().start();
        new TicketWindows().start();
        new TicketWindows().start();
        new TicketWindows().start();
    }
}



运行结果：
Thread-3正在发售第5张票
Thread-3正在发售第4张票
Thread-3正在发售第3张票
Thread-3正在发售第2张票
Thread-3正在发售第1张票
Thread-1正在发售第5张票
Thread-1正在发售第4张票
Thread-1正在发售第3张票
Thread-1正在发售第2张票
Thread-1正在发售第1张票
Thread-2正在发售第5张票
Thread-2正在发售第4张票
Thread-2正在发售第3张票
Thread-2正在发售第2张票
Thread-2正在发售第1张票
Thread-0正在发售第5张票
Thread-0正在发售第4张票
Thread-0正在发售第3张票
Thread-0正在发售第2张票
Thread-0正在发售第1张票



解释：
从运行结果可以看出，每张票都被发售了4次。出现这种现象的原因是4个线程没有共享100张票，而是各自出售了100张票。
在程序中创建了4个TicketWindows对象，就等于创建了4个售票程序，而每个TicketWindows对象中都有一个tickets票据变量，
这样每个线程在执行任务时都会独立地处理各自的资源，而不是共同处理同一个售票资源。

