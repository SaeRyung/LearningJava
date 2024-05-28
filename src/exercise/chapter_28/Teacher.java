package exercise.chapter_28;

public class Teacher {
    //속성

    //학교 정보
    private String schoolName;
    
    //담당과목_Subject class에 묶어서 표현됌
    private Subject subject;
    
    //기본정보
    private String name;
    private String gender;

    //행위
    void teach(Student student, String subjectName){
        String studentName = student.getName();
        System.out.printf("선생: %s 학생에서 %s 과목을 가르치고 있습니다.\n", studentName, subjectName);
    }
    //오버로드 하기 전 하나 만을어야 함
    Teacher(){}
    Teacher(String name, String gender, String subjectName, String subjectCode){
        this.name = name;
        this.gender = gender;

        Subject newSubject = new Subject();
        subject.setSubjectName(subjectName);
        subject.setSubjectCode(subjectCode);

        this.subject = newSubject;
    }

    //생성자 만들기
    //getter: name, gender 같은 아이들 리턴 기능
    public String getName(){
        return name;
    }


}
