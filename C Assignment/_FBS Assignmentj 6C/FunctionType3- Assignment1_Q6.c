#include <stdio.h>

// Function declaration
void calculate(int);

void main()
{
    int basic = 4900;

    // Function call
    calculate(basic);
}

// Function definition
void calculate(int basic)
{
    float da, ta, hra, total;

    if (basic <= 5000)
    {
        da  = 0.10 * basic;  
        ta  = 0.20 * basic;  
        hra = 0.25 * basic;   
    } 
    else 
    {
        da  = 0.15 * basic;   
        ta  = 0.25 * basic;   
        hra = 0.30 * basic;   
    }

    total = basic + da + ta + hra;
    printf("Total Salary = %.2f", total);
}

