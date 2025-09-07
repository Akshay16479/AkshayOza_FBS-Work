#include <stdio.h>

// Function declaration
int check(char);

void main()
{
    char temp = 'X';

    // Function call
    int res = check(temp);
    if(res == 1)
        printf("Character is Vowel");
    else
        printf("Character is Consonant");
}

// Function definition
int check(char temp)
{
    if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u' ||
        temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U')
    {
        return 1; // Vowel
    }
    else
    {
        return 0; // Consonant
    }
}

