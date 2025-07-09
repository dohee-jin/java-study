package chap2_8;

import chap2_8.stream.Dish;
import chap2_8.stream.DishType;
import chap2_8.stream.Menu;

import java.util.List;
import java.util.stream.Collectors;

import static chap2_8.stream.Menu.*;

public class Finding {
    public static void main(String[] args) {
        // 요리 목록에서 채식주의자가 먹을 수 있는 요리가 하나라도 있는가?
        boolean flag = menuList.stream()
                .filter(menu -> menu.getType() == DishType.MEAT)
                .anyMatch(menu -> menu.isVegetarian());
        System.out.println("flag = " + flag);

        // every
        // 요리 목록에서 모든 요리가 1000칼로리 미만입니까?
        boolean flag2 = menuList.stream()
                .allMatch(menu -> menu.getCalories() < 1000);
        System.out.println("flag2 = " + flag2);

        // 요리 중에 첫번쨰 발견된 생선요리를 찾기
        // 어거지로 하는 법
        List<Dish> fishDishList = menuList.stream()
                .filter(menu -> menu.getType() == DishType.FISH)
                .collect(Collectors.toList());

        System.out.println(fishDishList.get(0));

        //
        menuList.stream()
                .filter(menu -> menu.getType() == DishType.FISH)
                .findFirst()
                .get();
    }
}
