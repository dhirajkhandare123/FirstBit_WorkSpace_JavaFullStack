// Print prime numbers in the given range 1 to n. 

#include<stdio.h>

void main(){
    int n;
    printf("Enter: ");
    scanf("%d", &n);

    for(int i=1;i<=n;i++){
        int isPrime=1;
        for(int j=2;j<=i/2;j++){
            if(i%j==0) {
                isPrime=0;
                break;
            }
            else isPrime=1;
        }
        if(isPrime==1) printf("%d ", i);
    }
}