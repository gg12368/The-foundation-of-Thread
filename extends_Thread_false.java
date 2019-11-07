在多线程的处理上使用的就是代理设计模式。除了以上的关系之外，实际上在开发之中使用Runnable还有一个特点：使用Runnable实现的多线程的程序类可以更好的描述出程序共享的概念(并不是说Thread不能)
示例1：使用Thread实现数据共享（产生若干线程进行同一数据的处理操作）
此时启动三个线程实现买票处理，结果变成了买各自的票。

class MyThread extends Thread {
	private int ticket = 5;// 一共5张票

	public void run() {
		while (ticket > 0) {
			System.out.println("剩余票数：" + this.ticket--);
		}
	}
}

public class TestDemo {
	public static void main(String[] args) {
		new MyThread().start();
		new MyThread().start();
		new MyThread().start();

	}
}



运行结果：
剩余票数：5
剩余票数：5
剩余票数：5
剩余票数：4
剩余票数：4
剩余票数：3
剩余票数：4
剩余票数：2
剩余票数：3
剩余票数：1
剩余票数：3
剩余票数：2
剩余票数：1
剩余票数：2
剩余票数：1
