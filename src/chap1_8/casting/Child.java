package chap1_8.casting;

public class Child extends Parent {

    int c1;

    @Override
    void parentMethod() {
        System.out.println("Overriding 한 child의 메소드 1");
    }

    void childMethod(){
        System.out.println("child가 만든 메소드 2");
    }


}
