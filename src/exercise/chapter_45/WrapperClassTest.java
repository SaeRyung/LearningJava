package exercise.chapter_45;

public class WrapperClassTest {
    public static void main(String[] args){
        //Integer
        //박싱을 했다.
        Integer integer1 = new Integer(20); //int -> Integer boxing
        Integer integer2 = new Integer(30);
        //Integer 객체이기 때문에 null 넣을 수 있다.
        Integer intget3 = null;
        //int 는 null 불가능
        //int int2 = null;


        int int1 = integer1.intValue(); //unboxing, integer -> int로 바꾼것

        //요새 방법, AutoBoxing, new Integer(20);
        Integer integer3 = 20;
        int int2 = integer3; //AutoUnboxing


//        System.out.println(integer1);
//        System.out.println(int1);
//        System.out.println(integer3);
//        System.out.println(int2);

        //연산자
//        System.out.println(integer1 + integer2);
//        System.out.println(integer1 + int1);

        //Character
        Character character = new Character('X'); //x 라는 char 타입을 Character 타입으로 boxing
        char ch1 = character.charValue(); //Character 타입을 언박싱

        System.out.println(character);
        System.out.println(ch1);

        //autounboxing
        Character character1 = 'X';
        char ch2 = character1;

        //Array형태
        Character[] characters = {'a', 'b', 'c'};
        char[] chars = {'a', 'b','c'};

        String str = String.valueOf(characters);
        String str2 = String.valueOf(chars);

        System.out.println(str);
        System.out.println(str2);


        //Boolean Type
        Boolean bool1 = new Boolean(true); //true boolean -> Boolean
        boolean bool2 = bool1.booleanValue(); //Unboxing

        Boolean bool3 = false;
        boolean bool4 = bool3;

        System.out.println(bool1 & bool3);
        System.out.println(bool1 | bool3);

        if(bool2){

        }
        if(bool1){

        }


    }
}
