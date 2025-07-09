package chap2_8.stream;

import java.util.List;
import java.util.stream.Collectors;

import static chap2_8.stream.Menu.menuList;

public class Filtering {
    public static void main(String[] args) {
        // 요리 메뉴 중 채식주의자가 먹을 수 있는 요리만 필터링
        /*List<Dish> vegetarianList = new ArrayList<>();
        for (Dish dish : menuList) {
            if(dish.isVegetarian()) {
                vegetarianList.add(dish);
            }
        }*/
        // --> 모던 코드로 변경
        List<Dish> vegetarianList = menuList.stream() // stream = 1. 데이터 소스 생성
                .filter(Dish::isVegetarian) // filter = 2. 중간연산
                .collect(Collectors.toList()); // 3. 최종연산

        vegetarianList.forEach(System.out::println);

        // 메뉴중에 요리이름이 4글자인것만 필터링
        menuList.stream()
                .filter(menu -> menu.getName().length() == 4 )
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // 300 칼로리보다 큰 요리 중 처음 2개는 건너뛰고 필터링
        menuList.stream()
                .filter(m -> m.getCalories() > 300)
                .collect(Collectors.toList())
                .stream().skip(2)
                .forEach(System.out::println);

        //
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 66, 7, 9, 10, 20, 22, 21);

        // 숫자리스트에서 짝수만 필터링
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .distinct() // 중복제거
                .collect(Collectors.toList());

        System.out.println("evenNumbers = " + evenNumbers);

    }
}
