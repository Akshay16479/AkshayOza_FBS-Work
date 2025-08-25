#include<stdio.h>
void main ()
{
	int num=28;
	int sum=0;
	int i=1;
	int temp=num;
	
	for(i;i<num;i++)
	{
		if(num%i==0)
		sum=sum+i;
	}
	if(temp==sum)
	printf("No is Perfect");
	else
	printf("No is Not Perfect");
}
