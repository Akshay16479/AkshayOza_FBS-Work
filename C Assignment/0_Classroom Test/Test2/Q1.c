#include<stdio.h>
void chkNum(int*);
void main() {
	int no;
	printf("Enter no:");
	scanf("%d",&no);

	chkNum(&no);
}

void chkNum(int *no) {
	if(*no>0)
		printf("Number is Positive");
	else if(*no<0)
		printf("Number is Negative");
	else
		printf("Number is Neutral");
}