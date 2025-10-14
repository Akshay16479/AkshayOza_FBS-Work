#include <stdio.h>
#include <string.h>

struct mobile {
	int mid;
	char mname[50];
	int price;
	char brand[50];
};

void acceptmob(struct mobile *, int );
void displaymob(struct mobile *, int );

void main() {
	
	struct mobile mob[5];

	int choice;
	while (1) {
		printf("Menu:\n");
		printf("1. Add Mobile Detail\n");
		printf("2. show Mobile Detail\n");
		printf("3. exit\n");
		printf("Enter your choice: ");
		scanf("%d", &choice);

		switch (choice) {
			case 1:
				acceptmob(mob, 5);
				break;
			case 2:
				displaymob(mob, 5);
				break;
			case 3:
				return 0;
			default:
				printf("wrong input\n");
		}
	}
}

void acceptmob(struct mobile *m,int num) {
	for (int i = 0; i < num; i++) {
		printf("\nEnter Mobile ID: ");
		scanf("%d", &m[i].mid);

		printf("Enter Mobile Name: ");
		scanf(" %[^\n]", m[i].mname);

		printf("Enter Brand: ");
		scanf(" %[^\n]", m[i].brand);

		printf("Enter Price: ");
		scanf("%d", &m[i].price);
	}
}

void displaymob(struct mobile *m, int num) {
	printf(" MID  Name  Brand Price\n");

	for (int i = 0; i < num; i++) {
		printf("%d %s %s %d \n", m[i].mid, m[i].mname, m[i].brand, m[i].price);
	}
}
