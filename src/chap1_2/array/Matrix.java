package chap1_2.array;

import java.util.Arrays;

// 2차원 배열
public class Matrix {

    public static void main(String[] args) {
        /*
            [
                [1, 2, 3]
                [4, 5, 6]
                [7, 8, 9]
            ]
        */

        int[][] matrix = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.println("2차원 배열의 값" + Arrays.toString(matrix));
        System.out.println("0번 인덱스의 주소" + matrix[0]);
        System.out.println("1번 인덱스의 주소" + matrix[1]);
        System.out.println("2번 인덱스의 주소" + matrix[2]);


        // deepToSting(); 2차원 배열의 값들을 볼 수있음
        System.out.println(Arrays.deepToString(matrix));

        for (int[] arr : matrix) {
            System.out.print("[ ");
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println("]");
        }

        for(int i = 0; i < matrix.length; i++) {
            int[] arr = matrix[i];
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
        }

        // 빈 2차원 배열
        // 3행 4열
        int[][] arr2d = new int[3][4];
        for(int[] ints : arr2d) {
            for(int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }


    }
}
