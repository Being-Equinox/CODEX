/*
    --- Prime Number ---

    Output:-
    Enter the number:
    17
    Prime Number
 */
import java.util.*;
class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrimeNumber pn = new PrimeNumber();
        int n;
        System.out.println("Enter the number: ");
        n=in.nextInt();
        pn.check(n);
        in.close();
    }
    void check(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println("Not a Prime Number");
                return;
            }
        }
        System.out.println("Prime Number");
    }
}