package surasura.chapter15.list15_2;

public class Example01 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("thread01");
        MyThread t2 = new MyThread("thread02");
        t1.start();
        t2.start();
        System.out.println("メインスレッドを終了します。");
    }
}