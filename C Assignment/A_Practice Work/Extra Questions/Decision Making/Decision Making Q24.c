#include <stdio.h>

void main()
{
	int i,j;
	int count=1;
	char ch='A';
	
	for(i=1;i<=4;i++)
	{
		for(j=1;j<=4;j++)
		{
			if(i%2==0)
			printf("%c ",ch++);
			else
			printf("%d ",count++);
		}
		printf("\n");
	}
	  
}

