package chap2_7.lamda.fruite;

import java.util.*;

public class MappingApple {

    /*
        origin: [{}, {}, {}, {}]
        filter: [{}, {}, {}]
        map: ['', '', '', '',]

        map은 타입이 변경되어 나갈 수 있음
     */

    // 사과목록에서 사과의 색상들만 추출
    public static List<Color> mappingAppleByColor(List<Apple> appleBasket) {
        List<Color> colorList = new ArrayList<>();
        for(Apple apple : appleBasket) {
            Color color = apple.getColor();
            colorList.add(color);
        }

        return  colorList;
    }

    // 사과의 특정 데이터만 추출
    public static<T> List<T> mappingApples(List<Apple> appleBasket, AppleFunction<T> func) {
        List<T> mappedList = new ArrayList<>();
        for(Apple apple : appleBasket) {
            T mappedData = func.apply(apple);
            mappedList.add(mappedData);
        }

        return mappedList;
    }

    //
    public static List<Object> mappingApplesByObject(List<Apple> appleBasket) {
        List<Object> appleObject = new ArrayList<>();
        for(Apple apple : appleBasket) {
            Map<String, Object> mapApple = new HashMap<>();
            mapApple = Map.of(
                    "first", apple.getColor().toString().charAt(0),
                "weight", (double) apple.getWeight() / 1000.0
            );
            appleObject.add(mapApple);
        }
        return appleObject;
    }

    // 특정객체의 목록에서 특정 객체의 특정 데이터만 추출
    public static<T, X> List<T> map(List<X> list, GenericFunction<X, T> func) {
        List<T> mappedList = new ArrayList<>();
        for(X x : list) {
            T mappedData = func.apply(x);
            mappedList.add(mappedData);
        }

        return mappedList;
    }
}
