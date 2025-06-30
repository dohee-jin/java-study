package chap1_6.encap;

import java.lang.invoke.SwitchPoint;

public class Car {
    private String model;
    private String mode; // 변속보드 \
    private String ownerName;
    private boolean on;

    // 생성자
    public Car(String model){
        this.model = model;
    }

    // 기능
    // Setter 메소드: 필드값을 안전하게 처리하는 메서드
    public void setMode(String mode) {
        switch (mode) {
            case "D": case "R": case"N" :case "P":
                this.mode = mode;
                break;
            default:
                this.mode = "P";
                break;
        }

    }

    // getter 메소드
    public String getMode() {
        return mode;
    }

    public String getModel() {
        return model;
    }

    // 논리 필드는 게터가 is로 시작함
    public boolean isOn() {
        return on;
    }

    // 엔진오일을 분사하는 기능
    void injectOil() {
        System.out.println("엔진오일이 분사됩니다.");
    }

    // 엔진 실린더가 반복 작동하는 기능
    void moveCylinder() {
        if(!on){
            System.out.println("d");
        }
        else {

        }
    }

    // 시동이 걸리는 기능
    void powerOn() {
        on = true;
        System.out.println("시동이 걸렸습니다.");
    }

    // 시동 버튼을 누르는 기능
    void pressBtn() {

    }
}
