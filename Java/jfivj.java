public class jfivj {
    class Solution {
        public int maximumWealth(int[][] accounts) {
            int sum=0;
            int[] a=new int[accounts.length];
            for(int i=0;i<accounts.length;i++){
                sum=0;
                for(int j=0;j<accounts[i].length;j++){

                    sum+=accounts[i][j];
                }
                a[i]=sum;
            }
            int value=a[0];
            for (int j : a) {
                if (value < j) {
                    value = j;
                }
            }
            return value;
        }
    }
}
