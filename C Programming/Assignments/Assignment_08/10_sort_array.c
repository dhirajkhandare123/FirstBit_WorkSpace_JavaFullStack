// Sort the array.

#include<stdio.h>

void main(){
    int arr[] = {1, 4, 2, 5, 7, 3, 6};
    int n = sizeof(arr)/sizeof(int);

    for(int i=0; i<n-1; i++){
        int min = __INT_MAX__;
        int midx = -1;
        for(int j=i;j<n;j++){
            if(arr[j] < min){
                min = arr[j];
                midx = j;
            }
        }
        int temp = arr[midx];
        arr[midx] = arr[i];
        arr[i] = temp;
    }

    printf("Sorted array: \n");

    for(int i=0;i<n;i++){
        printf("%d ", arr[i]);
    }
}