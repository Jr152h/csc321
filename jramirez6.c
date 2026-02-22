// Juan Ramirez - gomez

#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main(void)
{
	int x = 5;
	int y = 6;
	double c = 5;
	double v = 6;

	int total1 = 0;
	int total2 = 0;
	int total3 = 0;
	double dtotal = 0;
	double ftotal = 0;
	double etotal = 0;

	total1 = x+y*x/y-x;
	total2 = -x-y/x*y+x;	
	total3 = x+y-x/y;
	
	dtotal = c+v*c/v-c;
	ftotal = -c-v/c*v+c;
	etotal = c+v-c/v;
	
	
	printf("Integer result#1 = %d \n",total1);
	printf("Integer result#2 = %d \n",total2);
	printf("Integer result#3 = %d \n",total3);
	
	
	
	
	printf("double total#1 = %lf \n",dtotal);
	printf("doulbe total#2 = %lf \n",ftotal);
	printf("double total#3 = %lf \n",etotal);


	return EXIT_SUCCESS;
}
