package chap1_2.array;

import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11};

        int targetIndex = 2;

        /*
            사이즈를 1개 줄이기 전에 해야 할일
            [1, 3, 5, 7, 9, 11]
            [1, 5, 5, 7, 9, 11]
            [1, 5, 7, 7, 9, 11]
            [1, 5, 7, 9, 9, 11]
            [1, 5, 7, 9, 11, 11]
            [1, 5, 7, 9, 11]
            --> 마지막 데이터 11 pop
        */

        for(int i = targetIndex; i < numbers.length - 1; i++){
            numbers[i] = numbers[i + 1];
        }

        int[] temp = new int[numbers.length - 1];

        for(int i = 0; i < temp.length; i++){
            temp[i] = numbers[i];
        }

        numbers = temp;

        System.out.println(Arrays.toString(numbers));
    }
}
