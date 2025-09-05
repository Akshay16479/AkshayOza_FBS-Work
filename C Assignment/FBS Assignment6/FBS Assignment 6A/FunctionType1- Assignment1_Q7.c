#include <stdio.h>
double TotalSalary();
void main()
{
	double da,basic, ta, hra, total;
	TotalSalary();
	
	if (TotalSalary() <= 5000)
	{
        da  = 0.10 * basic;  
        ta  = 0.20 * basic;  
        hra = 0.25 * basic;   
    } 
	else 
	{
        da  = 0.15 * basic;   
        ta  = 0.25 * basic;   
        hra = 0.30 * basic;   
	}
total = basic + da + ta + hra;
	printf("%ld",total);
}

double TotalSalary()
{
 double basic = 4900;
}



	

