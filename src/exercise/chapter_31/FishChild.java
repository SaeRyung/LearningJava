package exercise.chapter_31;

public class FishChild extends Fish{

    //필드 추가
    private  boolean eatable;


    //새로운 메소드
    public void digging(){
        System.out.println(myInfo() + "가 모래를 파고 있습니다.");
    }


    //getter
    public boolean isEatable() {
        return eatable;
    }
    //setter

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    //독 있음 추가
    public void becomeDanger(){
        this.havingPoison = true; //protected havingPoison 으로 변경
    }
    
    //부모클래스 같은게 존재, @Override 표시하여 재수정
    @Override
    void eat(String food){
        System.out.printf(myInfo() + " 물고기는 %s를 ***열심히***먹고 있습니다.\n", food);
    }
}
