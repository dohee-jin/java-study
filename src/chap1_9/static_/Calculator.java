package chap1_9.static_;

public class Calculator {

    String color;
    static double pi;

    // 계산기의 색깔읠 변경하는 메소드
    void customizeColor(String newColor) {
        this.color = color;
    }

    // 반지름을 알려주면 원의 넓이를 구해주는 메소드
    // this 필요없으면 static
    double calcCircleArea(double r) {
        return pi * r * r;
    }
}
