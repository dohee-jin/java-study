package chpa1_7.inherit.payer.overloadding;

public class Example {
    /*
        # 메소드 오버로딩
        : 하나의 클래스 안에서 이름이 같은 메소드를 여러 개 만드는 것
        - 규칙
        1. 파라미터의 타입이 다를 것!
        2. 파라미터의 순서가 다를 것!
        3. 파라미터의 개수가 다를 것!
        4. 리턴타입이나 접근제어자는 달라도 오버로딩 될 수 없음
    */

    void add() {
        System.out.println();
    }
    void add(int x) {}
    void add(double x) {}
    void add(int x, int y) {}
    void add(int x, double y) {}
    void add(double x, int y) {}
    void add(int x, int y, int z) {}

    // 리턴타입 다른 건 안됨.
    /*double add(double x, int y) {
        return x + y;
    }*/

    // ex
    // 사각형의 넓이를 구하는 메소드
    int calcRectArea(int width, int height) {
        return width * height;
    }

    int calcRectArea(int height) {
        return height * height;
    }

    public static void main(String[] args) {
        Example ex = new Example();
        int result1 = ex.calcRectArea(100, 20);
        System.out.println(result1);


        int result2 = ex.calcRectArea(20);
        System.out.println(result2);

    }
}
