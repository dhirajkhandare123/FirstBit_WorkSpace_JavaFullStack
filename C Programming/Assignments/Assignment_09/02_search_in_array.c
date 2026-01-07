//  Search the given number in array.  

#include<stdio.h>

void searchNumber(int arr[], int size, int x){
    for(int i=0;i<size;i++){
        if(arr[i] == x){
            printf("Number present at %d th index in array", i);
        }
    }
}

void main(){
    int arr[] = {123, 112, 100, 55, 101, 909, 771};
    int n = sizeof(arr)/sizeof(int);

    printf("Enter number you want to search: ");
    int x;
    scanf("%d", &x);

    searchNumber(arr,n,x);
}