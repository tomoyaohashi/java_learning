public class Truck extends Car {
    private int payload = 0; //privateでカプセル化

    /* 荷物（ペイロード）の確認 */
    int getPayload() { //カプセル化された値を取得
        return this.payload;
    }

    /* 荷物（ペイロード）を載せる */
    void addPayload(int value) {
        this.payload += value;
    }

    /* 荷物（ペイロード）を下ろす */
    void deletePayload(int value) {
        this.payload -= value;
    }

    @Override
    String getCarType() {
        return "トラック";
    }

}
