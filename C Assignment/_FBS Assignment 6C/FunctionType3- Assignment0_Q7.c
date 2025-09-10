#include <stdio.h>

// Function declaration
void result(float subj1, float subj2, float subj3, float subj4, float subj5);

void main()
{
    float subj1 = 75.00, subj2 = 92.52, subj3 = 87.11, subj4 = 66.00, subj5 = 71.48;

    // Function call
    result(subj1, subj2, subj3, subj4, subj5);
}

// Function definition
void result(float subj1, float subj2, float subj3, float subj4, float subj5)
{
    

    float total_score = subj1 + subj2 + subj3 + subj4 + subj5;
    float percentage  = (total_score / 500.0) * 100;

    printf("Total Score = %.2f, Percentage = %.2f", total_score, percentage);
}

