function linearSearch(arr,n,k){
    for(let i=0;i<n;i++){
        if(arr[i]==k)
            return i;
    }
    return -1;
}

let arr=[1,2,3,4,5,6,7,8,9,10];
let n=arr.length;
let k=5;

let ans=linearSearch(arr,n,k) ;
   (ans==-1)
   ?console.log("Element is not fount")
   :console.log("Element is present at index :" +ans);