import java.util.Scanner;

// https://informatics.mccme.ru/mod/statements/view3.php?chapterid=345

public class z345 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // вводим количество чисел
        System.out.print("Введите количество чисел: ");
        int n = in.nextInt();

        // вводим числа и считаем нули среди них
        int zeroCount = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Введите ");
            System.out.print(i+1);
            System.out.println("-е число: ");
            double d = in.nextDouble();

            if (d == 0) {
                zeroCount++;
            }
        }
        System.out.print("Нулей найдено: ");
        System.out.println(zeroCount);
    }
}
