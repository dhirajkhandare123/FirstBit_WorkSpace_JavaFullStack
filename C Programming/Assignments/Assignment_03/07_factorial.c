// Find factorial of given number. 
// Input: n = 5 
// Output: 120

#include<stdio.h>

void main(){
    printf("Enter: ");
    int n;
    scanf("%d", &n);

    int fact = 1;

    for(int i=1;i<=n;i++){
        fact*=i;
    }

    printf("%d",fact);
}