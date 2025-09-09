#include <stdio.h>

// Function declaration
void checkArmstrong(int*);

void main()
{
    int num = 153;

    // Function call
    checkArmstrong(&num);
}

// Function definition
void checkArmstrong(int* num)
{
    int temp, p, arm = 0;

    temp = *num;  // keep original number safe

    while (temp > 0)
    {
        p = temp % 10;           // last digit
        arm = arm + (p * p * p); // cube and add
        temp = temp / 10;        // decrease number digit by digit
    }

    if (*num == arm)
        printf("No is Armstrong");
    else
        printf("No is Not Armstrong");
}

