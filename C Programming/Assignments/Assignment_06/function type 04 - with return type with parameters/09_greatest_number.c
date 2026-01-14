// Write a program to find greatest of three numbers using nested if-else.

#include<stdio.h>

int greatestNum(int n1,int n2,int n3){
        
    if(n1>n2){
        if(n1>n3){
            return 0;
        }
        else return 2;
    }
    else if(n1 < n2){
        if(n2>n3) return 1;
        else return 2;
    }
    else return 2;
}

void main(){
    int n1,n2,n3;
    printf("Enter num1: ");
    scanf("%d", &n1);
    printf("Enter num2: ");
    scanf("%d", &n2);
    printf("Enter num3: ");
    scanf("%d", &n3);

    int flag = greatestNum(n1,n2,n3);
    if(flag==0) printf("number 1 is greater!");
    else if(flag==1) printf("number 2 is greater!");
    else if(flag==2) printf("number 3 is greater!");
}