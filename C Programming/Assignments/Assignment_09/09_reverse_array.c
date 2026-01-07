//  Reverse the given array.

#include <stdio.h>
void rev(int arr[], int n)
{

    int i = 0, j = n - 1;
    while (i <= j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        i++;
        j--;
    }
}

void display(int arr[], int n){
    printf("\narray: ");
    for(int i=0;i<n;i++){
        printf("%d ", arr[i]);
    }
}

void main()
{
    printf("Enter size: ");
    int n;
    scanf("%d", &n);

    printf("Enter array: \n");
    int arr[n];

    for (int i = 0; i < n; i++)
    {
        printf("Enter: ");
        scanf("%d", &arr[i]);
    }

    display(arr,n);

    rev(arr, n);
    
    display(arr,n);
}