package exercise.chapter_26;

public class InstanceTest {

    public static void main(String[] args){

    //학생 선언
    Student student1 = new Student(pSchoolName: "School", pClassYear:1, pClassroomNum:3, pStudentNum:20, pName:"Bob", pGender:"Male");//디폴트생성자 선언

      //class, string, array > 참조형은 default값: null,,,, int 기본값 > 0
    System.out.println(student1.name);
    System.out.println(student1.gender); //null 로 나옴
    System.out.println(student1.studentNumber); //0


    Student student2 = new Student();
    student2.name = "Alice";
    student2.gender = "Female";
    student2.schoolName = "School";
    student2.classYear = 1;
    student2.classroomNumber = 3;
    student2.studentNumber = 15;

    System.out.println(student2.name);
    System.out.println(student2.gender);
    System.out.println(student2.schoolName);

    Student student3 = new Student();
    Student student4 = new Student();

    Teacher teacher = new Teacher();
    teacher.name = "Tom";
    teacher.gender = "Female";
    teacher.schoolName = "School";

    //subject 클래스 이므로 subject 선행해서 만들어주기 필요
    Subject koreanSubject = new Subject();
    koreanSubject.subjectName = "korean";
    koreanSubject.subjectCode = "AB001";
    //선행 후 정의 가능
    teacher.subject = koreanSubject;

    System.out.println(teacher.name);
    System.out.println(teacher.gender);
    System.out.println(teacher.subject.subjectName);

    }
}
