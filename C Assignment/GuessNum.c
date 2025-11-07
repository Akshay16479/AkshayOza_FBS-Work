#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void main()
{
    int number, guess, attempts = 0;
    srand(time(0));                                            // Guess num jo generate hoga wo diff hoga each time,current time second it will change 
    number = rand() % 100 + 1;                                // Generate. random number between 1 and 100
    
    printf("Welcome to the Guess the Number Game!\n");
    printf("I have selected a number between 1 and 100.\n");
    printf("Can you guess it? Let's find out!\n");

    while (1) 
	{                                                       // Infinite loop starts here
        printf("Enter your guess: ");
        scanf("%d", &guess);
        attempts++;

        if (guess > number) {
            printf("Too high! Try again.\n");
        } else if (guess < number) {
            printf("Too low! Try again.\n");
        } else {
            printf("Congratulations! You guessed the number in %d attempts.\n", attempts);
            break;                                    // Exit loop ,loop ends
        }
    }

}
