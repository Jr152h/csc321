//Juan Ramirez
/*
 * csc321
 * Midterm #1
 */

	import java.util.Scanner;

	public class jramirezmidterm1
	{
		public static void main(String[]args)
		{
			Scanner keyboard = new Scanner(System.in);

			System.out.print("Enter a number between 10 and 20: ");
			int x = keyboard.nextInt();

			int z = 12;

			if(x > z)
			{
				System.out.print("Sorry but you guess a high number");
			}
			if(x < z)
			{
				System.out.print("Sorry but you guess a low number");
			}
			if(x == z)
			{
				System.out.print("CONGRATS you guess right");
			}

		}
	}




