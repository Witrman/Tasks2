import java.util.Scanner;

public class cyclD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int c= fuck(n)/(fuck(k)*(fuck(n-k)));
        System.out.println(c);

    }
    public static int fuck(int f)
    {
        int sum=1;
        for (int i = 1; i <= f; i++) {
            sum*=i;
        }
        return sum;
    }
}
