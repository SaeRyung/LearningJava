package exercise.chapter_29;

public class Coffee {
    
    //시나리오 참고
    //아메리카노 커피는 물500ml 와 원두 30g
    //아메리카노 커피는 테이크아웃용 으로 포장된다
    
    //속성
    private String coffeeName;
    private long waterQuantity; //ml 단위
    private long coffeeBeanQuantity; //원두의 양 g단위
    private boolean isWrappedUp; //포장됨 여부

    //행위
    //포장되면 true. 함수로 만듬
    void beWrappedUP(){
        this.isWrappedUp = true;
    }

    //생성자 정의, 클래스 이름으로 만듬
    Coffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity  ){
        this.coffeeName = coffeeName;
        this.waterQuantity = waterQuantity;
        this.coffeeBeanQuantity = coffeeBeanQuantity;

        //기본값으로. 포장여부는 함수
        isWrappedUp = false;
    }
}
