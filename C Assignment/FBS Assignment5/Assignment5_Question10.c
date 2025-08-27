#include <stdio.h>
void main()
{
	int i=0,j=0,k=0;
	
	for(i=1;i<=5;i++)     
	{	
		for(j=1;j<=5;j++)
		{
			if(i==1||j==1||i==5||j==5||i==j)
			printf("* ");	
			else
			printf("  ");
		}
			printf("\n");
	}
	
}
