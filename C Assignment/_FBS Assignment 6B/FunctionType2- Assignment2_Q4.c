#include <stdio.h>

int checkDivisible();   // function declaration

void main()
{
    int result;

    result = checkDivisible();   // function call

    if (result == 1)
        printf("Number is Divisible by 3 and 5");
    else if (result == 2)
        printf("Number is Divisible by 3");
    else if (result == 3)
        printf("Number is Divisible by 5");
    else
        printf("Number is Not Divisible");
}

int checkDivisible()   // function definition
{
    int num;
    printf("Enter Number: ");
    scanf("%d", &num);

    if (num % 3 == 0 && num % 5 == 0)
        return 1;
    else if (num % 3 == 0)
        return 2;
    else if (num % 5 == 0)
        return 3;
    else
        return 4;
}

