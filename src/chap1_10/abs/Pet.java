package chap1_10.abs;

// 추상적
// 추상 클래스: 실체화된 객체가 아닌 다형성을 위한 껍데기 클래스 (규격)
// 오버라이딩을 강제할 수 있음

// pet 클래스는 설계도가 아닌 규격, 추상 클래스는 규격서, 설계도가 아님
public abstract class Pet {

    // 추상 메소드: 오버라이딩을 위한 껍데기 틀
    // 추상 메소드는 (); 로 끝나야 함. 내용을 정의하지 않기 때문
    public abstract void feed();
    public abstract void sleep();
}
