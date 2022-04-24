public class minelement {
    public static void main(String[] args) {
        int[] arr={5,7,8,3,2,7,65};
        System.out.println("Mininum element of an array is : "+min(arr));
    }
    static int min(int[] a){
        int e=a[0];
        for (int i = 0; i < a.length; i++) {

            if(e>a[i]){
                e=a[i];
            }
        }
        System.out.println(e);
      // int e;
        return e;
    }
}
