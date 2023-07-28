package surasura.chapter12;

class Radio implements Powerable {
    private boolean isPowered = false;

    @Override
    public boolean powerOn() {
        if (!isBatteryEnabled()) {
            /* バッテリが切れていたら電源を入れない */
            return false;
        }
        this.isPowered = true;
        return true;
    }

    @Override
    public void powerOff() {
        this.isPowered = false;
    }

    private boolean isBatteryEnabled() {
        /* ここにバッテリの状態をチェックする処理 */
        return false;   /* コンパイルエラーにならないよう暫定でfalseを返す */
    }
}