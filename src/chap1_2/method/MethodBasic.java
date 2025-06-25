package chap1_2.method;

public class MethodBasic {
    // 자바는 함수라는 개념이 없음
    // 메소드: 객체가 가진 기능
    // 메소드를 정의할 수 있는 위치는 클래스 내부, 메소드 외부
    // 메인 메소드가 있어야 동작, 메인 메소드는 자바가상머신이 알아서 불러옴
    // String[] args -> String... args 둘 다 사용가능
    // 메소드 안에서 메소드 호출은 가능
    public static void main(String... args) {
        int result = add(50, 30);
        System.out.println(result);

        int result2 = addAll(new int[]{1, 2, 3, 4, 5});
        System.out.println(result2);
    }
    // 리턴되는 데이터 타입을 메소드 명 앞에 명시해줘야 함
    static int add(int n1, int n2) {
       return n1 + n2;
    }

    // byte + byte 데이터 타입캐스팅으로 리턴타입은 int
    int add2(byte n1, byte n2) {
        return n1 + n2;
    }

    // 리턴값이 없으면 void로 작성
    void bar() {
        System.out.println("Hello World");
    }

    // n개의 정소를 전달받아서 싹 더해서 리턴
    // 몇개가 올지 모르는 상황에서는 배열로 받음
    static int addAll(int... numbers) {
        int total = 0;
        for(int n : numbers) {
            total += n;
        }
        return total;
    }

    // 배열 2개를 전달받을 때
    static void ticky(int[] num1, int[] num2) {
        // 배열 여러개 받을 때는 나열해서 받으면 어디부터 어디까지가 무슨
        // 배열인지 알 수 없어서 끊어서 받아야 함
    }

    // 여러개를 리턴하고 싶을 때
    int[] multiReturn(int n1, int n2) {
        return new int[]{n1 + n2, n1 - n2};
    }

    // 처음 메소드를 만들때 void로 선언하면 에러가 안뜸
    // 리턴값이 있는 지 없는 지 확인하여 나중에 타입을 바꾸면 됨
}
