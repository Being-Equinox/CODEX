/*
    --- REVERSE NUMBER ---

    Output:-
    Enter the number:
    457
    Reversed Number: 754
 */
import java.util.*;
class ReverseNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ReverseNumber rn = new ReverseNumber();
        int n;
        System.out.println("Enter the number: ");
        n=in.nextInt();
        rn.calculate(n);
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
            s=s*10+d;
            n=n/10;
        }
        System.out.println("Reversed Number: "+s);
    }
}