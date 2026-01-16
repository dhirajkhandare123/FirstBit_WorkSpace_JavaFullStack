#include<stdio.h>
#include<string.h>
#include<stdlib.h>
typedef struct Employee {
	int id;
	char name[30];
	double salary;
} Employee;

void addEmp(Employee*,int);
void displayAllEmp(Employee*,int);
void searchEmp(Employee*,int);
int searchById(int,int,Employee*);
int searchByName(char*,int,Employee*);
void updateEmp(Employee*,int);
int deleteEmp(Employee*,int);
void display(Employee*,int);
void main() {
	printf("\t--- WELCOME TO EMPLOYEE MANAGEMENT SYSTEM ---");
	int size,choice;
	printf("\n----- How many employees you want to store ? -----");
	scanf("%d",&size);
	Employee* empArr = (Employee*)malloc(sizeof(Employee)*size);

	do {
		printf("\n\n\t1.Add");
		printf("\n\t2.Delete");
		printf("\n\t3.Search");
		printf("\n\t4.Update");
		printf("\n\t5.Display");
		printf("\n\t10.Exit");
		printf("\nEnter your choice : ");
		scanf("%d",&choice);

		switch(choice) {
			case 1: {
				addEmp(empArr,size);
				break;
			}
			case 2: {
				int result = deleteEmp(empArr,size);
				if(result==1)
					size--;
				break;
			}
			case 3: {
				searchEmp(empArr,size);
				break;
			}
			case 4: {
				updateEmp(empArr,size);
				break;
			}
			case 5: {
				displayAllEmp(empArr,size);
				break;
			}
			case 10: {
				printf("Bye Bye !!!");
				break;
			}
			default: {
				printf("--- INVALID CHOICE! ---");
				break;
			}
		}
	} while(choice!=10);
	printf("\n--- Closing the Application ---");
}
void addEmp(Employee* ptr,int s) {
	int i;
	for(i=0; i<s; i++) {
		printf("\n\t--- Employee %d Info ---\n",i+1);
		printf("Enter the id : ");
		scanf("%d",&ptr[i].id);
		printf("Enter the name : ");
		fflush(stdin);
		gets(ptr[i].name);
		fflush(stdin);
		printf("Enter the salary : ");
		scanf("%lf",&ptr[i].salary);
		printf("\t--- Employee Added! ---");
	}
}
void displayAllEmp(Employee* ptr,int s) {
	int i;
	printf("\n\t -: All Employees Details :- ");
	for(i=0; i<s; i++) {
		printf("\n\n--- Employee %d : ---",i+1);
		printf("\nId : %d",ptr[i].id);
		printf("\nName : %s",ptr[i].name);
		printf("\nSalary : %lf",ptr[i].salary);
	}
}
void searchEmp(Employee* ptr,int s) {
	int ch,tId;
	char tName[30];

	do {
		printf("\n\t --- Search Menu ---");
		printf("\n\t1.Search by ID");
		printf("\n\t2.Search by NAME");
		printf("\n\t3.Back to main menu");
		printf("\nEnter your choice : ");
		scanf("%d",&ch);

		switch(ch) {
			case 1: {
				printf("\nEnter employee ID you want to search ?\n");
				scanf("%d",&tId);
				int index = searchById(tId,s,ptr);
				if(index==-1)
					printf("\n\t--- Employee Not Found ---");
				break;
			}
			case 2: {
				printf("\nEnter employee NAME you want to serach ?\n");
				fflush(stdin);
				gets(tName);
				fflush(stdin);
				int index = searchByName(tName,s,ptr);
				if(index==-1)
					printf("\n\t--- Employee Not Found ---");
				break;
			}
			case 3: {
				break;
			}
			default: {
				printf("\n\t--- INVALID INPUT! ---");
				break;
			}
		}
	} while(ch!=3);
}
int searchById(int tId,int s,Employee* arr) {
	int i;
	for(i=0; i<s; i++) {
		if(tId == arr[i].id) {
			printf("\n\t--- Employee Found ---");
			display(arr,i);
			return i;
		}
	}
	return -1;
}
int searchByName(char* tName,int s,Employee* ptr) {
	int i;
	for(i=0; i<s; i++) {
		if(strcasecmp(tName,ptr[i].name) == 0) {
			printf("\n\t--- Employee Found ---");
			display(ptr,i);
			return i;
		}
	}
	return -1;
}
void updateEmp(Employee* ptr,int s) {
	int tId,ch;
	printf("Enter ID you want to update ? \n");
	scanf("%d",&tId);

	int index = searchById(tId,s,ptr);
	if(index!=-1) {
		do {
			printf("\n--- Which data you want to update ? ---");
			printf("\n\t1.Name");
			printf("\n\t2.Salary");
			printf("\n\t3.Back to main menu");
			printf("\nEnter your choice : ");
			scanf("%d",&ch);

			switch(ch) {
				case 1: {
					char upName[30];
					printf("\nEnter new Name : ");
					fflush(stdin);
					gets(upName);
					fflush(stdin);

					strcpy(ptr[index].name,upName);
					printf("\n--- Name updated! ---");
					break;
				}
				case 2: {
					double upSalary;
					printf("\nEnter new Salary : ");
					scanf("%d",&upSalary);

					ptr[index].salary = upSalary;
					printf("\n--- Salary updated! ---");
					break;
				}
				case 3: {
					break;
				}
				default: {
					printf("\n\t--- INVALID INPUT! ---");
					break;
				}
			}
		} while(ch!=3);
	} else {
		printf("\n\t--- Employee Not Found ---");
	}
}
int deleteEmp(Employee* ptr,int s){
	int tId;
	printf("Enter ID you want to delete ? \n");
	scanf("%d",&tId);
	
	int index = searchById(tId,s,ptr);
	if(index!=-1){
		int i;
		for(i=index;i<s;i++){
			ptr[index] = ptr[index+1];
		}
		printf("\n\t--- Employee Id %d Deleted! ---",tId);
		return 1;
	}else {
		printf("\n\t--- Employee Not Found ---");
		return 0;
	}
	
}
void display(Employee* ptr,int i) {
	printf("\n\t--- Employee Details ---");
	printf("\nId : %d",ptr[i].id);
	printf("\nName : %s",ptr[i].name);
	printf("\nSalary : %lf",ptr[i].salary);
}


