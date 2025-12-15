// Write a program to find greatest of three numbers using nested if-else.

#include<stdio.h>

void main(){
    int n1,n2,n3;
    printf("Enter num1: ");
    scanf("%d", &n1);
    printf("Enter num2: ");
    scanf("%d", &n2);
    printf("Enter num3: ");
    scanf("%d", &n3);

    if(n1>n2){
        if(n1>n3) printf("%d", n1);
        else printf("%d", n3);
    }
    else if(n1 < n2){
        if(n2>n3) printf("%d", n2);
        else printf("%d", n3);
    }
    else printf("%d", n3);
}