package chap1_2.array;

import java.util.Arrays;

public class ArrayPush {

    static int[] numbers = {10, 20, 30, 40};

    public static void main(String[] args) {

        int newNumber = 50;

        // 1. 기존 배열 사이즈보다 한 칸 더 큰 배열 생성
        int[] tempArray = new int[numbers.length + 1];

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("temp = " + Arrays.toString(tempArray));

        // 2. 원본 배열의 값들을 새 배열로 복사
        for (int i = 0; i < numbers.length; i++) {
            tempArray[i] = numbers[i];
        }

        // 3. 마지막 인덱스에 새 값 저장
        tempArray[tempArray.length - 1] = newNumber;
        System.out.println("tempArray = " + Arrays.toString(tempArray));

        // 4. 주소값 이전
        numbers = tempArray;
        tempArray = null;

        push(numbers, 60);
        push(numbers, 70);
        push(numbers, 80);

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("temp = " + Arrays.toString(tempArray));

    }

    static void push(int[] arr, int newData) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = newData;

        numbers = arr;
    }
}
