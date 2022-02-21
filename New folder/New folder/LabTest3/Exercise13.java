import java.util.*;
class Exercise13
{
   public static void main(String args[])
        {
           Scanner scr=new Scanner(System.in);
           System.out.println("Enter the integers: ");
            String digit=scr.nextLine();
            StringTokenizer token=new StringTokenizer(digit);
            int dig=0,sum=0;
            System.out.println("Entered integers are : ");
            while(token.hasMoreTokens())
           {
            String s=token.nextToken();
            dig=Integer.parseInt(s);
            System.out.print(dig+" ");
            sum=sum+dig;
            }
    System.out.println();
    System.out.println("Sum is : "+sum);
  }
}