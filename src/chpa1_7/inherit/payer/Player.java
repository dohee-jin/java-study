package chpa1_7.inherit.payer;

// 상속을 위해 공통 속성과 공통 기능을 가진 부모 클래스(super class)
// 클래스는 java.lang.Object를 자동적으로 상속하고 있음
// Object는 모든 클래스의 부모
public class Player /*extends Object*/{

    // 필드
    String nickName;
    int hp;
    int level;
    int rage;
    int exp;

    /*public Player() {
       // 자바빈에서는 기본 생성자를 사용자가 직접 사용하게 하고 있음
    }*/
    public Player(String nickName, int hp) {
        this.nickName = nickName;
        this.level = 1;
        this.hp = hp;

       /* System.out.println("전사의 생성자 호출");
        this.nickName = nickName;
        this.level = 1;
        this.hp = 100;*/
    }

    // 메소드
    void attack() {
        System.out.printf("%s님이 공격합니다.\n", this.nickName);
    }

    void showStatus() {
        System.out.println("\n=======플레이어 정보========");
        System.out.println("# 닉네임: " + this.nickName);
        System.out.println("# 레벨: " + this.level);
        System.out.println("# 체력: " + this.hp);
        System.out.println("# 경험치: " + this.exp);
    }
}
