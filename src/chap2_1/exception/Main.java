package chap2_1.exception;

public class Main {
    public static void main(String[] args) {

        // 회원 생성
        // ctrl + alt + v
        LoginUser user = new LoginUser("abc123", "1234");

        // 로그인 검증
        try {
            user.authenticate("abc123", "12354");
        } catch (LoginInvalidException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
