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

