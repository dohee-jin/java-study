package chpa1_7.inherit.payer;

// 부모로 부터 기능과 속성을 불려받는 자식 클래스(sub class)
// 상속은 is a 관계 - 사자는 동물이다...
public class Warrior extends Player {


    public Warrior(String nickName) {
      super(nickName, 100);
      this.rage = 0;
    }

    void dash() {
        System.out.printf("%s님이 돌진합니다.\n", this.nickName);
    }
}
