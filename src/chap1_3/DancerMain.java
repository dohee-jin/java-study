package chap1_3;

// 실행용 클래스: 실제로 Dancer 생성
public class DancerMain {
    public static void main(String[] args) {

        // 데이터 타입: 데이터를 담는 그릇
        // 기본 데이터 타입: byte, short, int, long...


        // 설계도(클래스)를 가져와서 객체(인스턴스)를 찍어낸다.
        // new 클래스(): 객체 생성
        // 타입(클래스이름) 변수  = new 클래스이름();
        /*  .js 객체
            const park = {
                dancerName: '',
                crewName: '',
                genres: [],
                danceLevel: 0,
                dance: () => {}.
                introduce: () => {}
            }
        */

        Dancer park = new Dancer();
        // 포인터로 주소값을 출력
        /*System.out.println(taro); */

        /*
        taro.dancerName = "taro";
        taro.crewName = "riize";
        */

        park.introduce();

        Dancer pororo = new Dancer("뽀로로");
        pororo.introduce();

        Dancer heartPing = new Dancer("하츄핑", "티니핑");
        heartPing.introduce();

        Dancer taro = new Dancer("타로", "라이즈", "힙합", "크럼프", "왁킹");
        taro.introduce();

        String[] genres = {"힙합", "크럼프", "왁킹"};
        Dancer osaki = new Dancer("타로롱", "라이즈", genres, 1000);
        osaki.introduce();
    }
}
