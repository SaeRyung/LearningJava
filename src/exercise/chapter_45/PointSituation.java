package exercise.chapter_45;

public class PointSituation {
    public static void main(String[] args){
        Point<Integer, Integer> point1 = new Point<>(1, 5);
        Point<Integer, Double> point2 = new Point<>(5, 4.55);
        Point<Double, Double> point3 = new Point<>(1.5, 5.5);


        System.out.println(point1.calculateDistence());
        System.out.println(point2.calculateDistence());
        System.out.println(point3.calculateDistence());


        //extends Number로 하여 오류 발생
//        Point<String, Integer> point4 = new Point("Cat", 5);
        Point<Float, Integer> point4 = new Point(0.5f, 5);

        System.out.println(point4.calculateDistence());
    }
}
