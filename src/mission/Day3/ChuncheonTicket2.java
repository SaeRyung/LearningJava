package mission.Day3;

public class ChuncheonTicket2 {
    public static void main(String[] args) {
        /*
        * “ChuncheonTicket2”로 자바 클래스 만든다.
        * 이 때, 각각 개인은 ”4＂장의 티켓을 가져간다.*/

        int freeTickets = 1111;

        //개인 4장 티켓씩
        int personal =  1111/4;
        //티켓 남은 수
        int extra = 1111%4;

        System.out.println("티켓을 가져갈 수 있는 근무자들 수는?" + personal);
        System.out.println("티켓을 다 나눠주고, 남는 티켓 수는?" + extra);
    }
}
