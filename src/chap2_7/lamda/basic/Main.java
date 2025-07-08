package chap2_7.lamda.basic;

public class Main {

    public static void order(Pet pet) {
        System.out.println("주인님의 명령입니다!");

        // 콜백함수 처리
        pet.eat();

        System.out.println("꺼어어어어어억");
    }

    public static void main(String[] args) {

        // dog가 함수를 저장하는 것 같아 보여도 객체를 저장
        Pet dog = () -> System.out.println("강아지는 사료를 먹어요~");
        order(dog);
        System.out.println("=======================");

        order(() -> System.out.println("호랑이는 생고기를 먹어요 어흥!"));

        System.out.println("========================");
        order(() -> {
            System.out.println("하후");
            System.out.println("메롱메롱");
        });
    }
}
