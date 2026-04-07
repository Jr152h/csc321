#include <stdio.h>
#include <stdlib.h>
#include <math.h>


double lenght(double base, double height);

double  main(void)
{
	double a = 0;
	double b = 0;
	double hypotenuse = 0;
	printf("Enter the base of the triangle: ");
	scanf("%lf",&a);

	printf("Enter the height of the triangle: ");
	scanf("%lf",&b);


	hypotenuse = lenght(a,b);


	printf("The hypotenuse of the right triangle is %.2f \n",hypotenuse);

	return EXIT_SUCCESS;



}


double lenght(double base, double height)
{

	double calculation = (base * base) + (height * height);
	return sqrt(calculation);
	
}
