#include<stdio.h>

int sumFirstLast();   

void main()
{
	sumFirstLast();
    printf("Sum of first and last digit is %d", sumFirstLast());  
}

int sumFirstLast()  
{
    int num = 12345;
    int last_digit, first_digit, sum = 0;

    last_digit = num % 10;

    while(num >= 10)    
    {
        num = num / 10;
    }
    first_digit = num;

    sum = last_digit + first_digit;
    return sum;
}

