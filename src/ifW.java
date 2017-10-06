import java.util.Scanner;

public class ifW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a*a+b*b==c*c) {
            System.out.println("right");
        } else if(a+b<c|| b+a<c||b+c<a) {
            System.out.println("impossible");
        }
        else if (((a*a+b*b)<(c*c)))
        {
            System.out.println("obtuse");
        } else {
            System.out.println( "acute");
        }
    }
}
