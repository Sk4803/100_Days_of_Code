import java.io.*;
import java.util.*;

public class SubArrayNegativeSum {

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        int n = escaner.nextInt();
        int[] numArray = new int[n];
        for (int j=0; j < numArray.length; j++){
            int num = escaner.nextInt();
            numArray[j] = num;
        }

        int contSumasNeg = 0;
        int longi = 1;
        while (longi <= numArray.length) {
            for (int i=0; i+longi <= numArray.length; i++){
                int[] subArray = Arrays.copyOfRange(numArray, i, i+longi);
                int suma = Arrays.stream(subArray).sum();
                if (suma < 0){
                    contSumasNeg++;
                }
            }
            longi++;
        }
        System.out.println(contSumasNeg);
    }  
}
