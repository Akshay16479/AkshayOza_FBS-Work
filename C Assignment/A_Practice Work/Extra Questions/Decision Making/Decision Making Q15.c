#include<stdio.h>

void main()
{
	int i=0, j=0 ,k=0;
	
	for(i=1;i<=4;i++)
	{
		for(k=4;k>=i;k--)
		{
			printf(" ");
		}
		for(j=1;j<=i;j++)        //increasing part
		{
			printf(" *");
		
		}
		printf("\n");
	}
	
	for(i=3;i>=1;i--)
	{
      for(k=4;k>=i;k--)
		{
			printf(" ");
		}
		for(j=1;j<=i;j++)
		{
			printf(" *");
		}
		printf("\n");
	}
	
	
}
