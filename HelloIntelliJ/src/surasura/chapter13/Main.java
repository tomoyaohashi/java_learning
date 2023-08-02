package surasura.chapter13.list13_2;

public class Main {
    public static void main(String[] args) {
        /* パソコンを倉庫に預ける */
        Warehouse computerWarehouse = new Warehouse();
        Computer computer = new Computer();
        computerWarehouse.stock(computer);

        /* 自動車を倉庫に預ける */
        Warehouse carWarehouse = new Warehouse();
        Car car = new Car();
        carWarehouse.stock(car);

        /* パソコンを倉庫から取り出す */
        Computer computer = (Computer) computerWarehouse.leave();
        /* 自動車を倉庫から取り出す */
        Car car2 = (Car) carWarehouse.leave();

    }
}
