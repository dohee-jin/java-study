package chpa1_7.inherit.payer;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("주차왕파킹");
        warrior.showStatus();

        Mage mage = new Mage("충격왕쇼킹");
        mage.showStatus();
        mage.fireBall();

        Hunter hunter = new Hunter("헌터");
        hunter.showStatus();
    }
}
