import java.util.Scanner;

public class IT24102060Lab6Q1{
    public static void main(String[] args)
    {
        int num;
        double sqr, sqrRoot;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        num = input.nextInt();

        sqr = Math.pow(num,2);
        sqrRoot = Math.sqrt(num);

        System.out.println("The square of" + " " + num + " " + "is:" + sqr);
        System.out.println("The square root of" + " " + num + " " + "is:" + sqrRoot);
    }
}