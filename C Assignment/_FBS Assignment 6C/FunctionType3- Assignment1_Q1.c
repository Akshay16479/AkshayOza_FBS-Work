#include <stdio.h>
void evenodd(int);
void main()

{
	int num=157;
	evenodd(num);
}

void evenodd(int num)
{
    if(num % 2 ==0)
	printf("Number is Even");
	else
	printf("Number is Odd");	
}

