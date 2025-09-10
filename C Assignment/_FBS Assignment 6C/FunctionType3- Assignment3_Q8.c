#include <stdio.h>

// Function declaration
void checkPrime(int num);

void main()
{
    int num = 7;

    // Function call
    checkPrime(num);
}

// Function definition
void checkPrime(int num)
{
    int i = 2,flag;

    for (i; i <num; i++)
    {
        if (num % i == 0)
         flag=0;
    }
            if(flag==0)
            printf("Number is Not Prime");
            else
            printf("Number is Prime");
}

