package chpa1_7.inherit.payer;


/*
    Object
      |
    Player

*/
public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("주차왕파킹");
        warrior.showStatus();

        Mage mage = new Mage("충격왕쇼킹");
        mage.showStatus();

        Hunter hunter = new Hunter("헌터");
        hunter.showStatus();

        mage.fireBall(warrior);
        mage.fireBall(hunter);
        mage.fireBall(new Mage("법사짱킹맨"));
    }
}
