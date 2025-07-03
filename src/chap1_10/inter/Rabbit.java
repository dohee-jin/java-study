package chap1_10.inter;

// interface를 상속 받으려면 implements 를 작성
public class Rabbit implements Pet, Wild {

    @Override
    public void handle() {

    }

    @Override
    public boolean inject() {
        return false;
    }

    @Override
    public void violent() {

    }
}
