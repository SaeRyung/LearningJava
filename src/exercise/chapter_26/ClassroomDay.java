package exercise.chapter_26;

public class ClassroomDay {
    public static void main(String[] args) {
        //생성자 오버로드
        //인스턴스 생성 과정
        Student student1 = new Student("school", 1, 3, 20, "Bob", "Male");
        Student student2 = new Student("school", 1, 3, 25, "Alice", "Female");
        Student student3 = new Student("school", 1, 3, 30, "Taylor", "Female");
        Student student4 = new Student("school", 1, 3, 35, "Lula", "Female");

        Teacher teacher = new Teacher("Tom", "Female", "국어", "AB001");


        String subjectName = "국어";

        //본격적인 로직 흐름 시작
        teacher.teach(student1, subjectName); //하나의 행위가 만들어짐
        student1.study(teacher, subjectName);

        teacher.teach(student2, subjectName);
        student1.study(teacher, subjectName);

        teacher.teach(student3, subjectName);
        student1.study(teacher, subjectName);

        teacher.teach(student4, subjectName);
        student1.study(teacher, subjectName);
    }
}
