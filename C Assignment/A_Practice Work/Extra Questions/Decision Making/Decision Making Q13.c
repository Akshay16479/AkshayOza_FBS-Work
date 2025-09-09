#include<stdio.h>

void main()
{
	int i=0, j=0;
	int count=1;
	for(i=1;i<=3;i++)
	{
		for(j=1;j<=5;j++)
		{
		   if((i + j) % 2 == 0)
                printf("1 ");
            else
                printf("0 ");
			
		}
		printf("\n");
	}
	
	
}
