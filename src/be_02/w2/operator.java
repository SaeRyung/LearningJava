package be_02.w2;

public class operator {
    public static void main(String[] args) {
        int fifty_thousand = 50_000;
        int ten_thousand = 10_000;
        int five_thousand = 5_000;
        int thousand = 1_000;
        int five_hundred = 500;
        int hundred = 100;
        int fifty = 50;
        int ten = 10;

        int number = 78660;

        //5만원 갯수, 나머지
        int Share_fiftyThousand =0;
        int theRest_fiftyThousand = 0;


        //1만원 갯수, 나머지
        int Share_tenThousand = 0;
        int theRest_tenThousand = 0;

        //5천원 갯수, 나머지
        int Share_fiveThousand = 0;
        int theRest_fiveThousand = 0;

        //1천원 갯수, 나머지
        int Share_Thousand = 0;
        int theRest_Thousand = 0;

        //5백원 갯수, 나머지
        int Share_fiveHundred = 0;
        int theRest_fiveHundred = 0;

        //백원 갯수, 나머지
        int Share_Hundred = 0;
        int theRest_Hundred = 0;

        //50원 갯수, 나머지
        int Share_Fifty = 0;
        int theRest_Fifty = 0;

        //10원 갯수, 나머지
        int Share_Ten = 0;
        int theRest_Ten = 0;





        //5만원권
        if (number % fifty_thousand != 0) {
            Share_fiftyThousand = number / fifty_thousand; //5만원 장 수
            theRest_fiftyThousand = number % fifty_thousand; //5만원 제외한 금액
        }
        //만원권
        if (theRest_fiftyThousand % ten_thousand != 0) {
            Share_tenThousand = theRest_fiftyThousand / ten_thousand; //1만원 장 수
            theRest_tenThousand = theRest_fiftyThousand % ten_thousand; //1만원 제외 금액

        }
        //오천원권
        if (theRest_tenThousand % five_thousand != 0){
            Share_fiveThousand = theRest_tenThousand / five_thousand; //5천원 장 수
            theRest_fiveThousand = theRest_tenThousand % five_thousand; //5천원 제외 금액


        }
        //천원권
        if(theRest_fiveThousand % thousand != 0){
            Share_Thousand = theRest_fiveThousand / thousand; //1천원 장 수
            theRest_Thousand = theRest_fiveThousand % thousand; //1천원 제외 금액
        }
        //5백원
        if(theRest_Thousand % five_hundred != 0){
            Share_fiveHundred = theRest_Thousand / five_hundred; //5백원 개수
            theRest_fiveHundred = theRest_Thousand % five_hundred; //5백원 제외
        }
        //백원
        if(theRest_fiveHundred % hundred != 0){
            Share_Hundred = theRest_fiveHundred / hundred; //백원 개수
            theRest_Hundred = theRest_fiveHundred % hundred; //백원 제외 나머지
        }
        //50원
        if(theRest_Hundred % fifty != 0){
            Share_Fifty = theRest_Hundred / fifty; //50원 개수
            theRest_Fifty = theRest_Hundred % fifty; //50원 제외 나머지
        }
        System.out.println(theRest_Fifty);
        //10원
        if(theRest_Fifty % ten != 0){
            Share_Ten = theRest_Fifty / ten; //10원 개수
            theRest_Ten = theRest_Fifty % ten; //10원 나머지
        }else{
            Share_Ten = theRest_Fifty / ten; //1원 없을 시 10원 개수
        }



        System.out.printf("5만원 %d 장, 1만원 %d 장, 5천원 %d 장, 천원 %d장, 500원 %d개, 100원 %d개, 50원 %d개, 10원 %d개 입니다.",
                Share_fiftyThousand, Share_tenThousand, Share_fiveThousand, Share_Thousand, Share_fiveHundred, Share_Hundred, Share_Fifty, Share_Ten);
        }


    }

