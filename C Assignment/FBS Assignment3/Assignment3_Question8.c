#include<stdio.h>

void main()
{
	int num=8;
	int i=2;
	int flag;
	
	while(i<num)
	{
		if(num%i==0)
		flag=0;
	i++;
	}
	if(flag==0)
	printf("not prime");
	else
	printf("prime");
	
}
