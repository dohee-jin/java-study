package chpa1_7.gisa;

public class Child extends Parent {
    private String name;

    public Child() {
        // super(); this()가 있으면 super()가 없음
        this("홍길동");
        // 아래 스트링을 입력받는 생성자로 이동
        // 5. 출력
        System.out.println("Child() call!");
    }

    public Child(String name) {
        // this()가 없기 때문에 숨겨져 있던 super()가 실행
        // Parent로 이동
        this.name = name;
        // 4. 출력
        System.out.println("Child(String) call!");
    }
}
