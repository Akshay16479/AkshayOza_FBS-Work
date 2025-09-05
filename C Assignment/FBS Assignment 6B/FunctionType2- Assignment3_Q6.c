#include <stdio.h>

int factorial();   // function declaration

void main()
{
	factorial();
    printf("%d", factorial());   
}

int factorial()   
{
    int num = 5;
    int fact = 1, i;

    for(i = 1; i <= num; i++)
    {
        fact = fact * i;
    }

    return fact;   
}

