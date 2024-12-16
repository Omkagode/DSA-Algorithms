#include <iostream>
using namespace std;

void Pair(int arr[],int n){
    int c=0;
    for (int i = 0; i < n; i++)
    {
        for (int j = i+1; j< n; j++)
        {
            cout<<"("<<arr[i]<<","<<arr[j]<<")"<<" ";
            c++;
        }
        
    }

    cout<<"Total No. of Pairs Are :"<<c;
    
}

int main(void){

    int arr[]= {1,2,3,4,5,6,7,8,9,10};
    int n= sizeof(arr)/sizeof(arr[0]);
    Pair(arr,n);
    return 0;
}