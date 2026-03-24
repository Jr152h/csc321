//Juan Ramirez

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void)
{
	srand(time(NULL));
	int num;
	int rando =(rand() %20) + 1;

	

	
	do
	{
		printf("Enter a number between 1 - 20: ");
		scanf("%d", &num);


		if(num < 1 || num > 20)
		{
			printf("out of range please try in the range of 1 - 20\n");
	
		}


	
		
	}while(num < 1 || num > 20);



		if(num == rando)
                {
			for(int i = 0; i < num;i++)
			{
                        	printf("you guess right: %d\n ", num);
			}
                }
                
               
		 if(num > rando)
                 {
                     printf("you guess wrong and its higher than my number %d", rando);
                     
                 }
		if(num < rando)
                 {
                           printf("you guess wrong and its lower than my number %d", rando);
                           
                  }
                
	

	
	


	return EXIT_SUCCESS;
}
