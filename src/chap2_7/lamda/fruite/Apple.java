package chap2_7.lamda.fruite;

import java.util.Objects;

public class Apple {

    private int weight;
    private Color color;

    public Apple(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Apple apple)) return false;
        return weight == apple.weight && color == apple.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, color);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }

    // 색상의 첫글자만 추출해서 반환하는 메소드
    public char getColorFirstCharacter() {
        return this.color.toString().charAt(0);
    }
}
