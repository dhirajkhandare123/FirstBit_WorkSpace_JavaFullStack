// Check the given number is Palindrome number or not. 
// Input: n = 121 
// Output: Palindrome 

#include<stdio.h>
void main(){
    printf("Enter: ");
    int n;
    scanf("%d", &n);

    int rev=0;
    int temp = n;

    while(temp!=0){
        int last = temp%10;
        rev = rev * 10 + last;
        temp=temp/10;
    }
    
    if(rev == n) printf("Palindrome");
    else printf("Not a Palindrome");
}