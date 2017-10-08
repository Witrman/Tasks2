import java.util.Scanner;

public class cyclE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum =0;
        for (int i = 2; i <= x; i++) {
            sum+=(i-1)*i;
        }
        System.out.println(sum);
    }
}
