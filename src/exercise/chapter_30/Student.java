package exercise.chapter_30;

import exercise.chapter_28.Teacher;

public class Student {
    private static int serialNum = 1;
    static String city = "Seoul";

    //속성
    private String schoolName;
    private int classYear; //학년
    private int classroomNumber; //반
    private int studentNumber; //번호


    //static
    private int studentID; //student 고유ID

    //기본정보
    private String name;
    private String gender;

    //정적 메소드
    public static int getSerialNum() {
        return serialNum;
    }
    public static void setSerialNum(int num) {
        serialNum = num;
    }


    //행위
    void study(Teacher teacher, String subjectName){
        String teacherName = teacher.getName(); //getter로 이름 꺼내기
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배웁니다.\n", teacherName, subjectName);
    }

    //결과값출력 함수
    public void printMyInfo(){
        System.out.printf("[Student] schoolName: %s, classYear: %d" +
                "studentNumber: %d, studentID: %d, name: %s, gender: %s\n",
                this.schoolName, this.classYear, this.studentNumber, this.studentID, this.name, this.gender
                );
    }


    //생성자 추가
    Student(){
    }//기본 생성자 원래 있었지만 보이지 않았다. 정의
    Student(String name, String gender){ //생성자 여러개
        //다음 생성자 Strdent 볼 수 있도록
        this("school", 1, 3, -1, name, gender);
    }

//static > serialNum 결과값 보기위해
    Student(String scchoolName, int classYear, int classroomNum, int studentNum, String name, String gender) {//파라미터 넣어주기
        //static 생성자
        this.studentID = serialNum++;
        //생성자 만들 시에 이곳으로 전달
        this.schoolName = schoolName;
        this.classYear = classYear;
        this.classroomNumber = classroomNum;
        this.studentNumber = studentNum;
        this.name = name;
        this.gender = gender;
    }

    //getter
    public String getName(){
        return this.name;
    }

}
