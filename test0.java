/**
 * 解释：这个代码虽然在控制台输出输出的main其实就是一个名称为main的线程在执行main()方法中的代码。
 * 在控制台输出的main和main方法没有任何关系。
 */
public class Demo0 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
    }
}
