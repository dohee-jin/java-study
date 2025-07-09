package chap2_8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import static chap2_8.stream.Menu.*;


public class Mapping {
    public static void main(String[] args) {

        // 요리의 이름들만 추출
        List<String> dishNames = menuList.stream()
                .map(menu -> menu.getName())
                .collect(Collectors.toList());
        System.out.println("dishNames = " + dishNames);

        List<String> browsers = List.of("safari", "chorme", "ms edge", "opera", "firefox");
        
        // 브라우저 목록에서 브라우저의 각 글자수를 수집
        List<Integer> lengthList = browsers.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println("lengthList = " + lengthList);

        // 브라우저 목록에서 각 브라우저의 첫글자만 추출
        List<String> firstCharacterList = browsers.stream()
                .map(str -> String.valueOf(str.charAt(0)))
                .collect(Collectors.toList());

        System.out.println("firstCharacterList = " + firstCharacterList);

        System.out.println("=========================");

        // 요리 목록에서 요리 이름과 칼로리만 추출해서
        // 새 객체에 담아 포장하여 리스트에 담고 싶음
        List<Map<String, Object>> menuDetails = menuList.stream()
                .map(menu -> {
                    Map<String, Object> menuMap = new HashMap<>();
                    menuMap.put("menuName", menu.getName());
                    menuMap.put("calories", menu.getCalories());
                    return menuMap;
                })
                .collect(Collectors.toList());
        menuDetails.forEach(System.out::println);

        System.out.println("=========================");
        List<SimpleDish> simpleDishList = menuList.stream()
                .map(SimpleDish::new)
                .collect(Collectors.toList());

        simpleDishList.forEach(System.out::println);

        System.out.println("=========================");

        /*
            요리 목록에서 500 칼로리 이상의 메뉴들의 메뉴 이름만 추출
         */
        List<String> heavyMenuList = menuList.stream()
                .filter(menu -> menu.getCalories() >= 500)
                .map(menu -> menu.getName())
                .collect(Collectors.toList());

        System.out.println("heavyMenuList = " + heavyMenuList);

        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력해주세요.

            단, 타입은 MEAT의 경우 육류라고 저장
            FISH는 어류라고 저장, OTHER 기타라고 저장
         */
        menuList.stream()
                .filter(menu -> menu.getCalories() >= 500)
                .map(menu -> new HighCaloriesDish(menu))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // 요리의 총 칼로리 수 구하기
        int totalCalories = menuList.stream()
                .mapToInt(menu -> menu.getCalories())
                .sum();

        System.out.println("totalCalories = " + totalCalories);

        // 평균 칼로리
        double avgCalories = menuList.stream()
                .mapToInt(menu -> menu.getCalories())
                .average()
                .getAsDouble();
        System.out.println("avgCalories = " + avgCalories);
    }
}
