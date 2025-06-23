package chap1_2;

import java.util.Scanner;

public class StandardIO {
    public static void main(String[] args) {

        // 자바의 표준 출력
        // 자바는 홑따옴표 사용 안됨
        System.out.print("안녕\n");
        System.out.print("메롱");

        // ln 줄바꿈처리해줌
        System.out.println("메롱");

        //
        int month = 6;
        int day = 6;
        System.out.println("오늘은" + month + "월" + day + "일 입니다.");
        // -> printf는 c언어 출력 포맷팅, ln기능이 빠져있어 필요시 \n 추가
        /*
            %d -> 10진 정수
            %s -> 문자열, 스트링
            %c -> 문자 하나
            %f -> 실수
        */
        System.out.printf("오늘은 %d월 %d일 입니다.\n", month, day);

        // 자바 15부터 가능
        String message = "오늘은 %d월 %d일 입니다.".formatted(month, day);
        System.out.println("message: = " + message);

        // 자바 5부터 가능
        String message2 = String.format("오늘은 %d월 %d일 입니다.\n", month, day);

        // 표준 입력
        Scanner scanner = new Scanner(System.in); // 스캐너 객체, 인스턴스 생성

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine(); // 입력커서 생성
        System.out.println(name);

        System.out.print("나이를 입력하세요: ");
        // Integer.parseInt(): 정수 변환 함수
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println(age);

    }
}
