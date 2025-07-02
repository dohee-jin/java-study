package chap1_8.casting;

public class Main {

    public static void main(String[] args) {
        Child child = new Child();

        child.parentMethod();
        child.childMethod();

        Parent parent = new Parent();
        // parent.p1 = 99;

        parent.parentMethod();

        // 타입을 상속 받은 부모 타입을 사용하면서 업캐스팅 됨
        /*
            타입을 업캐스팅하는 것은 자식타입의 객체를 부모타입으로
            사용하는 것을 말하며 이것은 자동으로 처리된다.

            그러나 업캐스팅이 되면 자식의 원래의 속성과 기능을
            사용할 수 없는 문제가 생김.

            따라서 자식이 원래 기능을 사용하려면 수동으로 다운캐스팅해야 함.
            (타입)
         */
        Parent castingChild = new Child();
        ((Child) castingChild).parentMethod();
        
        // child 클래스의 메소드에 접근 불가능
        // castingChild.childMethod();
        
        castingChild.p1 = 100;
        ((Child) castingChild).c1 = 300;
        
        // 연산자 우선순위
        /*
            1. ( )
            2. . // 참조
            3. 단항 > 2항 > 3항 > 대입
        */
        
        // 1 ~ 45 사이의 랜덤 정수
        // 실행순서
        // 1. Math.random() -> . , 0.0 <= n < 1.0 사이의 랜덤값 생성
        // 2. (int) -> 단항연산, 타입캐스팅 실행 소수점 아래 버려짐
        // 3. * -> 이항연산, 0 * 45 = 0
        // 4. + -> 이항연산, 0 + 1 = 1
        // 5. = -> 대입연산, random은 1을 가지게 됨
        int random = (int) Math.random() * 45 + 1;
        int random2 = (int) (Math.random() * 45) + 1;
        System.out.println("random = " + random);
    }
}
