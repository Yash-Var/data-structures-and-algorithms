public class binarysearch {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,20};
        int target=6;
        System.out.println("The "+target+" is persent at place :"+binary(a ,target));
    }
    static int binary(int[] arr,int key){
        int s=0;
        int e= arr.length-1;
        int mid=s+(e-s)/2;
        while(s<e){
            if(key==arr[mid]){
                return mid;
            }else if(key>arr[mid]){
                s=mid+1;
            }else {
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return -1;
    }
}
