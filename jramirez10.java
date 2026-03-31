//Juan Ramirez
/*
 * csc321
 * lab#10
 */
import java.util.Scanner;
public class jramirez10
{
	public static void main(String[]args)
	{
		double x = 0;
		double i = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter height: ");
		x = input.nextDouble();

		System.out.println("Please enter radius: ");
		i = input.nextDouble();

		System.out.println("The volume is: " + volume(x,i));

	}

	static double volume(double w,double  y)
	{
		double total  = Math.pow(y, 2) * w  * 3.14;
		return total;
	}

}
