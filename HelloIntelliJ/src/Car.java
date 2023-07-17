/* speedフィールドがカプセル化と公開メソッドを用意したCarクラス */
class Car {
    /* スピードを保存するフィールド */
    private int speed;

    /* スピードを取得するメソッド */
    int getSpeed() {
        return this.speed;
    }

    /* スピードを上げるメソッド */
    void speedUp(int value) {
        if (value < 0) {
            /* 負の加速は無視する */
            return;
        }
        this.speed += value;
        /* 安全装置（最高速度）*/
        if (this.speed >= 180) {
            this.speed = 180;
        }
    }

    /* スピードを下げるメソッド */
    void speedDown(int value) {
        if (value < 0) {
            /* 負の減速は無視する */
            return;
        }
        this.speed -= value;
        /* 安全装置（バック時） */
        if (this.speed <= -15) {
            this.speed = -15;
        }
    }

    String getCarType() {
        return "自動車";
    }
}

/*
・メソッドの値が返す必要のないものであった場合は「void型」を使用する
・get＋フィールド名（ゲッターメソッド）でカプセル化された現在の速度（変数）を取得できる

 */