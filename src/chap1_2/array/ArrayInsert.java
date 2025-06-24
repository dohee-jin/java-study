package chap1_2.array;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {
        int[] numbers = {10, 50, 90, 100, 150};

        int targetIndex = 2;
        int newNumber = 70;

        /*
            먼저 사이즈가 1개 큰 새 배열부터 생성
            [10, 50, 90, 100, 150, 0]
            // 끝 부터 밀기
            [10, 50, 90, 100, 150, 150]
            [10, 50, 90, 100, 100, 150]
            [10, 50, 90, 90, 100, 150]
            [10, 50, 70, 90, 150, 150]
        */

        // 1. 사이즈가 1칸 큰 배열 생성
        int[] temp = new int[numbers.length + 1];
        System.out.println(Arrays.toString(temp));

        // 2. 기존 데이터 새 배열로 복사
        for(int i = 0; i < numbers.length; i++){
            temp[i] = numbers[i];
        }

        System.out.println(Arrays.toString(temp));

        for(int i = numbers.length; i > targetIndex; i--){
            temp[i] = temp[i - 1];
        }

        temp[targetIndex] = newNumber;
        numbers = temp;

        System.out.println(Arrays.toString(numbers));
    }
}
