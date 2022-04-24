public class peakIndex {


    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 5, 4, 3, 2, 1};
        System.out.println("yash varshney");
        System.out.println("Peak Index in a mountain array is : " + index(arr));
    }

    static int index(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            } else
                e = mid;
        }
        return s;
    }
}