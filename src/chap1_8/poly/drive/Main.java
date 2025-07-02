package chap1_8.poly.drive;

public class Main {
    public static void main(String[] args) {
        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla();
        Tesla t3 = new Tesla();

        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();
        Sonata s3 = new Sonata();

        Mustang m1 = new Mustang();
        Mustang m2 = new Mustang();
        Mustang m3 = new Mustang();

        Car[] cars = {t1, t2, t3, s1, s2, s3, m1, m2, m3};

        for(Car car : cars) {
           car.accelerate();
        }

        // 이종모음은 원칙적으로 불가하지만 다형성을 이용하여 이종모음을 구현할 수 있다.
        Object[] arr = {1, "adfd", false, new Sonata()};

        Driver heartping = new Driver("하츄핑");
        heartping.drive(m1);

        System.out.println("===============");

        Car car2 = new CarShop().exportCar(3000);
        car2.accelerate();

    }
}
