class MyThread4 implements Runnable {
    private int ticket = 5;// 一共5张票

    public void run() {
        while (ticket > 0) {
            System.out.println("剩余票数：" + this.ticket--);
        }
    }
}
public class ImplementsRunnableTrue {
    public static void main(String[] args) {
        MyThread4 mt = new MyThread4();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();

    }
}



运行结果：
剩余票数：4
剩余票数：3
剩余票数：5
剩余票数：1
剩余票数：2
