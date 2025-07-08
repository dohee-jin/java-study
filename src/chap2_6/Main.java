package chap2_6;

import chap2_6.inner.AddCalculator;
import chap2_6.inner.Calculator;
import chap2_6.inner.Restaurant;

public class Main {

    // 내부 클래스 (inner class)
    /*
        나는 연산을 위한 추가 구현체가 필요한데
        아무래도 그 설계도는 여기 안에서만 쓰고
        다른 곳에서는 안쓸 것 같다.
     */
    // 재활용 X, Main 안쪽의 숨겨진 클래스
    private static class SubCalculator implements Calculator {

        @Override
        public int operator(int n1, int n2) {
            return n1 - n2;
        }
    }

    // 내부 클래스
    private static class FrenchRestaurant implements Restaurant {

        @Override
        public void cook() {

        }

        @Override
        public void reserve() {

        }
    }



    public static void main(String[] args) {
        Calculator addCalculator = new AddCalculator();
        int result1 = addCalculator.operator(30, 30);
        System.out.println("result1 = " + result1);

        Calculator subCalculator = new SubCalculator();
        int result2 = subCalculator.operator(100, 30);
        System.out.println("result2 = " + result2);

        /*
            익명 클래스 (anonymous class)
            나는 곱셈 계산기가 필요한데, 여기서만 쓰고 다른 곳에서는 안 쓸 것 같음.
            근데 객체를 한번 생성하고 난 이후에는 설계도를 폐기하고 싶음
         */
        /*Calculator multiCalculator = new MutiCalculator() {
            // 클래스 내부
            @Override
            public int operator(int n1, int n2) {
                return n1 * n2;
            }
        };

        int result3 = multiCalculator.operator((10, 20));
        System.out.println(result3);*/

        // 지금 급하게 레스토랑 예약을 해야 됨. 요리도 빨리 해야 됨
        // 근데 실제로 레스토랑이 안지어져 있음. 심지어 설계도도 없음
        // 익명 클래스는 이름을 모르니까 부모이름 그대로 사용 후 오버라이딩
        Restaurant restaurant = new Restaurant() {

            @Override
            public void cook() {
                System.out.println("우간다 요리를 합니다.");
            }

            @Override
            public void reserve() {
                System.out.println("웰컴 투 우간다식당 우가우가");
            }
        };

        restaurant.cook();
        restaurant.reserve();
    }
}
