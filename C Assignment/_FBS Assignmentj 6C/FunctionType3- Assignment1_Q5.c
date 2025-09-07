#include <stdio.h>

// Function declaration
void check(char);

void main()
{
    char temp = 'C';

    // Function call
    check(temp);
}

// Function definition
void check(char temp)
{
    if (temp >= 'A' && temp <= 'Z')
    {
        printf("Character is in Uppercase");
    }
    else
    {
        printf("Character is in Lowercase");
    }
}

