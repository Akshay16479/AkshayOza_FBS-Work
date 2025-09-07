#include <stdio.h>

// Function declarations
float total(float subj1, float subj2, float subj3, float subj4, float subj5);
float percent(float total);

void main()
{
    float subj1 = 75.00, subj2 = 92.52, subj3 = 87.11, subj4 = 66.00, subj5 = 71.48;

    float res1 = total(subj1, subj2, subj3, subj4, subj5);   // total score
    float res2 = percent(res1);                              // percentage

    printf("Total Score = %.2f, Percentage = %.2f\n", res1, res2);
}

// Function definition for total
float total(float subj1, float subj2, float subj3, float subj4, float subj5)
{
    return subj1 + subj2 + subj3 + subj4 + subj5;
}

// Function definition for percentage
float percent(float total)
{
    return (total / 500.0) * 100;
}

