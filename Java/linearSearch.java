//linear search in java 


import java.util.Arrays;
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of element you want");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of an array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.println("Enter the element which you want to search ");
        int m = sc.nextInt();
        int u = linearSearch(arr, m);
        if (u != -1) {
            System.out.println("Element Exists in array at place : " + (u + 1));
        }
        else
            System.out.println("Element not present");
    }


        static int linearSearch ( int[] a, int key){
            for (int i = 0; i < a.length; i++) {
                if (a[i] == key) {

                    return i;

                }
            }
            return -1;
        }
    }


