//Find factorial of given number.Input: n = 5

#include <stdio.h>
void Factorial();
void main()
{
	Factorial();
}

void Factorial()
{
	int num=6,fact=1;
	for(num;num>0;num--)
	  fact=fact*num;
	printf("Factorial is %d",fact);
}
