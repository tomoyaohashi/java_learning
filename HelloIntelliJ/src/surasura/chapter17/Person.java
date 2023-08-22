package surasura.chapter17.list17_8;

public class Person {
    private String name;
    private int age;

    /* 引数のないコンストラクター */
    public Person() {
        this.name = "名無しさん";
        this.age = 18;
    }

    /* 引数のあるコンストラクター */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getInfo() {
        return this.name + "：" + this.age + "歳";
    }
}
