package exercise.chapter_52;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeTest {

    public static void main(String[] args){
        //현재 시간 출력
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //특정 일/월/년 가져오기, 요일
        LocalDate past = LocalDate.of(2022,12,25);
        System.out.println(past);
        System.out.println(past.getDayOfWeek());//요일

        //날짜 포맷 바꾸기
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateStr = past.format(dateTimeFormatter);

        System.out.println(past);
        System.out.println(dateStr);
    }
}
