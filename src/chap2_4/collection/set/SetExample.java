package chap2_4.collection.set;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
         /*
        Set(집합)
        1. 중복 허용하지 않음
        2. 순서을 보장하지 않는다. 해시
    * */

        Set<String> set = new HashSet<>();

        set.add("김밥");
        set.add("치킨");
        set.add("떡볶이");

        // 요소 삭제: set은 순서가 없기 때문에 인덱스도 없음
        set.remove("치킨");
        
        for(String s : set) {
            System.out.println("s = " + s);
        }
        
        // 실무에서 set의 용도는 리스트 같은 자료구조의 중복제거 용도
        List<Integer> numbers = List.of(3, 3, 1, 2, 3, 4, 5, 5, 1, 7, 8, 9);
        System.out.println(numbers);
        
        // set 으로 변환
        Set<Integer> numSet = new HashSet<>(numbers);
        System.out.println("numSet = " + numSet);

        // list 로 다시 변환
        numbers = new ArrayList<>(numSet);
        System.out.println("numbers = " + numbers);

        // equals 와 hashcode 를 오버라이딩 하는 이유
        System.out.println("=======================");
        Person p1 = new Person("박영희", "790717");
        Person p2 = new Person("김철수", "890216");
        Person p3 = new Person("김철수", "890216");

        Set<Person> personSet = new HashSet<>();
        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);

        System.out.println(personSet);
        System.out.println("p2 == p3 ?" + p2.equals(p3));
    }


}

class Person {
    String name;
    String ssn;

    public Person(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Person person)) return false;
        return Objects.equals(name, person.name) && Objects.equals(ssn, person.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ssn);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
