import java.util.Scanner;

public class ifV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double D = (b*b)-(4*a*c);
        if(D>0)
        {
            double x1,x2;
            x1= (-b + Math.sqrt(D))/(2*a);
            x2= (-b - Math.sqrt(D))/(2*a);
            System.out.println(x1+" "+x2);
        } else if (D==0)
        {
            double x;
            x = -b / (2 * a);
            System.out.println( x);
        }

    }
}
