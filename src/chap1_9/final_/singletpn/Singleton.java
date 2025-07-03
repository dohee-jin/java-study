package chap1_9.final_.singletpn;

public class Singleton {

    int a;


    // 싱글턴 패턴: 객체 생성은 오직 하나만 생성.

    // 1. 아예 외부에서 객체를 못만들게 함.
    private Singleton() {

    }

    // 2. 스스로 딱 하나의 객체를 생성함
    private static Singleton instance;

    static  {
        instance = new Singleton();
    }

    // 3. 외부에 공개할 메소드를 만들고 그 메소드에 단 하나의 객체를 리턴시킴
    public static Singleton getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "a=" + a +
                '}';
    }
}
