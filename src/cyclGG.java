import java.util.Scanner;

public class cyclGG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double sum =0;
        for (int i = 0; i <= x; i++) {
            sum+=(Math.pow(-1.0,i))/((2.0*i)+1);
        }

        System.out.println( 4.0*sum);
    }
}
