import java.util.Arrays;

public class stringsearch {
    public static void main(String[] args) {
        String name="yash";
        char target='n';
        System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String arr,char key){
        if(arr.length()==0){
            return false;
        }else {
            for (int i = 0; i < arr.length(); i++) {
                if(key == arr.charAt(i)){
                    return true;
                }
            }

        }

        return false;
    }
}
