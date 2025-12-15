// Write a program to check given 3 digit number is pallindrome or not.
#include<stdio.h>

void main(){
    printf("Enter three digit number: ");
    int n;
    scanf("%d",&n);

    int original = n;
    int rev = 0;
    while(n!=0){
        int temp = n%10;
        rev = rev * 10 + temp;
        n=n/10;
    }
    
    if(original == rev) printf("number is pallindrome");
    else printf("number is not pallindrome");
}