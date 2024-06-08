package exercise.chapter_45;

import exercise.chapter_37.DaddyRole;

//두가지 타입 제너릭으로 받음

//extends Number > Number 하위의 타입이다.
//type을 결계로 정함
public class Point <T extends Number,V extends Number>{

    private T x;
    private V y;

    public Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX(T x, V y) {
        return x;
    }

    public V getY() {
        return y;
    }


    public Double calculateDistence(){
        //(x ** 2 + y ** 2) ^ 1/2

        //extends Number > Number 하위의 타입이다.
        //필요없어진다.
//        if( ! (this.x instanceof Number)){ //Number type이 x가 아니면 null
//            return null;
//        }
//        if( ! (this.y instanceof Number)){//Number type이 y가 아니면 null
//            return null;
//        }

        Double num1 = this.x.doubleValue();
        Double num2 = this.y.doubleValue();

        return Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));
    }
}
