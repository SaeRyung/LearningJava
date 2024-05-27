package exercise.chapter_26;

public class Student {
    //속성
    String schoolName;
    int classYear; //학년
    int classroomNumber; //반
    int studentNumber; //번호

    //기본정보
    String name;
    String gender;

    //행위
    void study(Teacher teacher, String subjectName){
        String teacherName = teacher.name;
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배웁니다.\n", teacherName, subjectName);
    }

    //생성자 추가
    Student(){
    }//기본 생성자 원래 있었지만 보이지 않았다. 정의
    Student(String pName, String pGender){ //생성자 여러개
        name = pName;
        gender = pGender;
    }

//
    Student(String pSchoolName, int pClassYear, int pClassroomNum, int pStudentNum, String pName, String pGender) {//파라미터 넣어주기
        //생성자 만들 시에 이곳으로 전달
        schoolName = pSchoolName;
        classYear = pClassYear;
        classroomNumber = pClassroomNum;
        studentNumber = pStudentNum;
        name = pName;
        gender = pGender;
    }

}
