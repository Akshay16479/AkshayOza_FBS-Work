#include <stdio.h>
int evenodd();
void main()
{
	evenodd();
	if(evenodd()==1)
	printf("No is Even");
	else
	printf("No is Odd");
}

int evenodd()
{
	int num=157;
	if(num % 2 ==0)
	return 1;
	
    else
    return 0;
}


