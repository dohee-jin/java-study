package chap2_3.arraryList;

import chap1_3.arrayList.StringList;
import chap1_8.poly.drive.Car;
import chap1_8.poly.drive.Mustang;
import chap1_8.poly.drive.Sonata;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // 문자열 전용 배열
        MyArrayList<String> foods = new MyArrayList<>();
        foods.push("볶음밥");
        foods.push("족발");
        foods.push("피자");
        foods.push("햄버거");
        System.out.println("foods = " + foods);
        
        // foods 의 0번 인덱스 접근
        String firstFood = foods.get(0);
        System.out.println("firstFood = " + firstFood);

        boolean containsResult = foods.contains("족발");
        System.out.println("containsResult = " + containsResult);

        int indexOfResult = foods.indexOf("족발");
        System.out.println("indexOfResult = " + indexOfResult);

        int size = foods.size();
        System.out.println("size = " + size);
        
        String deleted = foods.remove(1);
        System.out.println("deleted = " + deleted);

        System.out.println("foods = " + foods);

        boolean containsResult2 = foods.contains("족발");
        System.out.println("containsResult = " + containsResult2);

        int indexOfResult2 = foods.indexOf("볶음밥");
        System.out.println("indexOfResult = " + indexOfResult2);

        foods.clear();
        System.out.println("foods = " + foods);
        

        // 정수 전용 배열
/*        MyArrayList<Integer> numbers = new MyArrayList<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        System.out.println("numbers = " + numbers);

        int index = numbers.indexOf(3);
        System.out.println("index = " + index);

        // 자동차 전용 배열
        MyArrayList<Car> cars = new MyArrayList<>();
        cars.push(new Sonata());
        cars.push(new Mustang());
        System.out.println("cars = " + cars);
        
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("수영");
        hobbies.add("축구");
        hobbies.add("파티");
        System.out.println("hobbies = " + hobbies);*/
        
    }
}
