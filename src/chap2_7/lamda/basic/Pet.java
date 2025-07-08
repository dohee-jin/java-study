package chap2_7.lamda.basic;

// 함수형 인터페이스 - 람다를 사용할 수 있는지 체크
@FunctionalInterface
public interface Pet {

    // 이 인터페이스는 추상메소드가 딱 1개
    // 이 인터페이스는 람다를 사용할 수 있음.
    void eat();

    // 추상메소드가 두 개 부터는 람다 사용 못함
    // 오버라이딩 하는 게 두개라 구분을 할 수 없음
    // void sleep();

    // static, default는 오버라이딩을 강제하지 않아서
    // 람다로 사용해도 됨!
    static/*default*/ void foo () {

    }
}
