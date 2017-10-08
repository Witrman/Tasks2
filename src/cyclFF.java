import java.util.Scanner;

public class cyclFF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double sum =0;
        for (int i = 1; i <= x; i++) {
            sum+=(1.0/(i*i));
        }
        System.out.printf("%2f",sum);
    }
}
