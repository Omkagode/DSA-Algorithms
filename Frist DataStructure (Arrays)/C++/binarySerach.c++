#include<iostream>
using namespace std;

int BinarySerach(int arr[], int n,int k){
    int start=0;
    int end=n-1;

    while (start<=end)
    {
        int mid=(start+end)/2;

        if(arr[mid]==k){
            return mid;
        }else if (arr[mid]<k)
        {
            start=mid+1;
        }else{
            end=mid-1;
        }
        
    }
    return-1;
    
}

int main(void){
    int arr[]={1,2,3,4,5,6,7,8,9,10};

    int n =sizeof(arr)/sizeof(arr[0]);
    int k =8;

    int ans=BinarySerach(arr,n,k);
    if(ans==-1){
        cout<<"Element is not found";

    }else{
        cout<<"Element is present at index :"<<ans;
    }

    return 0;

}