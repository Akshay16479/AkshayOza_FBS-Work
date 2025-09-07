#include <stdio.h>

// Function declaration
int check(int );

void main()
{
    int year = 2025;

    int res = check(year);   // function call

    if (res == 1)
        printf("Leap Year\n");
    else
        printf("Not Leap Year\n");
}

// Function definition
int check(int year)
{
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        return 1;   // Leap Year
    else
        return 0;   // Not Leap Year
}

