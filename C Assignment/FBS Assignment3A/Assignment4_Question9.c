#include<stdio.h>

void main()
{
	int num=12345;
	int last_digit,first_digit,sum=0;
	
	last_digit=num%10;
	
	for(num;num>=10;)
	{
		num=num/10;
	}
	first_digit=num;
	sum=last_digit+first_digit;
	
	printf("%d",sum);
}
