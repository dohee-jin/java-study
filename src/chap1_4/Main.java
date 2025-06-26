package chap1_4;

/*import chap1_4.cake.Apple;
import chap1_4.cake.Banana;
import chap1_4.cake.Grape;*/

// 임포트 많아지면 별
import chap1_4.cake.*;

public class Main {

    Apple cakeApple = new Apple();
    chap1_4.juice.Apple juiceeApple = new chap1_4.juice.Apple();

    // 다른 패키지에서 다른 패키지의 클래스를 사용할 때는 import 문이 필수
    Banana banana = new Banana();
    Grape grape = new Grape();
}
