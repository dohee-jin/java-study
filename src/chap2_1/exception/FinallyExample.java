package chap2_1.exception;

public class FinallyExample {
    public static void main(String[] args) {

        int result = foo();
        System.out.println("result = " + result);

        String[] pets = {"멍멍이", "야옹이", "비둘기"};

        for(int i = 0; i < 4; i++){
            try{
                System.out.println(pets[i] + "키울래요~~~");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("그런 애완동물은 없어요~");
            } finally {
                // 보통 메모리 정리, 네트워크 연결 종료 시에 사용
                // 예와가 나도 실행, 안나도 실행
                System.out.println("화이팅~~~\n============");
            }
        }

    }

    static int foo() {
        try {
            return 100;
        } catch (Exception e) {
            return 200;
        } finally {
            return 300;
        }
    }
}
