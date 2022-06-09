import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        System.out.println("Веедіть висоту: ");
        Scanner height = new Scanner(System.in);
        int h = height.nextInt();    // де h - Height (Висота) = i
        System.out.println("Введіть ширину");
        Scanner width = new Scanner(System.in);
        int w = width.nextInt();     // де w - Width ( Ширина) = j
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}