import java.util.Scanner;

// https://informatics.mccme.ru/mod/statements/view3.php?chapterid=339

public class z339 {
    private static boolean IsInteger(float f){
        boolean bResult = false;
        if ((f % 1) == 0) {
            bResult = true;
        }
        return bResult;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // вводим одно целое (натуральное) число
        System.out.print("Введите натуральное число: ");
        int x = in.nextInt();
        System.out.print("Введено число ");
        System.out.println(x);

        // находим наименьший делитель
        int i = 0;
        for (i = 2; i < x; i++) {
            float f = (float)x / i;
            if (IsInteger(f)) {
                System.out.print("Наименьший делитель равен ");
                System.out.println(i);
                break;
            }
        }
        if (i >= (x-1)){
            System.out.println("Наименьший делитель не найден");
        }
    }
}
