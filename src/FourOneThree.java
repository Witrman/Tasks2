import java.util.Scanner;

public class FourOneThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        for (int i = 1; i <= s; i++) {
            if (s%i ==0) {
                System.out.println(i );
            }
        }
    }
}
