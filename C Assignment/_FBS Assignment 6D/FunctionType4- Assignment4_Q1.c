#include <stdio.h>

// Function declarations
int evenOdd(int );
int primeCheck(int );
int palindromeCheck(int );
int posNegZero(int );
int reverseNum(int );
int sumDigits(int );

void main()
{
    int choice, num;

    printf("Enter a number: ");
    scanf("%d", &num);

    printf("\nMENU:\n");
    printf("1. Check number is Even or Odd\n");
    printf("2. Check number is Prime or Not\n");
    printf("3. Check number is Palindrome or Not\n");
    printf("4. Check number is Positive, Negative or Zero\n");
    printf("5. Reverse the Number\n");
    printf("6. Find Sum of Digits\n");

    printf("\nEnter your choice: ");
    scanf("%d", &choice);

    if(choice == 1)
    {
        int res = evenOdd(num);
        if(res == 1)
            printf("%d is Even\n", num);
        else
            printf("%d is Odd\n", num);
    }
    else if(choice == 2)
    {
        int res = primeCheck(num);
        if(res == 1)
            printf("%d is Prime\n", num);
        else
            printf("%d is Not Prime\n", num);
    }
    else if(choice == 3)
    {
        int res = palindromeCheck(num);
        if(res == 1)
            printf("%d is Palindrome\n", num);
        else
            printf("%d is Not Palindrome\n", num);
    }
    else if(choice == 4)
    {
        int res = posNegZero(num);
        if(res == 1)
            printf("%d is Positive\n", num);
        else if(res == 2)
            printf("%d is Negative\n", num);
        else
            printf("The number is Zero\n");
    }
    else if(choice == 5)
    {
        int rev = reverseNum(num);
        printf("Reverse of %d is %d\n", num, rev);
    }
    else if(choice == 6)
    {
        int sum = sumDigits(num);
        printf("Sum of digits of %d is %d\n", num, sum);
    }
    else
        printf("Invalid Choice!\n");
}

// Function definitions
int evenOdd(int num)
{
    if(num % 2 == 0)
        return 1;  // Even
    else
        return 0;  // Odd
}

int primeCheck(int num)
{
    int i, count = 0;
    for(i = 1; i <= num; i++)
    {
        if(num % i == 0)
            count++;
    }
    if(count == 2)
        return 1;  // Prime
    else
        return 0;  // Not Prime
}

int palindromeCheck(int num)
{
    int rev = 0, temp = num, p;
    while(temp > 0)
    {
        p = temp % 10;
        rev = rev * 10 + p;
        temp = temp / 10;
    }
    if(rev == num)
        return 1;  // Palindrome
    else
        return 0;  // Not Palindrome
}

int posNegZero(int num)
{
    if(num > 0)
        return 1;  // Positive
    else if(num < 0)
        return 2;  // Negative
    else
        return 3;  // Zero
}

int reverseNum(int num)
{
    int rev = 0, temp = num, p;
    while(temp > 0)
    {
        p = temp % 10;
        rev = rev * 10 + p;
        temp = temp / 10;
    }
    return rev;
}

int sumDigits(int num)
{
    int sum = 0, temp = num, p;
    while(temp > 0)
    {
        p = temp % 10;
        sum = sum + p;
        temp = temp / 10;
    }
    return sum;
}

