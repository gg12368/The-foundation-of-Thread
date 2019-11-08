class TicketWindows2 implements Runnable{
    private int tickets=5;
    public void run(){
        while(true){
            if(tickets>0){
                System.out.println(Thread.currentThread().getName()+"正在发售第"+tickets--+"张票");
            }
        }
    }
}
public class ImplementsComparison {
    public static void main(String[] args) {
        //创建TicketWindows实例对象tw
        TicketWindows2 tw=new TicketWindows2();
        //分别创建4个线程对象同时进行命名，并开启线程
        new Thread(tw,"窗口1").start();
        new Thread(tw,"窗口2").start();
        new Thread(tw,"窗口3").start();
        new Thread(tw,"窗口4").start();
    }
}




运行结果：
窗口3正在发售第4张票
窗口1正在发售第5张票
窗口4正在发售第3张票
窗口2正在发售第2张票
窗口3正在发售第1张票
