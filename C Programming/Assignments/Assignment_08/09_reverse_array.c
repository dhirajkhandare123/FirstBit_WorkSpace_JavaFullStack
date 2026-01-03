//  Reverse the given array.

#include<stdio.h>

void main(){
    printf("Enter size: ");
    int n;
    scanf("%d", &n);

    printf("Enter array: \n");
    int arr[n];

    for(int i=0; i<n; i++){
        printf("Enter: ");
        scanf("%d", &arr[i]);
    }

    printf("\n\nYou Enter: ");
    for(int i=0; i<n; i++){
        printf("%d ", arr[i]);
    }

    int i=0, j=n-1;
    while(i<=j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        i++;
        j--;
    }

    printf("\n\nReverse array: ");
    for(int i=0; i<n; i++){
        printf("%d ", arr[i]);
    }


}