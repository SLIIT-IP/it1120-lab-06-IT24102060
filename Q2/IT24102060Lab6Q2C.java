import java.util.Scanner;
public class IT24102060Lab6Q2C{
    public static void main(String[] args)
    {
        int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, sum;
        double avg;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 10 numbers:");
        System.out.print("Enter number 1:");
        num1 = input.nextInt();
        System.out.print("Enter number 2:");
        num2 = input.nextInt();
        System.out.print("Enter number 3:");
        num3 = input.nextInt();
        System.out.print("Enter number 4:");
        num4 = input.nextInt();
        System.out.print("Enter number 5:");
        num5 = input.nextInt();
        System.out.print("Enter number 6:");
        num6 = input.nextInt();
        System.out.print("Enter number 7:");
        num7 = input.nextInt();
        System.out.print("Enter number 8:");
        num8 = input.nextInt();
        System.out.print("Enter number 9:");
        num9 = input.nextInt();
        System.out.print("Enter number 10:");
        num10 = input.nextInt();

        System.out.println(" ");
        System.out.println("The numbers you entered are:");
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6 + " " + num7 + " " + num8 + " " + num9 + " " + num10);

        sum = num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;
        avg = sum/10;

        System.out.println(" ");
        System.out.println("Sum of the numbers:" + sum);
        System.out.print("Äverage of the numbers:" + avg);
    }
}