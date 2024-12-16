#include <iostream>
using namespace std;

int linearSearch(int arr[],int n,int k){
   for (int i = 0; i < n; i++)
   {
     if (k==arr[i])
     {
         return i;
     }
     
   }
   return -1;
}


int main(void){
    int arr[]= {1,2,3,4,5,6,7,8,9,10};
    int n= sizeof(arr)/sizeof(arr[0]);
    int k=4;
    int ans=linearSearch(arr,n,k);

    if(ans==-1){
        cout<<"Element is not found";
    }else{
        cout<<"Element Present at index :"<<ans;
    }

    return 0;
}