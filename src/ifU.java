import java.util.Scanner;

public class ifU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b==c) {
            System.out.println(3);
        } else if (a == b || c==b || b== a) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }
}
