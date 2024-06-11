package exercise.chapter_52;

public class DayTest {
    public static void main(String[] args){
        Day monday = Day.MONDAY;
        Day friday = Day.FIRDAY;

        //System.out.println("요일: "+ monday);
        //System.out.println("요일: "+ monday.getKoreanName());
        //System.out.println("요일: "+ friday.getKoreanName());

        Day day = Day.SATURDAY;

        switch(day){
            case MONDAY:
                System.out.println("한 주의 시작! " + day.getKoreanName());
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("오늘은 평일 " + day.getKoreanName());
                break;
            case FIRDAY:
                System.out.println("오늘만 지나면, 주말~ " + day.getKoreanName());
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("주말이다! " + day.getKoreanName());
                break;
        }
    }
}
