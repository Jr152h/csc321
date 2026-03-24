//Juan Ramirez-gomez
/*
 * csc321
 * lab#9
 */
import java.util.Random;
import java.util.Scanner;
public class jramirez9
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		int rand = random.nextInt(20)+1;
		int num;
	

		do
		{
			System.out.print("Enter a number between 1 - 20: ");
			 num = keyboard.nextInt();

			if(num < 1 || num > 20)
			{
				System.out.print("out of range please try in the range of 1 - 20\n");
			}

		}while(num < 1 || num > 20);

		if(num == rand)
		{
			for(int i = 0; i < num; i++)
			{
				System.out.print("you guess right: \n " + num);
			}
		}
		if(num > rand)
		{
			System.out.print("You guess wrong and its higher than my number " + rand);
		}
		if(num < rand)
		{
			System.out.print("You guess wrong and its lower than my number " + rand);
		}

	}

}

