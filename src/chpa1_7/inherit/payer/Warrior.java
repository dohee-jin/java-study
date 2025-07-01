package chpa1_7.inherit.payer;

// 부모로 부터 기능과 속성을 불려받는 자식 클래스(sub class)
// 상속은 is a 관계 - 사자는 동물이다...
public class Warrior extends Player {

    /*public Warrior() {
        //super();
    }*/
    public Warrior(String nickName) {
      super(nickName, 100);
      this.rage = 0;
    }

    // 오버라이딩: 부모가 물려준 메소드를 고쳐 쓰는 것
    // 규칙: 1. 부모의 시그니처(이름, 리턴타입, 파라미터)와 동일해야 함
    //       2. 접근제어자는 more public
    // 부모가 퍼블릭이면 자식도 퍼블릭이어야 함 오버라이딩 하는 부모의 접근지정자보다 퍼블릭해야함

    @Override // 오버라이딩 룰을 위반했는지 체크
    void showStatus() {
        super.showStatus();
        System.out.println("# 분노: " + this.rage);
    }

    void dash() {
        System.out.printf("%s님이 돌진합니다.\n", this.nickName);
    }


}
