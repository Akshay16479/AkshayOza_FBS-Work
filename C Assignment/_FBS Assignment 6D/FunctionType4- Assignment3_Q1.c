#include <stdio.h>

// Function declaration
int check(int);

void main()
{
    int num = 28;

    // Function call
    int res = check(num);

    if(res == 1)
        printf("No is Perfect Number");
    else
        printf("No is Not Perfect Number");
}

// Function definition
int check(int num )
{
    int i = 1, sum = 0;

    while (i < num)
    {
        if (num % i == 0)
            sum = sum + i;
        i++;
    }

    if (num == sum)
        return 1;   // Perfect Number
    else
        return 0;   // Not Perfect Number
}

