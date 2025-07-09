package chap2_7.lamda.fruite;

@FunctionalInterface
public interface GenericFunction<X, Y> {
    // x 객체를 주면 그 안에서 Y 객체를 추출해서 리턴
    Y apply(X x);
}
