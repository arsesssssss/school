import java.util.Scanner;
public class z2950 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mins = ((45*n)+(n/2*5)+((n-1)/2*15));
        int hrs = mins/60;
        System.out.println((9+hrs)+" "+(mins%60));
    }
}