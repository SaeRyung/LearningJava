package exercise.chapter_44;

public class StringBuilderTest {
    public static void main(String[] args) {
        //+=
        String str = "";

        //시간초, 현재시각, 밀리세컨즈
        long timeStart = System.currentTimeMillis();

        for(int i =0; i<500; i++){
            str += "Cat";
        }
        System.out.println(str);

        long timeEnd = System.currentTimeMillis();

        System.out.println("걸린 시간: " + (timeEnd - timeStart) + "ms");

        ///////////////////////////////////////////////

        long timeStart2 = System.currentTimeMillis();

        StringBuilder SB = new StringBuilder(str);

        for(int i=0; i<500; i++){
            SB.append("Cat");
        }

        //append 후 String 바꿔줘야함
        String result = SB.toString();
        System.out.println(result);

        long timeEnd2 = System.currentTimeMillis();
        System.out.println("걸린 시간2: " + (timeEnd2 - timeStart2) + "ms");
    }


}
