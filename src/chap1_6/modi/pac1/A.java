package chap1_6.modi.pac1;


public class A{

    // 접근제어: 필드, 생성자, 메서드, 클래스에서만 붙일 수 있음
    public int f1;
    /*(default)*/ int f2;
    private int f3;

    // 메소드
    public void m1() {
        int x = 1;
    }
    /*(default)*/ void m2() {}
    private void m3() {}

    // 생성자
    public A() {}
    A(int a) {}
    private A(double b) {}

    new B();
}


// 같은 클래스 안에서는 제한자 의미가 없음
// 다 가져다가 쓸 수 있음