#include <stdio.h>

float calculateBill();   // function declaration

void main()
{
    float final_amount;

    final_amount = calculateBill();   // function call

    printf("Final amount to pay %f", final_amount);
}

float calculateBill()   // function definition
{
    int price;
    char student;
    float discount = 0.0;

    printf("Enter the price of purchased items: ");
    scanf("%d", &price);

    printf("Are you a student? (y/n): ");
    scanf(" %c", &student);

    if (student == 'y' || student == 'Y')
    {
        if (price > 500)
            discount = 0.20 * price;
        else
            discount = 0.10 * price;
    }
    else
    {
        if (price > 600)
            discount = 0.15 * price;
        else
            discount = 0.0;
    }

    return price - discount;   // return final amount
}

