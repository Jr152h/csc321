//Juan Ramirez-gomez
/*
 * csc321
 * lab#6
 */

public class jramirez6
{
	public static void main(String[]args)
	{
		int x = 5;
		int y = 6;
		double a = 5;
		double b = 6;

		int problem1 = 0;
		int problem2 = 0;
		int problem3 = 0;

		double Aproblem1 = 0;
		double Bproblem2 = 0;
		double Cproblem3 = 0;

		 problem1 = x+y*x/y-x;
		 problem2 = -x-y/x*y+x;
		 problem3 = x+y-x/y;

		System.out.println("Int problem #1 =  " + problem1);
		System.out.println("Int problem #2 =  " + problem2);
		System.out.println("Int problem #3 =  " + problem3);

		Aproblem1 = a+b*a/b-a;
		Bproblem2 = -a-b/a*b+a;
		Cproblem3 = a+b-a/b;

		System.out.println("Double problem #1 = " + Aproblem1);
		System.out.println("Double problem #2 = " + Bproblem2);
		System.out.println("Double problem #3 = " + Cproblem3);

	}
}


