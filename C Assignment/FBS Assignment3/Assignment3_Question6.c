//Find factorial of given number.Input: n = 5

#include <stdio.h>

void main()
{
	int num=5,a=1;
	int temp=num;
	while(num>0)
	{   a=a*num;
    	num=num-1;
	}
	
	printf("Factorial is %d",a);

}
