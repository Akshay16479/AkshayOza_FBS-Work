#include <stdio.h>
void main()
{
	int i=0,j=0;
	
	for(i=1;i<=4;i++)      // increasing part
	{	
		for(j=1;j<=i;j++)
		{
			printf("*");	
		}
			printf("\n");
	}
	
	for(i=3; i>=1; i--)   // decreasing part
    {
        for(j=1; j<=i; j++)
        {
            printf("*");
        }
        printf("\n");
    }
		
}
