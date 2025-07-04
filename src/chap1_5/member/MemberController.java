package chap1_5.member;

import chap1_9.static_.util.InputUtils;

import java.util.Scanner;

import static chap1_9.static_.util.InputUtils.*;

// 역할: 회원관리 앱의 입출력을 담당
public class MemberController {

    // 객체의 협력과 위임
    // 필드: 클래스의 속성 - 부품 속성
    MemberRepository mr; // 의존 관계
//    Scanner sc;

    MemberController() {
        mr = new MemberRepository();
//        sc = new Scanner(System.in);
    }


    // 프로그램 초기 화면 출력
    void start() {
        while (true) {
            // String userName = prompt("#이름 ");
            processMenu(showMenu());
        } // end while
    } // end start

    /**
     * @param menuNum 사용자가 입력한 값을 받음
     * */
    void processMenu(String menuNum) {
        switch (menuNum) {
            case "1":
                signUp();
                break;

            case "2":
                showAllMembers("전체 회원 조회!");
                break;

            case "3":
                showDetailMembers();
                break;

            case "4":
                changePassword();
                break;

            case "5":
                System.out.println("회원 정보 삭제!");
                break;

            case "6":
                System.out.println("회원 정보 복구!");
                break;

            case "7":
                System.out.println("프로그램 종료!");
                System.exit(0); // alt + f4, 강제종료로 리턴 기능이 있음

            default:
                System.out.println("메뉴를 숫자로 입력하세요!");
        } // end switch

        prompt("====== 계속하시려면 Enter... ====== \n");
    }

    Member findMember(String message) {
        String email = prompt("#%s 대상의 이메일: ".formatted(message));
        return mr.findMemberByEmail(email);
    }

    void changePassword() {
        System.out.println("\n# 회원 정보의 패스워드를 수정합니다.");
        Member foundMember = findMember("수정");

        if(foundMember != null){
            // 개별정보 출력
            String newPassword = prompt("# 새 비밀번호");

            // 실질적인 데이터 수정 처리
//            foundMember.updateNewPassword(newPassowrd);
        } else {
            System.out.println("\n조회 결과가 없습니다.");
        }
    }

    void showDetailMembers() {
        System.out.println("\n개별 회원을 조회합니다.");
        Member foundMember = findMember("조회");

        if(foundMember != null){
            // 개별정보 출력
            foundMember.inform();
        } else {
            System.out.println("\n조회 결과가 없습니다.");
        }
    }

    void signUp() {
        System.out.println("\n회원 정보 등록을 시작합니다.");
        String email = checkDuplicatedEmail();
        String password = prompt("# 패스워드: ");
        String memberName = prompt("# 이름: ");
        Member.Gender genderStr = inputCorrectGender();
        int ageStr = promptNumber("# 나이: ");

        // 회원 배열에 추가
        mr.addMember(new Member(
                email,
                password,
                memberName,
                genderStr,
                ageStr
        ));

    }

    String checkDuplicatedEmail() {
        String email = prompt("# 이메일: ");
        while(true){
            if(!mr.isDuplicateEmail(email)){
                return email;
            }
            System.out.println("이메일이 중복되었습니다.");
        }
    }

    Member.Gender inputCorrectGender() {
        String genderStr = prompt("# 성별[M/F]: ");
        while(true){
            switch (genderStr.toUpperCase().charAt(0)) {
                case 'M':
                    return Member.Gender.MALE;
                case 'F':
                    return Member.Gender.FEMALE;
                default:
                    System.out.println("성별을 M 또는 F로 입력해주세요");
                    break;
            }
        }
    }

    void showAllMembers(String user) {
        System.out.println("\n전체 회원 정보를 조회합니다.");
        Member[] members = mr.getMembers();
        for (Member member : members) {
            member.inform();
        }
    }



    /**
    * @return 사용자가 입력한 값을 반환
    * */
    String showMenu() {
        System.out.printf("\n#####  회원 관리 시스템 (현재 회원 수: %d명)  #####\n", mr.size());
        System.out.println("* 1. 회원 정보 등록하기");
        System.out.println("* 2. 전체 회원 조회하기");
        System.out.println("* 3. 개별 회원 조회하기"); // 3~5 이메일입력받아서 조회, 없으면 없음 출력
        System.out.println("* 4. 회원 정보 수정하기"); // 패스워드만 수정
        System.out.println("* 5. 회원 정보 삭제하기"); // 이메일을 입력, 있으면 패스워드도 확인, 배열에서 삭제
        System.out.println("* 6. 회원 정보 복구하기");
        // hint 배열을 2개 관리함, 삭제하면 삭제배열에 저장,
        // 논리적 삭제를 구현(실제로 배열에서 지우는 게 아니라 지우는 척함)
        // 멤버에 필드를 하나 추가, boolean 으로 만들고 true(삭제됨)이면 조회 시 필터링해서 조회함
        System.out.println("* 7. 프로그램 종료하기");
        System.out.println("================================");

        return prompt(">> ");
    }

    //
    /*String prompt(String message) {
        System.out.print(message);
        return sc.nextLine();
    }*/
}
