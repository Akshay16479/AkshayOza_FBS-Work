#include <stdio.h>

// Function declaration
int checkArmstrong(int );

void main()
{
    int num = 153;

    // Function call
    int res = checkArmstrong(num);

    if(res == 1)
        printf("No is Armstrong");
    else
        printf("No is Not Armstrong");
}

// Function definition
int checkArmstrong(int num)
{
    int temp, p, arm = 0;

    temp = num;  // keep original number safe

    while (temp > 0)
    {
        p = temp % 10;           // last digit
        arm = arm + (p * p * p); // cube and add
        temp = temp / 10;        // decrease number digit by digit
    }

    if (num == arm)
        return 1;  // Armstrong
    else
        return 0;  // Not Armstrong
}

