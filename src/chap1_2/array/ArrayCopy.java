package chap1_2.array;

import java.util.Arrays;

// 배열 복사 알고리즘
public class ArrayCopy {

    public static void main(String[] args) {
        String [] pets = {"쇼냥이, 숑뭉이, 삔냥이"};
        // String [] petsCopy = pets; // 주소 복사
        //String [] petsCopy = new String[pets.length]; // 배열 객체 복사

        // 배열 값 복사
        /*for(int i  = 0; i < pets.length; i++) {
            petsCopy[i] = pets[i];
        }*/

        String[] petsCopy =  Arrays.copyOf(pets, pets.length);

        System.out.println("원본주소 : " + pets);
        System.out.println("원본 " + Arrays.toString(pets));
        System.out.println("사본주소 : " + petsCopy);
        System.out.println("사본 " + Arrays.toString(petsCopy));
    }
}
