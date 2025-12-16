// Check the given number is Perfect number or not. 
// Input: n = 28 
// Output: Perfect

#include<stdio.h>

void main(){
    printf("Enter: ");
    int n;
    scanf("%d", &n);

    int sum=0;

    for(int i=1;i<=(n/2);i++){
        if(n % i==0){
            sum+=i;
        }
    }

    if(sum == n && n>0) printf("Perfect Number");
    else printf("Not Perfect Number");
}

// Perfect Number: number equal to sum of its proper divisors.

// proper divisors: positive divisors of a number excluding number itself.