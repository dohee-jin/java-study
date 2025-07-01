package chpa1_7.inherit.payer;

public class Berseker extends Warrior{

    // 자바는 다중상속 지원하지 않음
    // 인터페이스로 다중상속을 구현
    public Berseker(String nickName) {
        super(nickName);
    }
}
