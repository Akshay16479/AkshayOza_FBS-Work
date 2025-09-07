#include <stdio.h>

// Function declarations
void evenOdd(int ), primeCheck(int ), palindromeCheck(int ),
 posNegZero(int ), reverseNum(int ), sumDigits(int );

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
        evenOdd(num);
    else if(choice == 2)
        primeCheck(num);
    else if(choice == 3)
        palindromeCheck(num);
    else if(choice == 4)
        posNegZero(num);
    else if(choice == 5)
        reverseNum(num);
    else if(choice == 6)
        sumDigits(num);
    else
        printf("Invalid Choice!\n");
}

// Function definitions
void evenOdd(int num)
{
    if(num % 2 == 0)
        printf("%d is Even\n", num);
    else
        printf("%d is Odd\n", num);
}

void primeCheck(int num)
{
    int i, count = 0;
    for(i = 1; i <= num; i++)
    {
        if(num % i == 0)
            count++;
    }
    if(count == 2)
        printf("%d is Prime\n", num);
    else
        printf("%d is Not Prime\n", num);
}

void palindromeCheck(int num)
{
    int rev = 0, temp = num, p;
    while(temp > 0)
    {
        p = temp % 10;
        rev = rev * 10 + p;
        temp = temp / 10;
    }
    if(rev == num)
        printf("%d is Palindrome\n", num);
    else
        printf("%d is Not Palindrome\n", num);
}

void posNegZero(int num)
{
    if(num > 0)
        printf("%d is Positive\n", num);
    else if(num < 0)
        printf("%d is Negative\n", num);
    else
        printf("The number is Zero\n");
}

void reverseNum(int num)
{
    int rev = 0, temp = num, p;
    while(temp > 0)
    {
        p = temp % 10;
        rev = rev * 10 + p;
        temp = temp / 10;
    }
    printf("Reverse of %d is %d\n", num, rev);
}

void sumDigits(int num)
{
    int sum = 0, temp = num, p;
    while(temp > 0)
    {
        p = temp % 10;
        sum = sum + p;
        temp = temp / 10;
    }
    printf("Sum of digits of %d is %d\n", num, sum);
}

