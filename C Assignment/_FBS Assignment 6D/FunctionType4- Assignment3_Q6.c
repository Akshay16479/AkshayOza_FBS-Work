#include <stdio.h>

// Function declaration
int checkPrime(int );

void main()
{
    int num = 7;

    // Function call
    int res = checkPrime(num);

    if(res == 1)
        printf("Number is Prime");
    else
        printf("Number is Not Prime");
}

// Function definition
int checkPrime(int num)
{
    int i, flag = 1;  // assume prime

    for (i = 2; i < num; i++)
    {
        if (num % i == 0)
        {
            flag = 0;  // not prime
            break;     // no need to check further
        }
    }

    return flag;  // 1 = prime, 0 = not prime
}

