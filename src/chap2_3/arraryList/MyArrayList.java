package chap2_3.arraryList;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> {

    // 상수
    private static final int DEFAULT_CAPACITY = 10;

    // 필드
    private Object[] values;
    private int size;

    // 생성자
    public MyArrayList() {
        this.values = new Object[DEFAULT_CAPACITY];
    }

    // 메소드
    public void push(T element) {
       /* Object[] temp = new Object[size + 1];

        for(int i = 0; i < values.length; i++) {
            temp[i] = values[i];
        }
        temp[temp.length - 1] = element;
        values = temp;*/
        // 배열이 꽉찼는지 확인하고, 꽉찼으면 사이즈를 늘림
        if(size == values.length) {
            ensureCapacity();
        }
        values[size++] = element;
    }

    // 배열의 크기를 늘리는 내부 메소드
    private void ensureCapacity() {
        int newCapacity = values.length * 2;
        Object[] temp = new Object[newCapacity];
        System.arraycopy(values, 0, temp, 0, size);
    }

    // 배열에 저장된 데이터 개수 알려주기
    public int size() {
        return size;
    }

    // 배열의 특정 인덱스 데이터 참조
    public T get(int index) {
        // 인덱스 범위를 확인
        if(index >= size || index < 0) {
            System.out.println("오류: " + index + "는 잘못된 인덱스입니다.");
            throw new ArrayIndexOutOfBoundsException("오류: " + index + "는 잘못된 인덱스입니다.");
        }
        return (T) values[index];
    }

    // 특정 인덱스의 요소 삭제하기
    public T remove(int index) {
        if(index >= size || index < 0) {
            System.out.println("오류: " + index + "는 잘못된 인덱스입니다.");
            throw new ArrayIndexOutOfBoundsException("오류: " + index + "는 잘못된 인덱스입니다.");
        }

        // T deletedData = (T) values[index];
        T deletedData = get(index);

        for(int i = index; i < size - 1; i++){
            values[i] = values[i + 1];
        }
        size--;

        // 메모리 관리 팁: 실제로 가려진 데이터를 지워줌
        // 가비지 컬렉터: 힙 메모리 정리
        values[size] = null;


        return deletedData;
    }

    // 특정 요소 확인하고 위치 찾기
    // 특정 요소가 있으면 true, 없으면 false
    public boolean contains(T element){
        return indexOf(element) != -1;
    }

    // 특정 요소가 처음으로 나타나는 인덱스 반환
    public int indexOf(T element){
        for(int i = 0; i < size; i++) {
            if(element.equals(values[i])) return i;
        }
        return -1;
    }


    // 리스트의 모든 요소 한번에 비우기
    /*public void clear() {
        for(int i = 0; i < size; i++){
            values[i] = null;
        }
        size = 0;
    }*/

    public void clear() {
        /*
            논리적으로 전체삭제는 구현이 되었으나 실제 배열 내부에는
            아직 데이터가 남아있는 상태
            size = 0;
        * */
        for(int i = 0; i < size; i++){
            values[i] = null;
        }
        size = 0;
        /*
            현재 실제 데이터가 10000개
            10240개 -> 10개로 회귀? ㄴㄴ
            실제 구현에서는 그냥 놔둠.
            이유: clear 이후에 다시 그만큼의 데이터를 채우는게 일반적
            this.values = new Object[DEFAULT_CAPACITY];
        * */
    }



    @Override
    public String toString() {
        String formatted = "[";
        for(int i = 0; i < size; i++) {
            if(i == size - 1){
                formatted += (values[i] + "");
            } else {
                formatted += (values[i] + ", ");
            }
        }
        formatted += "]";

        return formatted;
    }



}
