import java.util.Scanner;
public class z112147 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n = in.nextFloat();
        float n1;
        float n2;
        float n3;
        float n4;
        n1 = n*n;
        n2 = n1*n1;
        n3 = n2*n2;
        n4 = n3*n1;
        System.out.printf("%.3f", n4);
    }
}