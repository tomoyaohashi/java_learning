package surasura.chapter17.list17_3;

public class Car {
    /* ここからフィールド */
    /* スピード */
    private int speed = 0;

    /* ここからメソッド */
    /* 最高速度を返す */
    protected int getMaxSpeed() {
        return 180;
    }

    /* 速度を上げる */
    public void speedUp() {
        this.speed += 10;
        if (this.speed > getMaxSpeed()) {
            this.speed = getMaxSpeed();
        }
    }

    /* 速度を下げる */
    public void speedDown() {
        this.speed -= 10;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}
