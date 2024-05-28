package exercise.chapter_29;

public class Barista {
    //시나리오 참고
    //1. '바리스타'는 '아메리카노'주문 확인을 알린다.
    //2. '바리스타'는 물 500ml와 원두 30g로 '아메리카노 커피' 만든다.
    //3. '바리스타'는 '아메리카노 커피'완성을 알린다.

    //속성 X

    //행위
    //1번 _ 콘솔에 출력으로
    public void noticeOrder(String coffeeName){
        System.out.println("바리스타: 커피 주문 확인했습니다. 커피: "+coffeeName);
    }
    //2번
    //반환값, Coffee 라는 객체 / 메소드 이름 makeUpCoffee / input으로 coffeeName, waterQuantity, coffeebeanQuantity
    public Coffee makeUpCoffee(String coffeeName, long waterQuantity, long coffeebeanQuantity){
        Coffee coffee = new Coffee(coffeeName, waterQuantity, coffeebeanQuantity); //커피객체 생성
        return coffee;
    }
    //3번
    public void sayCoffeeReady(Coffee coffee){
        String coffeeName = coffee.getCoffeeName();
        System.out.println("바리스타: 커피 제작이 완료되었습니다. 커피: "+coffeeName);
    }

}
