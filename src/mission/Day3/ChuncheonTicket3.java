package mission.Day3;

public class ChuncheonTicket3 {
    public static void main(String[] args) {

        final int SENIOR_AGE_STANDARD = 65; //기준나이 상수로 적용

        int ageOfAlice = 70;
        String countryOfAlice = "USA";
        int ageOfKim = 65;
        String countryOfKim = "Korea";
        int ageOfYoo = 42;
        String countryOfYoo = "Korea";

        boolean result_Alice = ageOfAlice >= SENIOR_AGE_STANDARD && countryOfAlice == "Korea";
        boolean result_Kim = ageOfKim >= SENIOR_AGE_STANDARD && countryOfKim == "Korea";
        boolean result_Yoo = ageOfYoo >= SENIOR_AGE_STANDARD && countryOfYoo == "Korea";


        System.out.println("Alice는 적용 대상자인가?:" + result_Alice );
        System.out.println("Kim은 적용 대상자인가?:" + result_Kim);
        System.out.println("Yoo는 적용 대상자인가?:" + result_Yoo);
    }
}
