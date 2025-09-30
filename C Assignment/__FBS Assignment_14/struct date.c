#include<stdio.h>
#include<string.h>   // for strcpy

struct Date
{
    int day;
    int month;
    int year;
};

void main()
{
    struct Date d1;
    
    d1.day = 30;
    d1.month = 9;
    d1.year = 2025;

    printf("Date = %d-%d-%d", d1.day, d1.month, d1.year);
}
