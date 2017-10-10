import java.util.Scanner;

public class cyclH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double sum =0;
        for (int i = 1; i <= a; i++) {
            sum+=sc.nextDouble();
        }
        System.out.println(sum);
    }
}
