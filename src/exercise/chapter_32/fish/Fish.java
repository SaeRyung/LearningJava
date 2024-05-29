package exercise.chapter_32.fish;

public class Fish {
    //속성
    private String sex; //"Male", "Female"
    protected boolean havingPoison; // true 독 있다, false 독 없다
    private String startSpawningDate; //산란시작시간
    private String endSpawningDate; //산란 종료시간
    protected String leavingSea; //사는 속성

    //행위

    //override
    //반환값 없을때 void 정의. 메소드 이름 eat
    void eat(String food){
        System.out.printf(myInfo() + " 물고기는 %s를 먹고 있습니다.\n", food);
    };

    void swim(int meter){
        System.out.println("나는 헤엄칩니다 미터: " + meter );
    }

    void makeCrowd(Fish otherfish){
        System.out.println("나는 다른 물고기와 무리짓습니다.");
    }

    void sleep(){};

    String myInfo(){
        return String.format("물고기(sex=%s, havingPosion=%b, leavingSea=%s)\n", this.sex, this.havingPoison, this.leavingSea);
    }

    void printMyInfo(){
        System.out.println(myInfo());
    }


    //setter
    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setHavingPoison(boolean havingPoison) {
        this.havingPoison = havingPoison;
    }

    public void setStartSpawningDate(String startSpawningDate) {
        this.startSpawningDate = startSpawningDate;
    }

    public void setEndSpawningDate(String endSpawningDate) {
        this.endSpawningDate = endSpawningDate;
    }

    public void setLeavingSea(String leavingSea) {
        this.leavingSea = leavingSea;
    }

    //getter
    public boolean isHavingPoison() {
        return havingPoison;
    }

    
    //super default 생성자
    Fish(){
        System.out.println("부모 물고기가 만들어지고 있습니다.");
    }

    //generate > construct
    public Fish(String sex, boolean havingPoison, String startSpawningDate, String endSpawningDate, String leavingSea) {
        this.sex = sex;
        this.havingPoison = havingPoison;
        this.startSpawningDate = startSpawningDate;
        this.endSpawningDate = endSpawningDate;
        this.leavingSea = leavingSea;
    }
}
