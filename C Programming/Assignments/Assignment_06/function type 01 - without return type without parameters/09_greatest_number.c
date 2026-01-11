// Write a program to find greatest of three numbers using nested if-else.

#include<stdio.h>

void num1(){
    printf("number 1 is greater!");
}

void num2(){
    printf("number 2 is greater!");
}

void num3(){
    printf("number 3 is greater!");
}

void main(){
    int n1,n2,n3;
    printf("Enter num1: ");
    scanf("%d", &n1);
    printf("Enter num2: ");
    scanf("%d", &n2);
    printf("Enter num3: ");
    scanf("%d", &n3);

    if(n1>n2){
        if(n1>n3){
            num1();
        }
        else num3();
    }
    else if(n1 < n2){
        if(n2>n3) num2();
        else num3();
    }
    else num3();
}