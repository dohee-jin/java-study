package chap1_9.enum_;

public enum PizzaStatus {

    // 주문완료, 준비 완료, 배달 완료
    ORDERED("주문 완료", 10), // 이눔 상수 안에 파라미터를 넣을 수 있음, 왜냐 이눔은 클래스와 비슷하기 때문
    READY("준비 완료", 20),  // 상수지만 사실 생성자라고도 볼 수 있음
    DELIVERED("배달 완료", 30)
    ;

    // 필드 선언
    private String description;
    private final int timeToSetup;

    // 생성자 선언
    PizzaStatus(String description, int timeToSetup) {
        this.description = description;
        this.timeToSetup = timeToSetup;
    }

    // getter
    public String getDescription() {
        return description;
    }

    public int getTimeToSetup() {
        return timeToSetup;
    }
}
