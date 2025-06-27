package chap1_5.member;

// 회원들의 CRUD를 담당하는 창고(데이터베이스) 역할
public class MemberRepository {

    // 회원들을 저장할 배열
    // String[] => ["", "", ""]
    // int [] => [0, 0, 0]
    // Member[] -> [{}, {}, {}]
    Member[] memberList; // 가입된 회원 배열

    MemberRepository() {
        memberList  = new Member[] {
                new Member("abcd@123.com" , "1234", "콩벌레", Member.Gender.MALE, 30),
                new Member("abcd@123saa.com" , "1234", "턱돌이", Member.Gender.MALE, 30),
                new Member("abcd@123ㅇㅇ.com" , "ㄴ1234", "동글이", Member.Gender.FEMALE, 30)
        };

    }

    // 메소드
    // 회원 배열을 리턴하는 메소드
    Member[] getMembers() {
        return this.memberList;
    }

    int size() {
        return memberList.length;
    }

    /**
     *  멤버 리스트에 새로운 멤버를 추가합니다.
     *
     * @param newMember 추가할 새로운 멤버의 정보를 담고 있는 Member 객체
     *
     * @author -
     * @since - 2025.06.27
     */
    void addMember(Member newMember) {
        // 배열에 push를 적용
        // 1. 기존배열보다 1개 더 큰 새로운 배열 생성
        Member[] temp = new Member[memberList.length + 1];
        // 2. 기존배열의 데이터를 복사해서 신규배열에 저장
        for (int i = 0; i < memberList.length; i++) {
            temp[i] = memberList[i];
        }
        // 3. 신규데이터를 마지막 인덱스에 추가
        temp[temp.length - 1] = newMember;
        // 4. 신규배열을 실제 배열로 변경
        memberList = temp;
    }

    //  탐색 기능(특정 회원을 찾는 기능)
    Member findMemberByEmail(String targetEmail){
        for(Member member : memberList){
            if(targetEmail.equals(member.email)){
                return member;
            }
        }

        return null; // 탐색에 실패한 경우
    }

    // 이메일 중복확인
    boolean isDuplicateEmail(String inputEmail){
        return findMemberByEmail(inputEmail) != null;
    };

}
