#include <stdio.h>
void main()
{
    int no, n;
    int i, sum;

    printf("Enter Number: ");
    scanf("%d", &n);

    printf("Perfect numbers between 1 and %d are: ", n);

    for(no = 1; no <= n; no++)   // loop through all numbers
    {
        sum = 0;

        for(i = 1; i < no; i++)   // find divisors less than number
        {
            if(no % i == 0)
                sum =sum+ i;   // add divisor
        }

        if(sum == no)   // perfect number condition
            printf("%d ", no);
    }
}

