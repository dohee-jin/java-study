package chpa1_7.inherit.payer;

public class Hunter extends Player{

    int concentrate; // 집중 게이지

    public Hunter(String nickName) {
        super(nickName, 60);
        this.concentrate = 100;
        /*System.out.printf("%s의 생성자 호출" , this.nickName);
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
        this.concentrate = 100;*/
    }

    @Override
    void showStatus() {
        super.showStatus();
        System.out.println("# 집중: " + this.concentrate);
    }

    void multiArrow() {

    }
}

