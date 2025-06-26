package chap1_3;

// 자동차 설계도
public class Vehicle {

    // 속성 (필드)
    // 일반 속성 - 일반적으로 잘 안 바뀜
    // ex) 자동차 - 제조사, 모델명
    String model;

    // 상태 속성 - 수시로 변하는 속성
    // ex) 자동차 - 현재 속도, 연료 잔량
    int currentSpeed;
    int fuel;

    // 복합 속성(부품 속성)
    /* Js
        {
            company: "현대",
            model: "포터",
            currentSpeed: 0,
            isOn: false,
            owner: {
                name: '홍길동',
                registerDate: '2024-11-30'
            }
        }
     */
    // 자바도 객체 안에 객체 생성 가능
    Onwer owner = new Onwer();

    boolean isOn;

    // 생성자 (객체의 초기화)
    // 기본 생성자 - 파라미터 없는 생성자
    //jm 이 컴파일 시에 자동으로 생성해줌
    // 단 다른 생성자가 1개라도 있으면 안만들어줌
    // Vehicle () {}


    // alt+enter 생성자 생성 단축키

    public Vehicle(boolean isOn, Onwer owner, int fuel, int currentSpeed, String model) {
        this.isOn = isOn;
        this.owner = owner;
        this.fuel = fuel;
        this.currentSpeed = currentSpeed;
        this.model = model;
    }


    // Vehicle(String s1, String s2) {
    //  money = s2;
    //  model = s1;
    // }



    // 기능(메소드)
    void info(){
        System.out.println("자동차 주인: " + owner.name);
        System.out.println("자동차 aheofa: " + model);
        System.out.println("자동차 주인: " + owner.registerDate);
    }

    // 시동을 켜는 기능
    void powerOn() {
        if (isOn) {
            System.out.println("시동이 이미 걸려있습니다.");
            return;
        }
        isOn = true;
        System.out.println(model + "의 시동이 걸렸습니다.");
    }

    // 시동을 끄는 기능
    void powerOff() {
        if (!isOn) {
            System.out.println("시동이 걸려있지 않습니다.");
            return;
        }
        isOn = false;
        System.out.println("시동이 꺼졌습니다.");
    }
    // 주행기능
    void accelerate() {
        System.out.printf("%s 자동차가 주행을 시작합니다.\n", model);
        currentSpeed += 20;
        System.out.printf("현재 속도: %dkm/h\n", currentSpeed);
    }
}
