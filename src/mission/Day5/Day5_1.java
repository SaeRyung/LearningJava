package mission.Day5;

public class Day5_1 {
    public static void main(String[] args) {

        int star = 3;

        for (int i = 1; i <= star; i++) {
            for (int j = star - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= star; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = (star - i) * 2 - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
