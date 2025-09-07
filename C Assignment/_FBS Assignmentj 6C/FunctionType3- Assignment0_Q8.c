#include <stdio.h>

// Function declaration
void convert(int minute);

void main()
{
    int minute = 182;

    // Function call
    convert(minute);
}

// Function definition
void convert(int minute)
{

    int hour = (minute / 60);
    int min = (minute % 60);

    printf("Hours = %d, Minutes = %d", hour, min);
}

