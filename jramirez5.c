// Juan Ramirez gomez

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
	
	int x = 5;
	float a = 40.534;
	char letter = 'b';
	double y = 22.45;
	int b[10] = {0,1,2,3,4,5,6,7,8,9};
	int i = 0;

	printf("Address x = %p \n",&x);
	printf("Address y = %p \n",&y);
	printf("Address a = %p \n",&a);
	printf("Address letter = %p \n",&letter);

	printf("Variable x = %d \n",x);
	printf("Variable y = %lf \n",y);
	printf("Variable a = %f \n",a);
       	printf("Variable letter = %c \n",letter);	
	
	if(x == 5)
	{
		int b = 9;
	}
	//b = 8;
	
	for(i = 0;i < 10;i++)
	{
		printf("b[%d] = %d \n",i,b[i]);
		printf("address is %p \n",&b[i]);
	}


	return EXIT_SUCCESS;


}
