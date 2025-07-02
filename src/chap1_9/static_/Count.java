package chap1_9.static_;

import chpa1_7.protected_.pac2.C;

public class Count {
    /*
        접근 제한자 (access modifier) - 클래스, 필드, 메소드, 생성자
        사용 제한자 (usage modifier)
         - static: 필드, 메소드, 내부클래스 (일반 클래스 x)
         - final: 클래스, 필드, 메소드
         - abstract - 클래스, 메소드
    */

    // static - 정적, 공유됨, 객체가 필요없음
    public static int x; // static이 붙으면 정적 필드라고 함 - 공유 필드
    public int y; // 인스턴스 필드 - 객체에 묶인 필드
    // 클래스 끼리 공유해야 할 데이터가 존재할 시 static으로 선언


    // 정적 메소드: 모든 객체가 공유하는 기능, 객체 생성 없이 호출
    static void m1() {
        System.out.println("static method call");

        // static 메소드 내부에서는 this를 알 수 없음
        // System.out.println(this);
        // 인스턴스 필드에 접근 불가능
        // this.y = 100;

        // 스태틱 메소드에서 객체 생성 후 접근 가능
        Count c = new Count();
        c.y = 100;
        // 매개변수로 객체를 받아서 접근
        // m1 (Count c)


        // 스태틱 필드에만 접근 가능
        x = 100;
    }

    // 인스턴스 메소드: 객체별로 따로따로 행동하는 기능, 호출시 객체 생성이 필수
    void m2() {
        System.out.println("instance method call");

        // 인스턴스 메소드는 정적 메소드 호출 가능
        // 정적 메소드는 데이터에 하나 밖에 없어서 접근

    }
}
