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
    
    public static double medianOfArrays(int arr1[],int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        
        int low=0,high=m,medianPos=((m+n)+1)/2;
        while(low<=high) {
            int cut1 = (low+high)>>1;
            int cut2 = medianPos - cut1;
        
            int l1 = (cut1 == 0)? Integer.MIN_VALUE:arr1[cut1-1];
            int l2 = (cut2 == 0)? Integer.MIN_VALUE:arr2[cut2-1];
            int r1 = (cut1 == m)? Integer.MAX_VALUE:arr1[cut1];
            int r2 = (cut2 == n)? Integer.MAX_VALUE:arr2[cut2];
        
            if(l1<=r2 && l2<=r1) {
                if((m+n)%2 != 0)
                    return Math.max(l1,l2);
                else 
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
            }   
            else if(l1>r2) high = cut1-1;
            else low = cut1+1;
        }
        return 0.0;
    }
}
