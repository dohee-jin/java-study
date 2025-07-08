package chap2_7.lamda.fruite;

import chpa1_7.protected_.pac1.A;

import java.util.List;
import java.util.Set;

import static chap2_7.lamda.fruite.Color.*;
import static chap2_7.lamda.fruite.FilterApple.*;

public class Main {
    public static void main(String[] args) {
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, RED)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
                , new Apple(85, YELLOW)
                , new Apple(75, YELLOW)
        );

        List<Apple> greenApples = filterGreenApples(appleBasket);
        System.out.println("greenApples = " + greenApples);

        System.out.println("==========================");
        List<Apple> redApples = filterApplesByColor(appleBasket, RED);
        System.out.println("redApples = " + redApples);

        System.out.println("==========================");
        List<Apple> yellowApples = filterApplesByColor(appleBasket, YELLOW);
        System.out.println("yellowApples = " + yellowApples);

        System.out.println("==========================");

        // 무게가 100 이상인 사과만 필터링
        List<Apple> weightGoe100 = filterApples(appleBasket, new AppleWeightPredicate());
        System.out.println("weightGoe100 = " + weightGoe100);

        System.out.println("==========================");

        // 무게가 홀수인 사과만 필터링
        List<Apple> oodWeightApples = filterApples(appleBasket, apple -> apple.getWeight() % 2 == 1);
        System.out.println("oodWeightApples = " + oodWeightApples);

        System.out.println("==========================");
        // 색상이 빨강 또는 초록 사과만 필터링
        List<Apple> redOrGreenApples = filterApples(appleBasket, apple -> apple.getColor() == GREEN || apple.getColor() == RED);
        System.out.println("redOrGreenApples = " + redOrGreenApples);

        System.out.println("==========================");
        // 무게가 100이상이면서 빨강사과만 필터링
        List<Apple> redWight100Apples = filterApples(appleBasket, apple -> apple.getWeight() >= 100 && apple.getColor() == RED);
        System.out.println("redWight100Apples = " + redWight100Apples);

        System.out.println("==========================");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = filter(numbers, n -> n % 2 == 0);
        System.out.println(evenNumbers);

        System.out.println("==========================");
        List<Apple> yellowApple = filterApples(yellowApples, apple -> apple.getColor() == YELLOW);
        System.out.println("yellowApple = " + yellowApple);

        System.out.println("==========================");
        //
        List<Integer> applesWeight = mapWeight(appleBasket);
        System.out.println("applesWeight = " + applesWeight);

        Set<Color> applesColor = mapColor(appleBasket);
        System.out.println("applesColor = " + applesColor);


    }
}
