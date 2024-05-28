package mission.W5.Day2;

public class Student {

    //private 맴버 변수
    //접근 제어자 사용
    private String StudentName; //이름
    private int StudentNumber; //번호
    private String StudentMajor; //전공
    private int StudentYear; //학년


    //setter 메서드 구현하여 다른곳 접근 가능


    //생성자 작성하여 학생 객체 초기화
    Student(String StudentName, int StudentNumber, String StudentMajor, int StudentYear){
        this.StudentName = StudentName;
        this.StudentNumber = StudentNumber;
        this.StudentMajor = StudentMajor;
        this.StudentYear = StudentYear;
    }

    //return값
    public String getStudentName(){
        return this.StudentName;
    }

    public int getStudentNumber(){
        return this.StudentNumber;
    }

    public String getStudentMajor(){
        return this.StudentMajor;
    }

    public int getStudentYear(){
        return this.StudentYear;
    }
}

