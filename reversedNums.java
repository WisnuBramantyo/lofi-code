import java.util.Arrays;
import java.util.Scanner;

public class reversedNums {
    public static void main(String[] args) {
        int v;
        int[] arr;

        System.out.println("Enter array size");
        
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();

        int[] rvsNum = new int[v];
        arr = new int[v];
        int y = v - 1;

        System.out.println("Enter array elements");
        for(int i=0 ; i<arr.length ; i++){
            arr[i]=sc.nextInt();
        }

        
        for(int i=0 ; i<=arr.length-1 ; i++){
            rvsNum[i] = arr[y];
            y = y-1 ;
        }

        System.out.println("Reversed array elements are "+Arrays.toString(rvsNum));

        sc.close();
    }
    
}
