#include <stdio.h>

// Function declaration
int checkPalindrome(int );

void main()
{
    int num = 121;

    // Function call
    int res = checkPalindrome(num);

    if(res == 1)
        printf("No is Palindrome");
    else
        printf("No is Not Palindrome");
}

// Function definition
int checkPalindrome(int num)
{
    int p, rev = 0, temp = num;

    for (; num > 0;)
    {
        p = num % 10;
        rev = rev * 10 + p;
        num = num / 10;
    }

    if (temp == rev)
        return 1;  // Palindrome
    else
        return 0;  // Not Palindrome
}

