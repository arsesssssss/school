import java.util.Scanner;

// https://informatics.mccme.ru/mod/statements/view3.php?chapterid=351

public class z351 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // вводим количество чисел
        System.out.print("Введите натуральное число от 1 до 12 включительно: ");
        int n = in.nextInt();
        if ((n <= 0) || (n > 12)){
            System.out.print("Введите число в соответствии с задачей!");
            return;
        }

        System.out.print("Введено число ");
        System.out.println(n);

        // вводим числа и считаем нули среди них
        double dFact = 1;
        for (int i = 2; i <= n; i++) {
            dFact = dFact * i;
        }

        // выводим !n
        System.out.print("!");
        System.out.print(n);
        System.out.print(" = ");
        System.out.println(dFact);
    }
}
