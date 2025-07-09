package chap2_7.lamda.fruite;

import chpa1_7.protected_.pac1.A;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import static chap2_7.lamda.fruite.Color.*;
import static chap2_7.lamda.fruite.FilterApple.*;
import static chap2_7.lamda.fruite.MappingApple.*;

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

        System.out.println("==========================");
        List<Color> appleColorList = mappingAppleByColor(appleBasket);
        System.out.println("appleColorList = " + appleColorList);

        // 각 사과 별로 xx색 사과는 xxg입니다. 라는 문자열 목록을 리턴
        System.out.println("==========================");
        List<String> appleByColorWeight = mappingApples(appleBasket,
            apple -> String.format("%s 색 사과는 %dg 입니다.", apple.getColor(), apple.getWeight())
        );
        System.out.println(appleByColorWeight);

        /*
            사과목록에서 아래와 같은 데이터 형식의 목록을 리턴
            [
                {
                    first: 'G',
                    weight: 0.08
                },
                ...
            ]
         */
        System.out.println("==========================");
        List<Object> appleObject = mappingApplesByObject(appleBasket);
        System.out.println(appleObject);

        System.out.println("==========================");
        List<Map<String, Object>> mapList = mappingApples(appleBasket, new AppleFunction<Map<String, Object>>() {
            @Override
            public Map<String, Object> apply(Apple apple) {
                return Map.of(
                        "first", apple.getColorFirstCharacter(),
                        "weight", (double) apple.getWeight() / 1000.0
                );
            }
        });
        System.out.println("mapList = " + mapList);

        System.out.println("==========================");
        List<FormatApple> formatApples = mappingApples(appleBasket, new AppleFunction<FormatApple>() {
            @Override
            public FormatApple apply(Apple apple) {
                return new FormatApple(
                        apple.getColor().toString().charAt(0),
                        apple.getWeight() / 1000.0
                );
            }
        });
        System.out.println(formatApples);

        System.out.println("==========================");
        List<Integer> integerList = map(numbers, n -> n + 100);
        System.out.println("integerList = " + integerList);

        System.out.println("==========================");
        List<String> foodMapList = map(
                List.of("닭강정", "통닭", "닭백숙", "오리백숙", "김치찌개"), str -> str + "맛있어!"
        );
        System.out.println("foodMapList = " + foodMapList);
    }

    private static class FormatApple {
        private char first;
        private double weight;

        public FormatApple(char first, double weight) {
            this.first = first;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "FormatApple{" +
                    "first=" + first +
                    ", weight=" + weight +
                    '}';
        }


        public char getFirst() {
            return first;
        }

        public void setFirst(char first) {
            this.first = first;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        @Override
        public boolean equals(Object object) {
            if (!(object instanceof FormatApple that)) return false;
            return first == that.first && Double.compare(weight, that.weight) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, weight);
        }
    }
}
