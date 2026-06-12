/*
    --- SUM OF DIGITS ---

    Output:-
    Enter the Number:
    347
    Sum Of Digits: 14
 */
import java.util.*;
class SumOfDigits
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        SumOfDigits sod = new SumOfDigits();
        int n;
        System.out.println("Enter the Number: ");
        n=in.nextInt();
        sod.calculate(n);
        in.close();
    }
    void calculate(int n)
    {
        if(n<0)
        {
            System.out.println("Negative Number");
            return;
        }
        int s=0,d;
        while(n!=0)
        {
            d=n%10;
            s=s+d;
            n=n/10;
        }
        System.out.println("Sum Of Digits: "+s);
    }
}