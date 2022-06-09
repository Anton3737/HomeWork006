public class Figure {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
                                                             // Квадрат
            for (int j = 0; j < 30; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.print("\n");



        for (int i = 1; i < 20; i++) {
                                                            // прямокутний трикутник
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.print("\n");



        for (int i = 0; i <= 14; i++) {
            for (int j = 0; j <= 25 - i; j++) {
                System.out.print(' ');
            }                                                // рівносторонній
            for (int z = 1; z <= 2 * i - 1; z++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.print("\n");



        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 20 - i; j++) {
                System.out.print(' ');
            }
            for (int z = 1; z <= 2 * i - 1; z++) {
                System.out.print('*');
            }
            System.out.println();
             }                                                   // Ромб
            for (int y = 10; y >= 1; --y) {
            for (int j = 21; j > y  ; --j) {
                System.out.print(' ');
            }
            for (int z = 1; z < y * 2 ; z++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.print("\n");
    }
}
