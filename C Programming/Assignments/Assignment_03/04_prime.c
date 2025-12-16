// Check the given number is prime or not. 
// Input: n = 7 
// Output: Prime 

#include<stdio.h>

void main(){
    int n;
    printf("Enter: ");
    scanf("%d", &n);


    int isPrime=1;
    for(int i=2;i<n;i++){
        if(n%i==0) {
            isPrime=0;
            break;
        }
        else isPrime=1;
    }

    if(isPrime==1) printf("Prime");
    else printf("Not Prime");
}