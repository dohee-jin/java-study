package chpa1_7.gisa;

public class Parent {
    public String nation;

    public Parent() {
        // 1. this() 스트링을 입력받는 생성자로 이동
        this("대한민국");
        // 3. 출력 후 자식으로 이동
        System.out.println("Parent() call!");
    }
    public Parent(String nation) {
        this.nation = nation;
        // 2. 출력 후 다시 위의 Parent() 기본 생성자로 이동
        System.out.println("Parent(String) call!");
    }
}