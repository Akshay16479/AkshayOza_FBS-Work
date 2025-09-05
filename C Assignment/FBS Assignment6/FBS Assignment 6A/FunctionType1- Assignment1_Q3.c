#include <stdio.h>
void yearLeap();
void main()
{
	yearLeap();	
}

void yearLeap()
{
    int year=2025;
    
	(year%4 == 0 && year%100 != 0 || year%400 == 0 ? printf("Leap Year") : printf("Not Leap Year"));
}
