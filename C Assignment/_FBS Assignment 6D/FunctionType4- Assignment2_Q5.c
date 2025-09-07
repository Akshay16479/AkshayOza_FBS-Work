#include <stdio.h>

// Function declaration
int check(int );

void main()
{
    int num;
    printf("Enter Number: ");
    scanf("%d", &num);

    // Function call
    int res = check(num);

    if(res == 1)
        printf("Number is Divisible by 3 and 5");
    else if(res == 2)
        printf("Number is Divisible by 3");
    else if(res == 3)
        printf("Number is Divisible by 5");
    else
        printf("Number is Not Divisible");
}

// Function definition
int check(int num)
{
    if (num % 3 == 0 && num % 5 == 0)
        return 1;   // Divisible by 3 and 5
    else if (num % 3 == 0)
        return 2;   // Divisible by 3
    else if (num % 5 == 0)
        return 3;   // Divisible by 5
    else
        return 4;   // Not divisible
}

