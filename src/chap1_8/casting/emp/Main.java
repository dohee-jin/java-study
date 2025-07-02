package chap1_8.casting.emp;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner();
        owner.orderWork(new Designer());
        // 다운캐스팅, 업캐스팅은 상속관계에서만 가능
    }
}
