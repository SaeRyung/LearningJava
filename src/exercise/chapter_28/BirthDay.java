package exercise.chapter_28;

public class BirthDay {

    private int year;
    private int month;
    private int day;

    //private이기에 setter 구현하여 다른곳에서 접근할 수 있도록
    public void setYear(int year){
        this.year = year; //나 자신
    }

    private void printHi(){
        System.out.println("Hi");
    }

    //생성자
    BirthDay(int year, int month, int day){
        this.year = year; //this를 통해 명시적으로 내 자신을 접근
        this.month = month;
        this.day = day;
        this.printHi(); //나 자신의 메소드를 접근
    }
}
