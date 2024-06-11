package exercise.chapter_52;

public class PTMemberTest {

    public static void main(String[] args) {
        PTmember member = new PTmember("민철", 178, 70, "남자");

        try {
            member.setID("abcdefdasdf");
        }catch(Exception e){
            //고객에게 알람 보내기
        }
        System.out.println(member);
    }
}
