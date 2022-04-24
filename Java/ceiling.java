public class ceiling {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        System.out.println("The Ceiling element is : "+ceilingElement(arr,target));
    }
    static int ceilingElement(int[] a,int key){
        int s=0;
        int e=a.length-1;
        if(key>a[e]){
            return -1;
        }
        else
        {
            int mid=s+(e-s)/2;
            while(s<=e){
                if(key==a[mid]){
                    return mid;
                }else if(key>a[mid]){
                    s=mid+1;
                }else{
                    e=mid-1;
                }
                mid=s+(e-s)/2;
            }
        }

        return s;
    }
}
