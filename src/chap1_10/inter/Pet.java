package chap1_10.inter;

// 추상적
// interface = abstract class
public interface Pet {

    // 인터페이스는 필드를 가질 수 없음
    // 따라서 필드를 하위 클래스에게 상속시키고 싶으면 추상클래스를 써야함.
    // static final이 붙어있어 상수처리됨. 상수는 만들 수 있음
    /* static final */int abc = 3;

    // 애완동물의 필수 기능
    // 노는 기능
    public abstract void handle();
    // 예방접종 기능
    public abstract boolean inject();

    // 뒤늦게 이미 구현이 많은 상태에서 새 메소드를 추가할 때는 오버라이딩을 강요하지 말자
    // 수동으로 오버라이딩 함
    default void eat() {}

    // 오버라이딩이 완료되면 추상화 시킴
    // void eat();

    // 인터페이스는 인스턴스 생성을 할 수 없어서
    // 일반 메소드 생성이 안됨, 근데 static 메소드는 생성이 됨
}
