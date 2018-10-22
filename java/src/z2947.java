import java.util.Scanner;
public class z2947 {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
        int a = n/60;
        int b = n%60;
        int c;
        if (a<24) {
            System.out.println(a+" "+b);
        }
        else {
            c = a%24;
            System.out.println(c+" "+b);
        }
    }
}
