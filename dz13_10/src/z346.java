import java.util.Scanner;

// https://informatics.mccme.ru/mod/statements/view3.php?chapterid=346

public class z346 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // вводим количество чисел
        System.out.print("Введите количество чисел: ");
        int n = in.nextInt();

        // вводим числа и считаем нули среди них
        int zeroCount = 0;
        int posCount = 0;
        int negCount = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Введите ");
            System.out.print(i+1);
            System.out.println("-е число: ");
            double d = in.nextDouble();

            if (d == 0) {
                zeroCount++;
            }
            if (d > 0) {
                posCount++;
            }
            if (d < 0) {
                negCount++;
            }
        }

        // выводим результат в виде, показанном на сайте
        System.out.print(zeroCount);
        System.out.print(" ");

        System.out.print(posCount);
        System.out.print(" ");

        System.out.println(negCount);
    }
}
