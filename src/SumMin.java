import java.util.Scanner;

public class SumMin {                       // виведення суми чисев введених в діапазон чисел А та В
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число А і число В для проведения мат. операції:");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int suma = 0;
        for (int i = A; i < B; i++) {
            suma += i;
        }
        System.out.println("Сума чисел в діапазоні між А та В дорівнює: " + suma);
        if (A > B) {
            System.out.println("Умова A < B недотримана !");
        } else ;
        {                                    // виведення в консоль непарних чисел
            Scanner newScanner = new Scanner(System.in);
            System.out.println("Введіть число А і число В для веденя непарних чисел:");
            int C = newScanner.nextInt();
            int D = newScanner.nextInt();
            for (int j = 1; j < D; j++) {
               if (j % 2 !=0 )
                System.out.println("Непаре число: " + j);
            }
            System.out.println("Розрахунок завершено =)");
        }
    }
}

