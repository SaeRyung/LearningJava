package exercise.chapter_26;

public class Teacher {
    //속성

    //학교 정보
    String schoolName;
    
    //담당과목_Subject class에 묶어서 표현됌
    Subject subject;
    
    //기본정보
    String name;
    String gender;

    //행위
    void teach(Student student, String subjectName){
        String studentName = student.name;
        System.out.println("선생: %s 학생에서 %s 과목을 가르치고 있습니다.\n");
    }
    //오버로드 하기 전 하나 만을어야 함
    Teacher(){}
    Teacher(String pName, String pGender, String pSubjectName, String pSubjectCode){
        name = pName;
        gender = pGender;

        Subject newSubject = new Subject();
        newSubject.subjectName = schoolName;
        newSubject.subjectCode = pSubjectCode;

        subject = newSubject;
    }
}
