import java.util.Scanner;

public class cyclG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int b = sc.nextInt();
        int sum =0;
        if (x%2!=0) {x++;}
        for (int i = x; i <= b; i+=2) {
            System.out.println((i)+" ");
        }
    }
}
