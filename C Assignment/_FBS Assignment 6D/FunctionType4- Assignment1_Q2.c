#include <stdio.h>

// Function declaration
int check(int);

void main()
{
    int a = 525;

    int res = check(a);   // function call

    if (res == 1)
        printf("Number is Palindrome\n");
    else
        printf("Number is Not Palindrome\n");
}

// Function definition
int check(int a)
{
    int p = a % 10;
    int temp = a / 10;
    int q = temp % 10;
    int r = temp / 10;
    int reverse = (100 * p + 10 * q + r);

    if (a == reverse)
        return 1;   // Palindrome
    else
        return 0;   // Not Palindrome
}

