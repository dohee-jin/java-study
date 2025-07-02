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

    @Override
    void showStatus() {
        super.showStatus();
        System.out.println("# 마력: " + this.mana);
    }

    void fireBall(Player player) {
        /*
            파이어볼을 맞은 플레이어의 직업이 전사면 50의 데미지를 입혀라
            마법사는 60의 데미지
            사냥꾼이면 40의 데미지

            전사가 파이어볼을 맞으면 해당 전사는 돌진을 시전
        * */

        System.out.printf("%s님이 파이어볼을 시전합니다. \n", this.nickName);

        int damage = 0;

        if(player == this) {
            System.out.println("자신에게는 공격이 불가능합니다.");
            return;
        }

        if(player instanceof Warrior) {
            damage = 50;
            // new Mage(this.nickName) 는 새 객체를 생성하는 거라 이상함
            // this 자체를 넘김, this는 객체 자기자신을 가리키고 있음
            // 그래서 this.~ 을 통해 ~ 필드에 접근하고, ~ 메소드를 호출할 수 있음
            ((Warrior) player).dash(this);
        } else if(player instanceof Mage) {
            damage = 60;
        } else if (player instanceof Hunter) {
            damage = 40;
        }

        player.hp -= damage;
        System.out.printf("%s 님은 %d의 피해를 입었습니다.\n", player.nickName, damage);
        System.out.println();
    }
}
