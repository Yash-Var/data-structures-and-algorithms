public class serachinrotatedarray {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target=0;
        int value=getpivot(nums);

        int ans=binarysearch(nums,target,0,value-1);

        if(ans!=-1){
            System.out.println(ans);
        }
        else
            System.out.println(binarysearch(nums,target,value,nums.length-1));
    }
    static  int getpivot(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]>=arr[0]){
                s=mid+1;
            }else{
                e=mid;
            }
        }
        return s;
    }
    static int binarysearch(int[] a,int target,int s,int e){

        int mid=s+(e-s)/2;
        while(s<=e){
            if(target==a[mid]){
                return mid;
            }else if(target>a[mid]){
                s=mid+1;
            }else {
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return -1;
    }
}
