package chap1_2;

public class TypeCasting {
    public static void main(String[] args) {
        // 자바는 타입이 다른 데이터의 연산을 지원하지 않음
        byte a = 100;
        int b = a;
        // 암묵적 형 변환(byte -> int)
        // int의 크기가 더 크기때문에 가능

        int c = 1000;
        // byte d = c ; // int: 4 -> byte: 1 이건 자동으로 형 변환 불가능
        byte e = (byte)c ; // (데이터타입) 명시적 형 변환 - 데이터 손실 발생할 수 있음

        System.out.println("e = " + e);

         /* byte e는 -24 가 출력됨

            int c
            0(부호비트) 0000000 00000000 00000011 11101000

            ---> byte 0(부호비트) 000 0000
            11101000만 가져가게 됨.

            byte e 가 왜 24냐?
            1(부호비트) 1101000

            컴퓨터의 음수 표현은 보수로 표현
            1의 보수: 반전
            2의 보수: 1의 보수 + 1
            1) 1101000 -> 0010111
            2) 0010111 + 1 -> 001100 -> 24
            byte e는 1(부호비트)001100 -> -24가 출력됨
        */

        int k = 50; // 4byte
        double j = k; // 8byte
        // j는 실수형 표현으로 소수점으로 출력됨

        double m = 5.567;
        int n = (int) m; // 데이터 손실을 피할 수 없음
        System.out.println("n = " + n);
        // 소수점을 버리고 정수 부분만 출력됨

        // 암묵적(묵시적) 형 변환 -> upcasting (promotion) : 더 넓은 범위의 데이터 타입으로 이동
        // 명시적 형 변환 -> downcasting : 더 작은 범위의 데이터 타입으로 이동
        
        // 타입이 다른 데이터끼리의 연산은
        // 암묵적 형변환에 의해 작은 테이터가 큰 데이터로 변환됨
        
        int v = 91;
        double z = 6.6;
        double result = v + z;
        System.out.println("result = " + result);
        // 정수부분끼리 덧셈함

        int result2 = 'A' + v;
        System.out.println("result2 = " + result2);
        // 1개의 문자열 + 정수형은 아스키코드 값과 정수 값이 덧셈됨

        // int 보다 작은 데이터(char, short, byte) 들은 연산결과가 무조건 int
        byte b1 =100;
        byte b2 = 70;
        int result4 = b1 + b2;

        System.out.println('A' + 'c');

        // int 보다 작은 데이터들끼리의 연산결과 시 데이터들의 범위 보다 커지는 경우를
        // 고려해 더 큰 데이터 타입으로 캐스팅됨
        // 자바는 문자열 + 문자열 = 문자열문자열 이 아닌 int로 출력된다.

    }
}
