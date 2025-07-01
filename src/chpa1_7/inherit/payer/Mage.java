package chpa1_7.inherit.payer;

public class Mage extends Player {

    int mana;

    public Mage(String nickName) {
        super(nickName, 50);
        this.mana = 100;
        /*System.out.printf("%s의 생성자 호출" , this.nickName);
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
        this.mana = 100;*/
    }

    void fireBall() {
        System.out.printf("%s님이 파이어볼을 시전합니다. \n", this.nickName);
    }
}
