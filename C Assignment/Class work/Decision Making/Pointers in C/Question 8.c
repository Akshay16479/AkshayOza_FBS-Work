#include <stdio.h>

// Function declaration
void printPrimes(int* );

void main()
{
    int n;

    printf("Enter Number: ");
    scanf("%d", &n);

    // Function call
    printPrimes(n);
}

// Function definition
void printPrimes(int *n)
{
    int no, i, count;

    printf("Prime numbers between 1 and %d are: ", n);

    for (no = 2; no <= n; no++)
    {
        count = 0;

        for (i = 1; i <= no; i++)
        {
            if (no % i == 0)
                count++;
        }

        if (count == 2)
            printf("%d ", no);
    }
}

