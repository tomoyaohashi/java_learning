public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        /* 引数に値を直接指定してspeedUpメソッドを呼び出す */
        car.speedUp(10);
        /* 引数に変数を指定してspeedUpメソッドを呼び出す */
        int newSpeed = 80;
        car.speedUp(newSpeed);
    }
}
