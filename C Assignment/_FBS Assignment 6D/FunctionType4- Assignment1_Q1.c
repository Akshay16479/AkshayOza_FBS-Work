#include <stdio.h>

// Function declaration
int evenodd(int );

void main()
{
    int num = 157;

    int res = evenodd(num);   // store result

    if (res == 1)
        printf("Number is Even\n");
    else
        printf("Number is Odd\n");
}

// Function definition
int evenodd(int num)
{
if (num % 2 == 0)
return 1;
else return 0; 
}

