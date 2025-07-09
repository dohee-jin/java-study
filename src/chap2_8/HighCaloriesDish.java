package chap2_8;

import chap2_8.stream.Dish;
import chap2_8.stream.DishType;

import java.util.Objects;

public class HighCaloriesDish {

    private String menuName;
    private String type;

    public HighCaloriesDish(Dish menu) {
        this.menuName = menu.getName();
        this.type = menu.getType().getTypeName();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }


    @Override
    public boolean equals(Object object) {
        if (!(object instanceof HighCaloriesDish that)) return false;
        return Objects.equals(menuName, that.menuName) && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuName, type);
    }

    @Override
    public String toString() {
        return "HighCaloriesDish{" +
                "menuName:'" + menuName + '\'' +
                ", type:" + type +
                '}';
    }
}
