#include<stdio.h>
void Even(int),Odd(int);
void main()
{
	int num=25;
	Even(num);
	Odd(num);
	
}

void Even(int num)
{
	printf("\nEven Numbers are : \n");
	for(int i=1;i<=num;i++)
	{
	    if(i%2==0)
		printf("%d ",i);	
	}
}

void Odd(int num)
{
	printf("\nOdd Numbers are : \n");
		for(int i=1;i<=num;i++)
	{
		if(i%2!=0)
		printf("%d ",i);
	}	
}