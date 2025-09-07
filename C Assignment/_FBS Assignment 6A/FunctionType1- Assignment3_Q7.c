#include<stdio.h>
void IsPrime;
void main()
{
	IsPrime();
}

void IsPrime()
{
    int num=8,i=2,flag;
	for(i;i<num,i++)
	{
		if(num%i==0)
		flag=0;
	}
	if(flag==0)
	printf("not prime");
	else
	printf("prime");
	
}
