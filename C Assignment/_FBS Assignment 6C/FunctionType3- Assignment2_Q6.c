#include <stdio.h>

// Function declaration
void check(int);

void main()
{
    int num;
    printf("Enter Number: ");
    scanf("%d", &num);

    // Function call
    check(num);
}

// Function definition
void check(int num)
{
    if (num % 3 == 0 && num % 5 == 0)
    {
        printf("Number is Divisible by 3 and 5");
    }
    else if (num % 3 == 0)
    {
        printf("Number is Divisible by 3");
    }
    else if (num % 5 == 0)
    {
        printf("Number is Divisible by 5");
    }
    else
    {
        printf("Number is Not Divisible");
    }
}

