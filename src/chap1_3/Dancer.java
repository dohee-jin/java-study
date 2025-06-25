package chap1_3;

import java.util.Arrays;

// class: 객체를 찍어내는 틀(설계도)
// 설계도에는 main 메소드를 만들지 않는다.
public class Dancer {

    // 객체의 속성과 기능
    // 속성(필드): 객체를 명사적으로 표현하는 데이터
    String dancerName; // 댄서 이름, 변수X, 필드임
    String crewName;
    String[] genres;
    int danceLevel;

    // 기능(메소드): 객체를 동사적으로 표현하는 함수
    // 설계도에 있는 함수는 static을 붙이지 않음
    void dance() {
        System.out.printf("%s 댄서가 %s 춤을 춥니다. \n", genres[0]);
    }

    void introduce() {
        System.out.println("이름: " + dancerName);
        System.out.println("크루: " + crewName);
        System.out.println("장르: " + Arrays.toString(genres));
        System.out.println("레벨: " + danceLevel);
    }

    // 생성자: 객체가 생성될 때 자동 실행되는 특수 메소드
    // 하는일: 객체의 초기값을 세팅
    // 생성자는 클래스 이름과 동일하게 작성
    // 무조건 주소값을 자동 리턴함. 그래서 안써도 됨
    Dancer(){
        System.out.println("댄서의 1번 생성자 호출");
        dancerName = "무명의댄서";
        crewName = "잡크루";
        genres = new String[] {};
        danceLevel = 1;
    }

    /*public static void main(String[] args){
        Dancer dancer = new Dancer();

    }*/
}

