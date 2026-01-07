// Accept array and print only prime numbers of array.  

#include<stdio.h>

void printOnlyPrime(int arr[], int n){
    for(int i=0;i<n;i++){
        int x = arr[i];
        int flag = 1;
        for(int j=2;j<x;j++){
            if(x%j==0) flag=0;
        }
        if(x==1) continue;
        if(flag==1) printf("%d ", arr[i]);
    }
}

void main(){
    printf("Enter size: ");
    int n;
    scanf("%d",&n);

    printf("Enter integer elements: \n");
    int arr[n];
    
    for(int i=0;i<n;i++){
        scanf("%d", &arr[i]);
    }

    printOnlyPrime(arr, n);
}