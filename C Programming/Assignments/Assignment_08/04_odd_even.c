//  Find odd and even among the numbers.

#include <stdio.h>

void oddNum(int arr[], int n){
    printf("Odd: ");
    for(int i=0;i<n;i++){
        if(arr[i]%2!=0) printf("%d ", arr[i]);
    }
    printf("\n");
}

void evenNum(int arr[], int n){
    printf("Even: ");
    for(int i=0;i<n;i++){
        if(arr[i]%2==0) printf("%d ", arr[i]);
    }
}
void main()
{
    printf("Enter size: ");
    int size;
    scanf("%d", &size);

    int arr[size];

    printf("Enter array: \n");
    for (int i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }

    oddNum(arr, size);
    evenNum(arr, size);
}