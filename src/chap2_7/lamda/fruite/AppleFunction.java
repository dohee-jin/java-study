package chap2_7.lamda.fruite;

@FunctionalInterface
public interface AppleFunction<Y> {
    Y apply(Apple apple);
}
