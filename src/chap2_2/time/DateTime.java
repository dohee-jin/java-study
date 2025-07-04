package chap2_2.time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class DateTime {
    public static void main(String[] args) {
        // 날짜와 시간을 표현
        // 1970년 1월 1일 00:00:00 이전의 시간은 모름 - 에폭 타임(유닉스 타임)
        //밀리초 단위로 시간을 늘려나감
        System.out.println(System.currentTimeMillis());

        // 자바 8 이전
        Date date = new Date();
        System.out.println("date: " + date);

        Calendar calender = Calendar.getInstance();
        System.out.println(calender.JULY);

        // 자바 8 이후
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate);


        LocalTime nowTime = LocalTime.now();
        System.out.println("nowDate = " + nowTime);

        // 특정 날짜 이후
        LocalDate futureDate = LocalDate.of(2025, 8, 23);
        System.out.println("futureDate = " + futureDate);

        // 날짜 연산
        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDateTime targetDate = nowDateTime.plusDays(67);
        System.out.println(targetDate);

        // 오늘로부터 1년 3개월 20일 3시간 이후는 언제?
        LocalDateTime targetDateTime = nowDateTime
                .plusYears(1)
                .plusMonths(3)
                .plusDays(20)
                .plusHours(3)
                ;
        System.out.println("targetDateTime = " + targetDateTime);

        // 현재 날짜에서 다른정보 말고 딱 월정보만 가져오고 싶음
        int monthDate = nowDateTime.getMonthValue();
        System.out.println("monthDate = " + monthDate);
        
        int dayOfMonth = nowDateTime.getDayOfMonth();
        System.out.println("dayOfMonth = " + dayOfMonth);

        // 날짜 포맷 변경
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분 ss초");
        String formattedDate = nowDateTime.plusHours(5).format(formatter);

        System.out.println("formattedDate = " + formattedDate);

        // 사이 연도 구하기
        LocalDate birthDate = LocalDate.of(1999, 6, 29);
        Period period = Period.between(birthDate, nowDate);
        int years = period.getYears();
        System.out.println("years = " + years);

        // 사이 날짜 구하기
        long betweenDays = ChronoUnit.DAYS.between(birthDate, nowDate);
        System.out.println("betweenDays = " + betweenDays);


    }
}
