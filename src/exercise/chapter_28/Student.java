package exercise.chapter_28;

public class Student {
    //속성
    private String schoolName;
    private int classYear; //학년
    private int classroomNumber; //반
    private int studentNumber; //번호

    //기본정보
    private String name;
    private String gender;

    //행위
    void study(Teacher teacher, String subjectName){
        String teacherName = teacher.getName(); //getter로 이름 꺼내기
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배웁니다.\n", teacherName, subjectName);
    }

    //생성자 추가
    Student(){
    }//기본 생성자 원래 있었지만 보이지 않았다. 정의
    Student(String name, String gender){ //생성자 여러개
        //다음 생성자 Strdent 볼 수 있도록
        this("school", 1, 3, -1, name, gender);
    }

//
    Student(String scchoolName, int classYear, int classroomNum, int studentNum, String name, String gender) {//파라미터 넣어주기
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
