package chap1_9.final_;

public class Student {

    public String name; // 학생명
    public final String ssn; // 주민번호
    // 파이널 필드의 경우 값을 지정해줘야 함. 이게 최종 값이다라는 걸 알려줘야됨
    // 파이널 필드의 초기화는 생성자를 통해 할 수 있도록 우회

    // 자바의 상수 (불변성: final, 유일성: static 을 모두 만족해야 함)
    public static final String NATION = "대한민국";



    public Student(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
