#include <stdio.h>

// Function declaration
void factorial(int );

void main()
{
    int num = 5;

    // Function call
    factorial(num);
}

// Function definition
void factorial(int num)
{
    int i = 1;
    int fact = 1;

    for (i; i <= num; i++)
    {
        fact = fact * i;
    }

    printf("%d", fact);
}

