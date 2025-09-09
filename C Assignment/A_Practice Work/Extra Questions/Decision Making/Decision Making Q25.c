#include <stdio.h>

void main()
{
	int i,j,k;
	
	for(i=1;i<=4;i++)
	{
		for(k=i;k>=2;k--)
		{
			printf("%d",k);
		}
		for(j=1;j<=i;j++)
		{ 
			printf("%d",j);
		}
		
		printf("\n");
	}


	  
}

