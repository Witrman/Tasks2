import java.util.Scanner;

public class ifG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        if (a1==b1||a1==b2||a2==b1||a2==b2) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
