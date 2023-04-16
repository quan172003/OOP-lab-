package b1;

import java.util.Scanner;
import java.lang.Math;

public class ex226 {

    public static double firstone(double a, double b, double c){
        double result;
        result = (c - b)/a;
        return result;
    }

    public static void firsttwo(double a, double b, double m, double c, double d, double n){

        double x, y;
        if((a/c)==(b/d) && (a/c)==(m/n))
        {
            System.out.println("There are wealth of access");
        }
        else if((a/c)==(b/d) && (a/c)!=(m/n))
        {
            System.out.println("There is no solution");
        }
        else
        {
        y = (n * a - m * c)/(d * a - b * c);
        x = (m - b*y)/a;
        System.out.println("'The solution:\nx = "+x+"\ny = "+y);
        }
    }

    public static void secondone(double a, double b, double c, double d){
            double denta;
            double x1, x2;

            denta = b*b - 4*a*c;

            if(denta < 0)
            {
                System.out.println("There is no solution");
            }
        
            else if(denta == 0)
            {
                x1 = b / (2 *a);
                System.out.println("There is one solution: x =" + x1);
            }
            else
            {
                x1 = (b + Math.sqrt(denta))/(2*a);
                x2 = (b - Math.sqrt(denta))/(2*a);
                System.out.println("There is two solution:\nx1 = "+ x1 +"\nx2 = "+ x2);
            }
    }

    public static void main(String argc[]){
        
        java.util.Scanner scanner = new Scanner(System.in);

        int a;
        double a1, b1, c1, result1;
        double a2, b2, c2, d2, m2, n2;
        double a3, b3, c3, d3;

        System.out.println("\tMENU\n   Solve problem." );
        System.out.println("1: first-degree equation with one variable.");
        System.out.println("2: first-degree equation with two variables.");
        System.out.println("3: second-degree equation with one variable.");
        System.out.println("'Enter the case:");
        a = scanner.nextInt();

        switch(a){
            case 1:       
                    
            System.out.println("Equation form: ax + b = c");

            System.out.println("Enter a:");
            a1 = scanner.nextDouble();
            System.out.println("Enter b:");
            b1 = scanner.nextDouble();
            System.out.println("Enter c:");
            c1 = scanner.nextDouble();

            result1 = firstone(a1, b1, c1);

            System.out.println("The result: x =" + result1);

                break;

            case 2:

            System.out.println("Equation form: ax + by = m; cx + dy = n");
            System.out.println("Enter a:");
            a2 = scanner.nextDouble();
            System.out.println("Enter b:");
            b2 = scanner.nextDouble();
            System.out.println("Enter m:");
            m2 = scanner.nextDouble();
            System.out.println("Enter c:");
            c2 = scanner.nextDouble();
            System.out.println("Enter d:");
            d2 = scanner.nextDouble();
            System.out.println("Enter n:");
            n2 = scanner.nextDouble();
            firsttwo(a2, b2, m2, c2, d2, n2);
                break;
            case 3:

            System.out.println("Eqution form: ax^2 + bx + c = d");
            System.out.println("Enter a:");
            a3 = scanner.nextDouble();
            System.out.println("Enter b:");
            b3 = scanner.nextDouble();
            System.out.println("Enter c:");
            c3 = scanner.nextDouble();
            System.out.println("Enter d:");
            d3 = scanner.nextDouble();
            secondone(a3, b3, c3, d3);
                break;
            default:
        }
    }
    
}
