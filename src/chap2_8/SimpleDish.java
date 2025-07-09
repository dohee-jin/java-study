package chap2_8;

import chap2_8.stream.Dish;

import java.util.Objects;

public class SimpleDish {

    private String menuName;
    private int calories;

    public SimpleDish(Dish menu) {
        this.menuName = menu.getName();
        this.calories = menu.getCalories();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof SimpleDish that)) return false;
        return calories == that.calories && Objects.equals(menuName, that.menuName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuName, calories);
    }

    @Override
    public String toString() {
        return "SimpleDish{" +
                "menuName:'" + menuName + '\'' +
                ", calories:" + calories +
                '}';
    }
}
