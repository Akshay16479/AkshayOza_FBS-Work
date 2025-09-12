#include<stdio.h>
void main() {
	int arr[5];
	int i;
	int flag=0;

	printf("Enter Numbers: ");

	for(i=0; i<5; i++) {
		scanf("%d",&arr[i]);
	}
	int no;
	printf("Enter Number Which You Want To Search");
	scanf("%d",&no);

	for(i=0; i<5; i++) 
	{
		if(no==arr[i])
		
		{
			flag = 1;
			break;
		}
	}
	
	if(flag==1)
		printf("Number Found in Array");
	else
		printf("Number Not Found in Array");


}