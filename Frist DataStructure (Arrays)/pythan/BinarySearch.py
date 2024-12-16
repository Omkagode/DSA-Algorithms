
def binarySerach(arr,n,k):
    start=0
    end=n

    while(start<=end):
        mid=(start+end)//2

        if(k==arr[mid]):
            return mid
        if(mid<k):
            start=mid+1
        else:
            end=mid-1
            
            

    return -1;           


if __name__=="__main__":
   arr=[1,2,3,4,5,6,7,8,9,10]
   n=len(arr)
   k=5
   ans=binarySerach(arr,n,k)

if(ans==-1):
        print("Element is not found")
else:
        print("Element present at index :" , ans)  
