#include<stdio.h>

struct Time
{
    int hour;
    int min;
    int sec;
};

void main()
{
    struct Time t1;
    
    printf("Enter hour : ");
    scanf("%d", &t1.hour);
    
    printf("Enter minutes : ");
    scanf("%d", &t1.min);
    
    printf("Enter seconds : ");
    scanf("%d", &t1.sec);
    
    printf("Time = %d:%d:%d", t1.hour, t1.min, t1.sec);
}
