package Lab;
import java.util.Scanner;

public class ex225 {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String strNum1, strNum2;
        double num1, num2, sum, diff, pro, quo1, quo2;
        System.out.println("Enter the first value\n");
        num1 = scanner.nextDouble();
        System.out.println("Enter the second value\n");

        num2 = scanner.nextDouble();
        System.out.println("Result:");
        sum = num1 + num2;
        System.out.println("num1 + num2 =" + sum);
        if(num1 >= num2)
        {
            diff = num1 - num2;
            System.out.println("num1 - num2 =" + diff);
        }
        if(num1 < num2)
        {
            diff = num2 - num1;
            System.out.println("num2 - num1 =" + diff);
        }
        pro = num1 * num2;
        System.out.println("num1 x num2 =" + pro);
        quo1 = num1 / num2;
        System.out.println("num1 : num2 =" + quo1);
        quo2 = num2 / num1;
        System.out.println("num2 : num1 =" + quo2);

    } 
    
}
