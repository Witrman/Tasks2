import java.util.Scanner;

public class FourOneFoureTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        for (int i = n; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                if (i%j ==0) {
                    sum+=j;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }
            sum=0;
            }


        }
    }
