#include <stdio.h>
void IsArm();
void main()
{
   IsArm();
}




void IsArm()
{
	int num = 153, p, arm = 0;
	int temp=num;                          // keep original number safe	                        
    while (temp > 0)
    {
      p = temp% 10;                     //  last digit
      arm = arm + (p * p * p);          // cube and add
      temp=temp/10;                     // decrease no by digit by digit
    }

    if (num == arm)
    printf("No is Armstrong");
    else
    printf("No is Not Armstrong");
}

