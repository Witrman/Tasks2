import java.util.Scanner;

public class ifZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x1=0,x2=0,x3=0,x4=0,x5=0;
        while (n>0) {
            if (n > 60) {
                n -= 60;
                x5++;
            } else if(n>20) {
                n -= 20;
                x4++;
            }else if(n>10) {
                n -= 10;
                x3++;
            }  else if (n * 15 < 70  ) {
                x1 = n;
                n -= n;
            } else {
                n -= 5;
                x2++;
            }
        }
        System.out.println(x1+" "+x2+" "+x3+" "+x4+" "+x5);
    }
}
