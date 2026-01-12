// Write a program to check whether a number is even or odd.

#include<stdio.h>

void oddEven(int n){
    int flag=0;
    if(n%2==0) flag=1;
    else flag=0;

    if(flag==1) printf("Even");
    else printf("Odd");
}

void main(){
    int n;
    printf("Enter number: ");
    scanf("%d",&n);

    oddEven(n);

}