import java.util.Scanner;

public class ifZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x1=0,x2=0,x3=0,x4=0,x5=0;
        while (n>0) {
             if (n > 60) {
                n -= 60;
                x5++;
             } else if (n * 15 < 125 && n > 0) {
                x1 = n;
                n -=n;
            } else {
                n -=10;
                x2++;
            }
        }
        System.out.println(x1+" "+x2+" "+x3);
    }
}
