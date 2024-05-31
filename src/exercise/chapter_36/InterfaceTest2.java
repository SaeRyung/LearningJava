package exercise.chapter_36;

public class InterfaceTest2 {

    public static void main(String[] args){

        //Drone
        Flyable drone = new Drone();
        Flyable airplane = new Airplane("BB1122");

        drone.fly();
        airplane.fly();

        //다운캐스팅
        if(drone instanceof Drone){
            Drone dron2 = (Drone) drone; //명시적변환 다운캐스팅
            dron2.takePicture();
        }
    }
}
