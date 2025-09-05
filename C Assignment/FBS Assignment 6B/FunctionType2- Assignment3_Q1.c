#include <stdio.h>

int printNumbers();                                   // function declaration

void main()   
{
    int result;
    result = printNumbers();                           // store return value from function
}

int printNumbers()                                       // function definition
{
    int i;
    for (i = 1; i <= 10; i++)
    {
        printf("%d\n", i);
    }
    return 0;
}

