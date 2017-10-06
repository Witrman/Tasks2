import java.util.Scanner;

public class ifF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b) {b=a;  }else {a=b;}
        if (b>c) {
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}
