package surasura.chapter14.list14_6;

public class TransmitExample {
    public void method1() {
        method2();
    }

    public void method2() {
        try {
            method3();
            System.out.println("ここは実行されません。");
        } catch (MyRuntimeException e) {
            System.out.println("例外が通知されました。");
        }
    }

    public void method3() {
        /* 注：MyRuntimeExceptionは非検査例外 */
        throw new MyRuntimeException();
    }
}
