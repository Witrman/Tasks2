import java.util.Scanner;

public class cyclEE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int b = sc.nextInt();
        double sum =1;
        for (int i = 1; i <= b; i++) {
            sum+=Math.pow(a,i);
        }
        System.out.println( sum);

    }
}
