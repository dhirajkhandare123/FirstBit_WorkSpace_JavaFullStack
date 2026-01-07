// Find minimum and maximum number in array. 

#include<stdio.h>

int findMax(int arr[], int size){
    int max=arr[0];
    for(int i=0;i<size;i++){
        if(arr[i]>max) max = arr[i];
    }

    return max;
}

int findMin(int arr[], int size){
    int min=arr[0];
    for(int i=0;i<size;i++){
        if(arr[i]<min) min = arr[i];
    }

    return min;
}

void main(){
    printf("Enter size: ");
    int size;
    scanf("%d", &size);

    int arr[size];

    printf("Enter elements in array one by one: \n");
    for(int i=0;i<size;i++){
        printf("Enter: ");
        scanf("%d", &arr[i]);
    }

    printf("Maximum number: %d\n", findMax(arr,size));
    printf("Minimum number: %d\n", findMin(arr,size));
}