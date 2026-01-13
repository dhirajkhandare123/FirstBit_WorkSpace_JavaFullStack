// Write a program to check given 3 digit number is pallindrome or not.12

#include<stdio.h>

int pallindrome(){
    int n;
    printf("Enter number: ");
    scanf("%d",&n);

    int rev=0;
    int original=n;

    while(n != 0){
        int temp = n % 10;
        rev = rev * 10 + temp;
        n = n / 10;
    }

    if(original == rev) return 1;
    else return 0;
}

void main(){
    
    int flag = pallindrome();
    if(flag==1) printf("Palindrome");
    else printf("Not Palindrome");

}