#include<stdio.h>
void calBill(int*);
void main() {
	int unit;
	printf("Enter units:");
	scanf("%d",&unit);

	calBill(&unit);
}

void calBill(int *unit) {
	int amount;
	if(*unit<=50 )
	{
		amount= (30* *unit) ;
		printf("Bill amount for %d unit is %d ",*unit, amount);
	}
	else if(*unit>=51 && *unit<=150)
	{
	    amount= (40* *unit) ;
	    printf("Bill amount for %d unit is %d ",*unit, amount);
    }
    else
	{
	    amount = 50 * *unit;
        printf("Bill amount for %d units is %d\n", *unit, amount);
    }
}