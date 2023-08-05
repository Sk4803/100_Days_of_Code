import java.util.*;
class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(countBit(arr, k));
    }
    
    static int countBit(int[] arr, int k){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(countSetBitOr(arr[i], arr[j]) + countSetBitAnd(arr[i], arr[j]) >= k){
                    count++;
                }
            }
        }
        return count;
    }
    
    static int countSetBitOr(int a, int b){
        int count = 0;
        int binary = a|b;
        String bin = Integer.toBinaryString(binary);
        for(int i=0; i<bin.length(); i++){
            if(bin.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
    
    static int countSetBitAnd(int a, int b){
        int count = 0;
        int binary = a&b;
        String bin = Integer.toBinaryString(binary);
        for(int i=0; i<bin.length(); i++){
            if(bin.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}
