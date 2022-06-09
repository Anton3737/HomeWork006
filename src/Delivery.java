import java.util.Scanner;

public class Delivery {
    public static int Factor(int N) {
        int factorial = 1;
        int i = 1;                      // Розрахунок факторіалу
        do {
            factorial = factorial * i;
            i++;
        }while (i <= N);
            return factorial;
    }                                           // Звязка методу Factor з інтовим значенням ( де N ) число факторіалу
    public static void main(String[] args) {
        System.out.println("введіть кількість клієнтів: ");
        Scanner custVar = new Scanner(System.in);           // Введення та виведення даних
        System.out.println("Існує " + Factor(custVar.nextInt()) + " маршрутів" + "для: "  + custVar.nextInt() +" клієнтів");
    }
}
