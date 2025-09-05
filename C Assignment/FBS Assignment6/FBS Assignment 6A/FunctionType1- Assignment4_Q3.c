#include <stdio.h>
void menuDriven();
void main()
{
    menuDriven();  // just call function
}

void menuDriven()
{
    int choice, num, i, rev, temp, sum, p, count;

    printf("Enter a number: ");
    scanf("%d", &num);

    printf("MENU:\n");
    printf("1. Check number is Even or Odd\n");
    printf("2. Check number is Prime or Not\n");
    printf("3. Check number is Palindrome or Not\n");
    printf("4. Check number is Positive, Negative or Zero\n");
    printf("5. Reverse the Number\n");
    printf("6. Find Sum of Digits\n");

    printf("\nEnter your choice: ");
    scanf("%d", &choice);
    

    // Using if-else 
    if(choice == 1) 
    {
        // Even or Odd
        if(num % 2 == 0)
            printf("%d is Even\n", num);
        else
            printf("%d is Odd\n", num);

    } 
    else if(choice == 2) 
    {
        // Prime check
        count = 0;
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
    else if(choice == 3) 
    {
        // Palindrome check
        rev = 0;
        temp = num;
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
    else if(choice == 4)
    {
        // Positive, Negative or Zero
        if(num > 0)
            printf("%d is Positive\n", num);
        else if(num < 0)
            printf("%d is Negative\n", num);
        else
            printf("The number is Zero\n");

    }
    else if(choice == 5) 
    {
        // Reverse number
        rev = 0;
        temp = num;
        while(temp > 0) 
        {
            p = temp % 10;
            rev = rev * 10 + p;
            temp = temp / 10;
        }
        printf("Reverse of %d is %d\n", num, rev);

    } 
    else if(choice == 6) 
    {
        // Sum of digits
        sum = 0;
        temp = num;
        while(temp > 0)
        {
            p = temp % 10;
            sum = sum + p;
            temp = temp / 10;
        }
        printf("Sum of digits of %d is %d\n", num, sum);

    } 
    else 
    {
        printf("Invalid Choice!\n");
    }
}


