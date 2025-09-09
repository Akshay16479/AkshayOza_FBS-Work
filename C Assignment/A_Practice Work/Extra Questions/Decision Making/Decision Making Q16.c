#include <stdio.h>

void main()
{
	int i;
	int num;
	printf("Enter Number :");
	scanf("%d",&num);

	for(i=1;i<=num;i++)
	{
		if(i%2!=0)
		printf(" %d ",i);
		
		else if(i%2==0)
		printf("%d",-i);
	}
         
}

