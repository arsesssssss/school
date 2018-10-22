import java.util.Scanner;
public class z303 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if ((n % 10 == 1) && ((n < 10) || (n > 19))) {
            System.out.println(n + " korova");
        } else if (((n % 10 == 2) || (n % 10 == 3) || (n % 10 == 4)) && ((n < 10) || (n > 19))) {
            System.out.println(n + " korovy");
        } else if (((n % 10 == 5) || (n % 10 == 6) || (n % 10 == 7) || (n % 10 == 8) || (n % 10 == 9)) && ((n < 10) || (n > 19))) {
            System.out.println(n + " korov");
        } else {
            System.out.println(n + " korov");
        }
    }
        }

