package chap1_10.inter;

// 추상적
// interface = abstract class
public interface Pet {

    // 애완동물의 필수 기능
    // 노는 기능
    public abstract void handle();
    // 예방접종 기능
    public abstract boolean inject();

}
