package exercise.chapter_24;

//class 밖에서는 함수 구현 X
public class MethodExamples {

    //일반적인 입력값, 출력값도 있는 경우
    //둘 다 하나인 경우
    static int toUnicode(char ch){
        return (int)ch;
    }
    //일반적인 입력값, 파라미터 여러개인 경우
    static int sumAndMultiplyFour(int a, int b){
        return (a + b) * 4;
    }

    public static void main(String[] args) {
        char ch = 'A';
        int decode = toUnicode(ch);
        System.out.println(decode);

        int myInt1 = 10;
        int myInt2 = 5;
        int result = sumAndMultiplyFour(myInt1, myInt2);
        System.out.println(result);

        String res = sayHello();
        System.out.println(res);

        printHello("printHello");
        printHi();
    }

    //인자값이 없는 경우, 출력값 있음
    static String sayHello(){ //입력값 X
        return "Hello";
    }

    //인자값 있는 경우, 출력값 없음
    //출력값 없을 때 void 사용
    static void printHello(String str){
        System.out.printf("함수 안에서 실행합니다. %s\n",str);
    }

    //인자값, 출력값 둘 다 없는 경우
    static void printHi(){
        System.out.println("Hi");
    }



}
