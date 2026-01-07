// Find sum of all numbers.

#include<stdio.h>

int findSum(int arr[], int n){
    int total=0;
    for(int i=0;i<n;i++){
        total+=arr[i];
    }

    return total;
}

void main(){
    printf("Enter size: ");
    int size;
    scanf("%d", &size);

    int arr[size];

    printf("Enter array: \n");
    for(int i=0;i<size;i++){
        scanf("%d", &arr[i]);
    }

    printf("Sum: %d", findSum(arr, size));
}