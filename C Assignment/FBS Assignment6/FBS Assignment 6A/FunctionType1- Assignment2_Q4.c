#include <stdio.h>

void Result();
void main()
{
	Result();
	if(Result>75)
    printf("Distinction");
	else if(Result>65)
	printf("First Class");
	else if(Result>55)
    printf("Second Class");
	else if(Result>=40)
	printf("Pass Class");
	else
    printf("Fail");	
}
void Result()
{	
	int mark;
    printf("Enter Mark");
    scanf("%d",&mark);
}

