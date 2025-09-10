#include <stdio.h>

// Function declaration
void check(int * );

void main()
{
    int num = 28;

    // Function call
    check(&num);
}

// Function definition
void check(int *num)
{
    int i=1,sum=0;

    while ( i < *num)
    {
        if (*num % i == 0)
             sum = sum + i;
        i++;
    }

    if (*num == sum)
        printf("No is Perfect Number");
    else
        printf("No is Not Perfect Number");
}

