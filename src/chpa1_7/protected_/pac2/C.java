package chpa1_7.protected_.pac2;

import chpa1_7.protected_.pac1.A;

public class C {
    void test() {
        A a = new A();  // public이라 접근가능
       /* a.f1 = 10;
        a.f2 = 20;

        a.m1();
        a.m2();

        new A(12345);
        new A("asaaa");*/

        // default와 protected는 외부 패키지에서 접근 불가

    }
}
