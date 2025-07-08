package chap2_7.lamda.fruite;

import chpa1_7.protected_.pac1.A;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 사과를 여러가지 방법으로 필터링하는 기능을 제공
public class FilterApple {
    /**
     * @solution - try 1: 사과바구니에서 녹색 사과들만 필터링해주세요
     * @param basket - 여러가지 색상의 사과들이 모여 있는 바구니
     * @return - basket 안에서 녹색 사과들만 새롭게 담아서 리턴
     * @problem - 만약에 다른 색깔의 사과를 필터링해야 한다면 이 메소드만으로는 불가능
     */

    public static List<Apple> filterGreenApples(List<Apple> basket) {
        // 1. 녹색 사과들을 모아둘 리스트 생성
        List<Apple> greenBasket = new ArrayList<>();

        // 2. 반복문과 조건물을 사용해서 녹색 사과 필터링
        for (Apple apple : basket) {
            if(apple.getColor() == Color.GREEN) {
                greenBasket.add(apple);
            }
        }
        return greenBasket;
    }

    /**
     * @solution - try 2: 색상을 파라미터화하여 원하는 컬러의 사과를 필터링
     * @param basket - 여러가지 색상의 사과들이 모여 있는 바구니
     * @param color - 필터링을 원하는 사과의 색상
     * @return - basket 안에서 원하는 사과들만 새롭게 담아서 리턴
     * @problem - 만약 필터링 기준이 색상이 아니라 무게라면?
     */

    public static List<Apple> filterApplesByColor(List<Apple> basket, Color color) {
        // 1.사과들을 모아둘 리스트 생성
        List<Apple> FilteredBasket = new ArrayList<>();

        // 2. 반복문과 조건물을 사용해서 녹색 사과 필터링
        for (Apple apple : basket) {
            if(apple.getColor() == color) {
                FilteredBasket.add(apple);
            }
        }

        return FilteredBasket;
    }

    /**
     * @solution - try 3: 기능을 파라미터화 할 수 없을까?
     *                    -> 안됨. 다만 객체안에 메소드를 바꿔서 사용하는 방법을 사용
     *                    -> 오버라이딩
     *                    -> 동작(기능)을 추상화시켜 파라미티화 한다.
     * @problem - 필터링 대상이 사과가 아니라면?
     */
    public static List<Apple> filterApples(List<Apple> basket, ApplePredicate predicate) {
        // 1.사과들을 모아둘 리스트 생성
        List<Apple> filteredBasket = new ArrayList<>();

        // 2. 반복문과 조건물을 사용해서 녹색 사과 필터링
        for (Apple apple : basket) {
            if(predicate.test(apple)) {
                filteredBasket.add(apple);
            }
        }

        return filteredBasket;
    }

    /**
     * @solution - try 4: 여러 객체들을 다양하게 필터링 할 수 있도록 제네릭을 적용
     *
     */
    public static <T> List<T> filter(List<T> list, GenericPredicate<T> predicate) {
        // 1.사과들을 모아둘 리스트 생성
        List<T> filteredList = new ArrayList<>();

        // 2. 반복문과 조건물을 사용해서 녹색 사과 필터링
        for (T t : list) {
            if(predicate.test(t)) {
                filteredList.add(t);
            }
        }

        return filteredList;
    }

    public static List<Integer> mapWeight(List<Apple> basket) {
        List<Integer> mappedApples = new ArrayList<>();
        for(Apple apple : basket) {
            mappedApples.add(apple.getWeight());
        }
        return mappedApples;
    }

    public static Set<Color> mapColor(List<Apple> basket) {
        Set<Color> mappedApples = new HashSet<>();
        for(Apple apple : basket) {
            mappedApples.add(apple.getColor());
        }
        return mappedApples;
    }
}
