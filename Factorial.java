/*
    --- FACTORIAL ---

    Output:-
    Enter the number:
    5
    Factorial of the number: 120
 */
import java.util.*;
class Factorial
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Factorial fac = new Factorial();
        int n;
        System.out.println("Enter the number: ");
        n=in.nextInt();
        fac.calculate(n);
        in.close();
    }
    void calculate(int n)
    {
        if(n<0)
        {
            System.out.println("Negative Number");
            return;
        }
        int f=1;
        for(int i=1;i<=n;i++)
            f=f*i;
        System.out.println("Factorial of the number: "+f);
    }
}