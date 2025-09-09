#include <stdio.h>

// Function declaration
void checkPalindrome(int* );

void main()
{
    int num = 121;

    // Function call
    checkPalindrome(&num);
}

// Function definition
void checkPalindrome(int *num)
{
    int p, rev = 0, temp = *num;

    for (*num; *num > 0;)
    {
        p = *num % 10;
        rev = rev * 10 + p;
        *num = *num / 10;
    }

    if (temp == rev)
        printf("No is Palindrome");
    else
        printf("No is Not Palindrome");
}

