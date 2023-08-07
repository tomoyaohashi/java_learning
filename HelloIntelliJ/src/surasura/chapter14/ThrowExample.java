package surasura.chapter14.list14_4;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
            /* 絶対通らない処理のため、実際はコンパイルエラーとなる */
//            System.out.println("ここは実行されません。");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("例外が通知されました。");
        }
    }
}