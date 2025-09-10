#include <stdio.h>

// Function declaration
void check(int a);

void main()
{
    int a = 525;
    check(a);
}

// Function definition
void check(int a)
{
   int  p = a % 10;
   int temp = a / 10;
   int q = temp % 10;
   int r = temp / 10;
    int reverse = (100 * p + 10 * q + r);

    if (a == reverse)
    printf("Number is Palindrome");
    else
    printf("Number is Not Palindrome");
}

