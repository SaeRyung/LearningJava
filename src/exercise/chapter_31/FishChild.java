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
}
