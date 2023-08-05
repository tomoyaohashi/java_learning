package surasura.chapter13.list13_6;

/* ものを扱えるクラス（ジェネリクス利用） */
public class Warehouse<T> {
    private T item;

    /* 「物」を預かる */
    public void stock(T item) {
        this.item = item;
    }

    /* 「物」を取り出す */
    public T leave() {
        T item = this.item;
        this.item = null;
        return item;
    }
}