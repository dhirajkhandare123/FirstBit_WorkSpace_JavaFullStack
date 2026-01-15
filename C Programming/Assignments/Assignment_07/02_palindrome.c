// Write a program to check given 3 digit number is pallindrome or not.12

#include<stdio.h>

void pallindrome(int* n){
    int rev=0;
    int original=(*n);

    while((*n) != 0){
        int temp = (*n) % 10;
        rev = rev * 10 + temp;
        (*n) = (*n) / 10;
    }

    if(original == rev) printf("Pallindrome.");
    else printf("Not a Pallindrome.");
}

void main(){
    int n;
    printf("Enter number: ");
    scanf("%d",&n);

    pallindrome(&n);

}