package chap2_4.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        /*
            list
            1. 순서가 있는 데이터구조
            2. 중복데이터 저장을 허용

            종류: 배열리스트(불변, 읽기전용),
                  연결리스트(포인터로 다음 자료의 주소를 저장,
                  탐색속도 느림, 중간 삭제, 삽입 쉬워짐)
        * */

        List<String> hobbies = new ArrayList<>();

        hobbies.add("수영");
        hobbies.add("책");
        hobbies.add("잠");
        hobbies.addAll(List.of("밥먹기", "먹기"));

        System.out.println(hobbies);

        // 중간 삽입
        hobbies.add(1, "코딩");
        System.out.println(hobbies);

        // 데이터 개수 확인
        int size = hobbies.size();
        System.out.println("size = " + size);

        // 인덱스 찾기
        int index1 = hobbies.indexOf("책");
        System.out.println("index = " + index1);

        int index2 = hobbies.indexOf("뮤지컬");
        System.out.println("index2 = " + index2);

        // 요소 포함 여부
        boolean flag = hobbies.contains("코딩");
        System.out.println("flag = " + flag);

        // 요소 삭제
        hobbies.remove("수영");
        hobbies.remove(2);

        System.out.println(hobbies);

        // 요소 수정
        hobbies.set(0, "디자인");
        System.out.println(hobbies);

        // 요소 참조
        String hobby = hobbies.get(1);
        System.out.println("hobby = " + hobby);

        // 리스트 순 회(반복문 처리)
        // 리스트 직접 접근X private 으로 되어 있음
        for(int i = 0; i < hobbies.size(); i++){
            System.out.println(hobbies.get(i));
        }

        // for-each 문
        for (String h : hobbies) {
            System.out.println(h);
        }

        hobbies.forEach((String hob) -> System.out.println(hob));

        // 전체 삭제
        hobbies.clear();
        System.out.println(hobbies);
        System.out.println(hobbies.isEmpty());

        // 리스트에 초기값 넣고 시작하기
        // List.of(~~) 불변한 리스트로 생성
        // List<Integer> numbers = List.of(1, 3, 5, 7, 9);

        // new ArrayList<>(List.of~~) 는 가변 리스트
        List<Integer> numbers = new ArrayList<>(List.of(1, 3, 5, 7, 9));

        numbers.add(11);
        System.out.println("numbers = " + numbers);

    }
}
