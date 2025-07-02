package chap1_9.static_;

import chap1_9.static_.util.InputUtils;

import static chap1_9.static_.Count.m1;
import static chap1_9.static_.util.InputUtils.*;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Count c1 = new Count();
        c1.x++;
        c1.y++;

        Count c2 = new Count();
        c2.x++;
        c2.y++;

        c2.x = 999;
        c2.y = 100;

        out.printf("c1.x: %d, c1.y: %d\n", c1.x, c1.y);
        out.printf("c2.x: %d, c2.y: %d\n", c2.x, c2.y);

        // 원주율
        out.println(Math.PI);

        //
        m1();

        c1.m2();
        c2.m2();

        prompt("입력하셈: >> ");


        // static은 alt+enter 사용해서 클래스 이름 생략 가능
        // 인텔리제이가 사용할 수 있게 끔 import 해줌
        // 하면 코드가 깔끔하게 정리됨
    }
}
