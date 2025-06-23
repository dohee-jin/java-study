package chap1_2.array;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {

        // (기본)배열:
        // 1. 동종모음 구조 (같은 타입끼리만 저장 가능)
        // 2. 생성시의 크기가 불변함 (값을 안넣으면 기본값 초기화)

        // 1. 배열 변수를 선언
        int [] numbers; // int 4byte? (x)

        // 배열은 스택에 주소를 저장하고 힙에 데이터를 저장함
        // 2. 배열을 생성 (힙 = 시골 에 데이터를 저장)
        numbers = new int[5]; // new 가 힙에 메모리를 올린다고 했던 것 같은데..?

        System.out.println("numbers=" + numbers); // numbers의 주소가 출력

        // 3. 배열을 초기화 (값 저장)
        numbers[0] = 50;
        numbers[1] = 77;
        numbers[2] = (int)66.7;
        // numbers = [50, 77, (int)66.7, numbers[0] * 2, 99];

        // 배열 값 확인: Arrays.toString(배열명)
        System.out.println(Arrays.toString(numbers));

        // 배열 길이 확인: 배열명.length
        System.out.println(numbers.length);

        // 배열 순회
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        // enhanced for loop: 강화된 for문, iter 단축키 사용
        for(int i : numbers) {
            System.out.println(i);
        }

        // for each
        Arrays.stream(numbers).forEach(n -> System.out.println(n));


        // 배열 단축 생성 문법
        // String [] pets = new String[] {"멍멍이", "야옹이", "수달", "숑뭉이", "쇼냥이", "냥덕이", "똘병이"};

        // 변수를 선언할 때 만 new Type[] 생략 가능
        String [] pets = new String[] {"멍멍이", "야옹이", "수달", "숑뭉이", "쇼냥이", "냥덕이", "똘병이"};
        System.out.println(Arrays.toString(pets));

        // 배열 값 바꿀 때
        pets = new String[] {"숑뭉이", "쇼냥이", "냥덕이", "똘병이"};

        foo(new String[] {"하하", "호호"});

        /*
            # 배열의 기본 값
            자바의 배열은 생성되는 순간 해당 공간에 기본값들을 채워넣음
            정수형: 0
            실수형: 0.0
            논리형: false
            문자형: ''
            기타(String): null
        */

        byte [] bArr = new byte[3];
        System.out.println(Arrays.toString(bArr));

        double [] dArr = new double[3];
        System.out.println(Arrays.toString(dArr));

        boolean [] blArr = new boolean[3];
        System.out.println(Arrays.toString(blArr));

        char [] cArr = new char[3];
        System.out.println(Arrays.toString(cArr));

        String [] sArr = new String[3];
        System.out.println(Arrays.toString(sArr));

        // 자바 기본타입(정수(byte, short, long), 실수(float, double), 논리, 문자-char)
        // 나머지 참조타입(주소를 저장하는 변수 - 포인터)

    } // end main

    static void foo(String [] sArgs){

    }

}
