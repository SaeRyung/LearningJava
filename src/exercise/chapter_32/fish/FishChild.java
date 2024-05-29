package exercise.chapter_32.fish;

public class FishChild extends Fish {

    //필드 추가
    private  boolean eatable;
    protected String leavingSeaChild;


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


    void printSea(){
        System.out.println(myInfo() + "는 " + this.leavingSeaChild + "바다 출신이고, " +
                "부모 물고기는 "+super.leavingSea + " 바다 출신이야.");
    }



    //setter
    public void setLeavingSeaChild(String leavingSeaChild) {
        this.leavingSeaChild = leavingSeaChild;
    }

    //default생성자
    FishChild(){
        super(); //자동으로 추가되어잇다. 먼저 실행됌 : 부모 물고기가 만들어지고 있습니다.
    }


    //super
    public FishChild(boolean eatable, String leavingSea) {
        this.eatable = eatable;
//        this.leavingSea = leavingSea; //부모와 다른 메소드
        super.leavingSea = leavingSea; //super > 부모의 leavingsea
    }

    FishChild(String sex, boolean eatable, String leavingSea){
        super(sex, false, "2022", "2022",leavingSea);
        this.eatable = eatable;

    }
}
