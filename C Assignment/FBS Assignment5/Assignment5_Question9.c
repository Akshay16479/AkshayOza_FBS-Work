#include <stdio.h>
void main()
{
	int i=0,j=0,k=0;
	
	for(i=1;i<=4;i++)     
	{	
		for(j=1;j<=4;j++)
		{
			if(i==1||j==1||i==4||j==4)
			printf("* ");	
			else
			printf("  ");
		}
			printf("\n");
	}
	
}
