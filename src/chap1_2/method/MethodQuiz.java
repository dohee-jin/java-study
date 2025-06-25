package chap1_2.method;

import java.util.Arrays;

public class MethodQuiz {

    static String [] foods = {"떡볶이", "치킨", "파스타"};

    public static void main(String[] args) {

        printFoods();

        push("라면");
        push("김치찌개");
        printFoods();

        int index = indexOf("파스타");
        System.out.println("index = " + index);

        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);

        pop();
        remove("치킨");
        remove(0);
        printFoods();


        boolean flag1 = include("파스타");
        System.out.println("flag1 = " + flag1);

        boolean flag2 = include("떡라면");
        System.out.println("flag2 = " + flag2);

        insert(1, "파인애플");

        printFoods();

        modify(2, "닭갈비");
        printFoods();

    } // end main

    // print
    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    // 복사 배열 생성
    static String[] copy(int capacity) {
        String[] arr = new String[foods.length + capacity];

        // 루프 회전수
        // 사이즈를 늘릴 때는 원본만큼
        // 줄였을 때는 줄인 만큼 회전
        int loopCount = (capacity >= 0) ? foods.length : arr.length;
        for(int i = 0; i < loopCount; i++){
            arr[i] = foods[i];
        }

        return arr;
    }

    // push
    static void push(String food) {
        String[] temp = copy(1);
        /*String[] temp = new String[foods.length + 1];
        for(int i = 0; i < foods.length; i++){
            temp[i] = foods[i];
        }*/
        temp[foods.length] = food;

        foods = temp;
    }

    // push - v2
    /*static void push(String... items) {
        String[] temp = copy(items.length);
        *//*String[] temp = new String[foods.length + 1];
        for(int i = 0; i < foods.length; i++){
            temp[i] = foods[i];
        }*//*
        // 배열의 맨 끝에 아이템 추가
        for(int i = 0; i < items.length; i++){
            temp[temp.length - (items.length) - 1]
        }

        foods = temp;
    }*/

    // indexOf
    static int indexOf(String food) {
        for (int i = 0; i < foods.length; i++) {
            if(foods[i].equals(food)) {
                return i;
            }
        }
        return -1;
    }

    // pop
    static String pop() {
        if(foods.length == 0){
            System.out.println("제거할 대상이 없습니다");
            return null; // return; 은 void 에서만 쓸 수 있음
        }
        String[] temp = copy(-1);
        /*String[] temp = new String [foods.length - 1];
        for( int i = 0; i < temp.length; i ++){
            temp[i] = foods[i];
        }*/
        String deleted = foods[temp.length];
        foods = temp;
        return deleted;
    }

    // remove - string
    static void remove(String food) {
        int index = indexOf(food);
        String[] temp = new String[foods.length - 1];
        if(index != -1) {
            for(int i = index; i < foods.length - 1; i++) {
                foods[i] = foods[i + 1];
            }
        }
        for(int i = 0; i < temp.length; i++){
            temp[i] = foods[i];
        }
        foods = temp;
    }

    // remove - int, 메소드 오버로딩
    static void remove(int index) {
        String[] temp = new String[foods.length - 1];
        for(int i = index; i < foods.length - 1; i++) {
            foods[i] = foods[i + 1];
        }
        for(int i = 0; i < temp.length; i++){
            temp[i] = foods[i];
        }
        foods = temp;
    }

    // include
    static boolean include(String food) {
        /*boolean flag = false;
        for(int i = 0; i < foods.length - 1; i++) {
            if(foods[i].equals(food)) {
                flag = true;
            }
        }
        return flag;*/
        return indexOf(food) != -1;
    }

    // inset
    static void insert(int index, String food) {
        String[] temp = new String[foods.length + 1];
        for(int i = 0; i < foods.length; i++){
            temp[i] = foods[i];
        }
        for(int i = index; i < foods.length; i++){
            temp[i + 1] = temp[i];
        }
        temp[index] = food;
        foods = temp;
    }

    // modify
    static void modify(int index, String food) {
        if(index <= foods.length - 1) {
            foods[index] = food;
        }
        else{
            push(food);
        }
    }

}
