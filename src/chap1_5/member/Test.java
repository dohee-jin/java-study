package chap1_5.member;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Member m1 = new Member("abcd123@gmail.com", "1234", "말포이", Member.Gender.MALE, 30 );
        System.out.println(m1);

        // 클래스 안에 있는 데이터는 반드시 객체생성을 통해 접근함
        MemberRepository mr = new MemberRepository();

        mr.addMember(new Member("oldman@gmail.com", "123424", "할아버지", Member.Gender.MALE, 80));


        System.out.println(Arrays.toString(mr.getMembers()));
        // System.out.println(mr.memberList.length);
        System.out.println(mr.size());

        Member foundeMember = mr.findMemberByEmail("oldmanss@gmail.com");
        System.out.println("foundeMember = " + foundeMember);
        
        boolean flag = mr.isDuplicateEmail("oldman@gmail.com");
        System.out.println("flag = " + flag);
    }
}
