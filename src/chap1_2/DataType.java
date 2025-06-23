package chap1_2;

public class DataType {

    public static void main(String[] args) {
        // 정적 타이핑 언어, 타입 지정 필요
        int a = 20;
        double b = 3.14;
        char c = 'A'; // 문자 하나는 ''
        String d = "hello"; // 문자열은 ""
        boolean flag = true;

        // 정수타입
        // (byte - 1, short - 2, int - 4, long)
        // 1byte = 8bit -> 10진수 정수 8 => 00001000
        // 128 ~ 127
        // 2byte = 16bit -> 10진수 정수 1000=>1111101000
        // -32768 ~ 32676

        byte x1 =127;
        short x2 = 32767;
        int x3 = 2147483547;
        long x4 = 2147483548L;

        // 변수에 저장되기 전 값 = 리터럴
        // 리터럴은 데이터의 크기와 상관없이 4byte
        // 롤타입은 값 뒤에 L을 붙임

        // 실수타입
        float f1 = 3.1412134422F; //4byte - 7자리
        double f2 = 3.1412134422; // 8byte - 15자리

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        // 논리타입
        // 자바는 truthy, falsy 인정 안됨
        boolean b1 = true;
        boolean b2 = false;

        // 문자타입
        char c1 = 'A'; // 2byte 0 ~ 65535
        char c2 = 97; // 2byte, 유니코드 표현가능
        String c3 = "hello";
        System.out.println("c2 = " + c2);

        char [] cArr = {'h', 'e', 'l', 'l', '0'};
        System.out.println(cArr);

        // 자바 17부터 지원
        String str3 = """
             안녕, 
             메롱
                """;

        // 동적 타이핑 지원(java 9)
        var z = 100;
        var z1 = 'A';
    }
}
