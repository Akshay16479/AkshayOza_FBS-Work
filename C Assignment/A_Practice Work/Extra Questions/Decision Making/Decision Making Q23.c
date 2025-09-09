#include <stdio.h>

void main()
{
	int i,j,k;
	
	for(i=1;i<=4;i++)
	{
		for(k=4;k>=i;k--)
		{
			printf(" ");
		}
		for(j=1;j<=i;j++)
		{ 
			printf("%d",j);
		}
		for(j = i - 1; j >= 1; j--)
        {
            printf("%d", j);
        }
		printf("\n");
	}


	  
}

