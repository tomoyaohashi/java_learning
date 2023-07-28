package surasura.chapter12;

interface Powerable {
    /* 電源を入れるメソッド。返り値の定義は次のとおり
     * true:電源が入った
     * false:何らかの理由により電源が入らなかった
     */
    boolean powerOn();

    /* 電源を切るメソッド */
    void powerOff();
}

//TelevisionクラスとRadioクラスはPowerableのインターフェイスを実装している為、Powerableの変数に代入できる。