  function BinarySearch(arr,n,k){
    let start=0; 
    let end=n-1;
    

    while(start<=end){
        let mid = Math.floor((start + end) / 2)

        if(arr[mid]==k){
            return mid

        } else if (arr[mid]<k) {
            start=mid+1
        } else {
            end=mid-1
        }
    }
    return -1;
  }



   arr=new Array(1,2,3,4,5,6,7,8,9,10)
   n=arr.length
   k=8

   ans= BinarySearch(arr,n,k)

  if(ans==-1){
    console.log("Element is not found")
  }else{
    console.log("Element id present at index :" +ans)
  }