import java.util.*;
class Exercise1
{
public static void main(String args[]){

System.out.println("Enter a number= ");
Scanner sc = new Scanner(System.in);   
 int num = sc.nextInt();
int sum=0;

while(num >0)
{
int mod = num % 10;
sum = sum + mod*mod*mod;
num = num / 10;
}
System.out.println("The sum of cubes of digits of the given number is " +sum);


}

}