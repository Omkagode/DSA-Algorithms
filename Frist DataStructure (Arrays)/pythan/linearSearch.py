
def linearSearch( arr,n,k):

    for i in range(0,n):
        if(k==arr[i]):
            return i
        
    return -1

if __name__ =="__main__":
    arr=[1,2,3,4,5,6,7,8,9,10]
    n=len(arr)
    k=5
    ans=linearSearch(arr,n,k)

    if(ans==-1):
        print("Element is not found")
    else:
        print("Element present at index :" , ans)   

