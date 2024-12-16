#include<iostream>
using namespace std;

void PrintSubArray(int arr[],int n){
    int count=0;
    for(int start=0;start<n;start++){
        for(int end=start;end<n;end++){
            int sum=0;
            cout<<"SubArray :=>";
            for(int i=start;i<=end;i++){
                cout<<arr[i]<<" ";
                sum+=arr[i];
            }
            count++;

            cout<<"   [ Sum is :=>"<<sum<<"]"<<"\n";
            cout<<"\n ";
           
        }
        cout<<"\n ";
    }

    cout<<"Total SubArray Are :=> "<<count;
}

int main(void){

    int arr[]={ 2,4,6,8,10 };

    int n =sizeof(arr)/sizeof(arr[0]);
    PrintSubArray(arr,n);
    return 0;

}