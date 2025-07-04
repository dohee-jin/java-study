package chap2_2.lang;

public class WrapperExample {

    private int n; // 초기값 0
    private Integer m; // 초기값 null, 바로 연산 불가능

    public static void main(String[] args) {
        // 자바는 객체지향 언어이다.
        // 자바는 기본타입이 있다.
        // 기본 타입 -> 객체: wrapper
        // Byte, Short, Integer, Long, Float, Double, Boolean, Character
        // 기본타입에도 메소드를 추가할 수 있다.
        Integer x1 = new Integer(10);
        int a = 100;

        // boxing: 그냥 기본타입 처럼 써도 객체로 처리해주겠다.
        Integer x2 = 20;
        System.out.println(x1 + x2);

        foo(a); // 기본타입을 매개변수로 보내
    }

    // Integer로 캐스팅해줌(자동!)
    static void foo(Integer a) {

    }
}
