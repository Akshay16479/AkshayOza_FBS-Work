#include <stdio.h>

// Function declaration
void check(int *year);

void main()
{
    int year = 2025;

    // Function call
    check(&year);
}

// Function definition
void check(int *year)
{
    if (*year % 4 == 0 && *year % 100 != 0 || *year % 400 == 0)
    {
        printf("Leap Year");
    }
    else
    {
        printf("Not Leap Year");
    }
}

