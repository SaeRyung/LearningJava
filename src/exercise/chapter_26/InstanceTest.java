package exercise.chapter_26;

public class InstanceTest {

    public static void main(String[] args){

    //학생 선언
    Student student1 = new Student("School", 1, 3, 20, "Bob", "Male");//디폴트생성자 선언
//class, string, array > 참조형은 default값: null,,,, int 기본값 > 0
    System.out.println(student1.name);
    System.out.println(student1.gender); //null 로 나옴
    System.out.println(student1.studentNumber); //0
//

    Student student2 = new Student( "School", 1, 3, 15, "Alice", "Female");
    System.out.println(student2.name);
    System.out.println(student2.gender);
    System.out.println(student2.schoolName);

    Student student3 = new Student();
    Student student4 = new Student();

    Teacher teacher = new Teacher("Tom", "Female", "korean", "AB001");

    //subject 클래스 이므로 subject 선행해서 만들어주기 필요
    Subject koreanSubject = new Subject();
    koreanSubject.subjectName = "korean";
    koreanSubject.subjectCode = "AB001";
    //선행 후 정의 가능
    teacher.subject = koreanSubject;

    System.out.println(teacher.name);
    System.out.println(teacher.gender);
    System.out.println(teacher.subject.subjectName);
    System.out.println(teacher.subject.subjectCode);

    }
}
