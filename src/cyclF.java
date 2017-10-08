import java.util.Scanner;

public class cyclF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum =0;
        int s=0;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <=i; j++) {
s+=j;
            }
            sum+=s;
            s=0;
        }
        System.out.println(sum);
    }
}
