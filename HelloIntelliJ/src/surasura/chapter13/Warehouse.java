package surasura.chapter13;

/* 倉庫クラス（何でも扱える） */
public class Warehouse {
    private Object item;

    /*「物」オブジェクトを預かる */
    public void stock(Object item) {
        this.item = item;
    }

    /*「物」オブジェクトを取り出す */
    public Object leave() {
        Object item = this.item;
        this.item = null;
        return item;
    }
}