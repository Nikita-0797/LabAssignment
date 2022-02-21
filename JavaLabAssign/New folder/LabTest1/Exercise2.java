import java.util.*;

class Exercise2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Select one of the light by number: ");
		System.out.println("1.Red");
		System.out.println("2.Yellow");
		System.out.println("3.Green");
		int choice = sc.nextInt();
	
		switch(choice)
		{
			case 1: System.out.println("Stop");
				break;

			case 2: System.out.println("Ready");
				break;

			case 3: System.out.println("Go");	
				break;
		}
	}
}