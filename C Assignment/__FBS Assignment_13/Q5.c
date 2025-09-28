#include<stdio.h>
#include<stdlib.h>
void main() {
	int*arr=(int*)malloc(5*sizeof(int));
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
		flag=1;
	}
	if(flag==1)
		printf("Number Found in Array");
	
		else 
	printf("Number Not Found in Array");
	
free(arr);

}