package chap1_6.encap;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("모닝");
        // 시동 걸기 위해서 먼저 엔진 오일 분사 ->
        // 시동버튼 누리고 -> 시동걸기 -> 실린더 작동

        myCar.injectOil();
        myCar.pressBtn();
        myCar.powerOn();
        myCar.pressBtn();

//        myCar.model = "페라리 119";
        myCar.setMode("P");
        System.out.println("현재 모드" + myCar.getMode());
        System.out.println("모델명" + myCar.getModel());
    }
}
