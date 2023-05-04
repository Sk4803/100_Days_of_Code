import java.io.*;
import java.util.*;

public class MedianOfSortedArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        for (int i=0; i<n1; i++){
            nums1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        for (int i=0; i<n2; i++){
            nums2[i] = sc.nextInt();
        }
        if(nums1.length > nums2.length){
            System.out.print(medianOfArrays(nums1, nums2));
        }
        else{
            System.out.print(medianOfArrays(nums2, nums1));
        }
    }
    
    public static double median(int arr1[],int arr2[],int m,int n) {
        int finalArray[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<m && j<n) {
            if(arr1[i]<arr2[j]) {
                finalArray[k++] = arr1[i++];
        }
        else {
            finalArray[k++] = arr2[j++];
        }
    }
    if(i<m) {
        while(i<m) 
            finalArray[k++] = arr1[i++];
    }
    if(j<n) {
        while(j<n)
            finalArray[k++] = arr2[j++];
    }
    n = n+m;
    if(n%2==1) 
        return finalArray[((n+1)/2)-1];
    else return ((double)finalArray[(n/2)-1]+(double)finalArray[(n/2)])/2.0;
}
}
