
//Write a C program to convert given minutes into hours and remaining minutes.

void main()
{

int minute, hour;

minute=182;

hour=(minute/60);

minute=(minute%60);

printf("%d,%d", hour, minute);
}
