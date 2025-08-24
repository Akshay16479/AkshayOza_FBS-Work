#include <stdio.h>

void main()
{
	int num=12345;
	int first,last,sum;

	last=num%10;
	
  
	while(num>=10)
	{
		num=num/10;
	}
	
	first=num;
	sum=last+first;
	
	printf("%d",sum);
	
}
