#include <stdio.h>
void ArmStrong(); 
void main()
{
	ArmStrong();
}

void ArmStrong()
{  
    int no, n;
    int sum, digit, temp;

    printf("Enter Number: ");
    scanf("%d", &n);
	printf("Armstrong numbers between 1 and %d are: ", n);

    for(no=1; no<=n; no++)                              // loop through numbers
    {
        temp = no;                                   // store original number
        sum = 0;

        while(temp > 0)                               // extract digits
        {
            digit = temp % 10;                          // get last digit
            sum = sum + (digit*digit*digit);        // cube and add
            temp = temp / 10;                        // reduce number
        }

        if(sum == no)                                // check Armstrong condition
            printf("%d ", no);
    }
}
