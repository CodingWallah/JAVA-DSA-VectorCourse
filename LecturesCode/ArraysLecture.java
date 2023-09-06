import java.util.ArrayList;
import java.util.Scanner;

public class ArraysLecture {

    static int[] inputArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = scanner.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter "+i+" Element of Array");
            intArray[i] = scanner.nextInt();
        }
        scanner.close();
        return intArray;
    }

    static void outputArray(int[] intArray){
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void main(String[] args) {
        // All are valid declarations -
        
             int[] intArray = {10,20,30};
             int[][] my2dArray = {
                {10,20,30},
                {40,50,60}
             };

            // outputArray(inputArray());
           //  System.out.println(intArray[0]);
            // System.out.println(my2dArray[0][0]);
            //  for(int e : intArray){
            //     System.out.println(e);
            //  }

            //  System.out.println(intArray.length);
            //  for(int i=0;i<=intArray.length;i++){
            //     System.out.println(intArray[i]);
            //  }

            //  System.out.println("Hellow World");
            // byte[] byteArray;
            // short[] shortsArray;
            // boolean[] booleanArray;
            // long[] longArray;
            // float[] floatArray;
            // Float[] fl;

            // int intArray[]; 
            // byte byteArray[];
            // short shortsArray[];
            // boolean booleanArray[];
            // long longArray[];
            // float floatArray[];
            // double doubleArray[];
            // char charArray[];

            // int[] intArray = new int[10];
            // byte[] byteArray = new byte[10];
            // short[] shortsArray = new short[10];
            // boolean[] booleanArray = new boolean[10];
            // long[] longArray = new long[10];
            // float[] floatArray = new float[10];
                ArrayList<String> al = new ArrayList<>();
                al.add("shiv");
                al.add("Coding");
                al.add("Wallah");
                al.add(0,"first");
                System.out.println(al);
    }
}

