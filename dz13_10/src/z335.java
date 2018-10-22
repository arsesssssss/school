import java.util.Scanner;

// https://informatics.mccme.ru/mod/statements/view3.php?chapterid=335

public class z335 {
    private static boolean IsInteger(double f){
        boolean bResult = false;
        if ((f % 1) == 0) {
            bResult = true;
        }
        return bResult;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // вводим числа a и b
        //
        System.out.print("Введите a: ");
        int a = in.nextInt();
        //
        System.out.print("Введите b: ");
        int b = in.nextInt();

        if (!((a < b) && (a >= 0))){
            System.out.println("Введите чмсла, соответствующие условию задачи!");
            return;
        }

        // проверяем каждую точку на (a..b) на целочисленность квадратного корня
        for (int i = a; i <= b; i++) {
            double f = Math.sqrt(i);
            if (IsInteger(f)) {
                System.out.print(i);
                System.out.println(" - полный квадрат");
            }
        }
    }
}
