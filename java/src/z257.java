import java.util.Scanner;
public class z257 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ax = in.nextInt();
        int ay = in.nextInt();
        int bx = in.nextInt();
        int by = in.nextInt();

        if (((ax-bx==1)&&(ay-by==2))||((ax-bx==1)&&(ay-by==-2))||((ax-bx==-1)&&(ay-by==-2))|| ((ax-bx==-1)&&(ay-by==2))|| ((ax-bx==2)&&(ay-by==1))|| ((ax-bx==2)&&(ay-by==-1))|| ((ax-bx==-2)&&(ay-by==-1))|| ((ax-bx==-2)&&(ay-by==1)))
        {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
