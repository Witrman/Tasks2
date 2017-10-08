import java.util.Scanner;

public class cyclB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum =1;
        for (int i = 1; i <= x; i++) {
            sum*=i;
        }
        System.out.println(sum);
    }
}
