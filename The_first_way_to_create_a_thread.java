继承Thread类
步骤：
（1）创建一个Thread线程类的子类（子线程），同时重写Thread类的run方法；
（2）创建稿子类的实例对象，并通过调用start（）方法启动线程。


class MyThread extends Thread {
	private String title;

	public MyThread(String title) {
		this.title = title;
	}

	/*
	 * 这里我们自然会想到产生线程的实例化对象后调用run()方法，实际上我们不能直接去调用run()方法
	 */
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.title + ",i=" + i);
		}
	}
}

public class TestDemo {
	public static void main(String[] args) {
		MyThread myThread1 = new MyThread("Thread1");
		MyThread myThread2 = new MyThread("Thread2");
		MyThread myThread3 = new MyThread("Thread3");
		/*
		 * 这时候只进行了顺序打印，和多线程无关。正确启动多线程能够的方式是调用Thread类中的start()方法 myThread1.run();
		 * myThread2.run();
     * myThread3.run();
		 */
		myThread1.start();
		myThread2.start();
		myThread3.start();
	}
}



运行结果：
Thread2,i=0
Thread2,i=1
Thread2,i=2
Thread2,i=3
Thread2,i=4
Thread2,i=5
Thread2,i=6
Thread2,i=7
Thread2,i=8
Thread3,i=0
Thread1,i=0
Thread1,i=1
Thread3,i=1
Thread2,i=9
Thread3,i=2
Thread3,i=3
Thread3,i=4
Thread3,i=5
Thread3,i=6
Thread3,i=7
Thread3,i=8
Thread3,i=9
Thread1,i=2
Thread1,i=3
Thread1,i=4
Thread1,i=5
Thread1,i=6
Thread1,i=7
Thread1,i=8
Thread1,i=9
