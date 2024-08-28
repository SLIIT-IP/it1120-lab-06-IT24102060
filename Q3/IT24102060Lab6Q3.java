import java.util.Scanner;
public class IT24102060Lab6Q3{
    public static void main(String[] args)
    {
        int num;
        int sum_Of_squares = 0;
        int count = 0;
        double rms;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter positive integers (terminate input with -99):");

        while(true)
        {
            System.out.print("Enter a number:");
            num = input.nextInt();

            if(num==-99)
            {
                break;
            }
            else if(num<0) 
            { 
                System.out.println("Invalid input, please enter a positive integer or -99 to terminate");
            }
            else
            {
                sum_Of_squares += Math.pow(num, 2);
                count++;
            }
        }

            if(count>0)
            {
                rms = Math.sqrt(sum_Of_squares/count);
                System.out.print("The Root Mean Square (RMS) is: " + rms);
            }
    }
}