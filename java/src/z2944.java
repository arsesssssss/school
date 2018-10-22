import java.util.Scanner;

public class z2944 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = n/100%10;
        int b = n/10%10;
        int c = n%10;
        System.out.println(a+b+c);
    }
}
