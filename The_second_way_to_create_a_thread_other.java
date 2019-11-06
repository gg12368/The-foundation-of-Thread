对于此时的Runnable接口对象可以采用匿名内部类或者Lambda表达式来定义

//匿名内部类
public class TestDemo {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				System.out.println("Hello World");
			}
		}).start();
	}
}

//Lambda表达式
public class TestDemo {
	public static void main(String[] args) {
		Runnable runnable=()->System.out.println("Hello World");
		new Thread(runnable).start();
	}
}
