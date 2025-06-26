package chap1_3;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {

        String str1 = "김철수";
        String str2 = "김철수";
        String str3 = new String("김철수");

        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);

        // '=='은 스택의 주소값을 비교
        // 기본 타입은 스택에 값이 저장되어 '=='으로 비교해야 되는 것이 맞음
        // 참조 타입은 스택에 주소값이 저장되긱 때문에 '==' 으로 비교하는 것이 어려움
        // 데이터를 바로 입력한 것을 리터럴이라고 함

        Scanner sc = new Scanner(System.in);
        String inputName = sc.nextLine(); // 스캐너로 새로운 스트링(new String()) 객체를 생성
        String myName = "홍길동";

        System.out.println("inputName = " + inputName);
        System.out.println("myName = " + myName);

        // string 은 equals로 비교
        System.out.println("같은가? " + inputName.equals(myName));


    }
}
