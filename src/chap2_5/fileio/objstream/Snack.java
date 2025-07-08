package chap2_5.fileio.objstream;

import java.io.Serializable;
import java.util.Objects;

// 이 클래스의 객체가 스트림을 통과하기 위해 직렬화시킴
// implements Serializable
public class Snack implements Serializable {

    /*
        클래스 설계시 작성해야 되는 것
        1. 필드 프라이빗
        2. 기본생성자(noArgsConstructor)
        3. 전체초기화시키는생성자
        4. 게터, 세터
        5. equals, hashCode, toString
     */

    public enum Taste {
        GOOD, BAD
    }

    private String snackName;
    private int year;
    private int price;
    private Taste taste;

     // NoArgsConstructor
    public Snack() {
    }

    // AllArgsConstructor
    public Snack(String snackName, int year, int price, Taste taste) {
        this.snackName = snackName;
        this.year = year;
        this.price = price;
        this.taste = taste;
    }

    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "snackName='" + snackName + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", taste=" + taste +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Snack snack)) return false;
        return year == snack.year && price == snack.price && Objects.equals(snackName, snack.snackName) && taste == snack.taste;
    }

    @Override
    public int hashCode() {
        return Objects.hash(snackName, year, price, taste);
    }
}
