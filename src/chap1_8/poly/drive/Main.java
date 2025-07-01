package chap1_8.poly.drive;

public class Main {
    public static void main(String[] args) {
        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla();
        Tesla t3 = new Tesla();

        Car s1 = new Sonata();
        Car s2 = new Sonata();
        Car s3 = new Sonata();

        Car m1 = new Mustang();
        Car m2 = new Mustang();
        Car m3 = new Mustang();

        Car[] cars = {t1, t2, t3, s1, s2, s3, m1, m2, m3};

        for(Car car : cars) {
           car.accelerate();
        }

        // 이종모음은 원칙적으로 불가하지만 다형성을 이용하여 이종모음을 구현할 수 있다.
        Object[] arr = {1, "adfd", false, new Sonata()};

    }
}
