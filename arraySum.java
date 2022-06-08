import java.util.*;

class arraySum {
    public static void main(String[] args) {

        int i= 0;
        int size = 0;
        int sum = 0;

        System.out.println("Input size of array: ");
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt())
        size = sc.nextInt();

        int arr[] = new int[size];
        
        System.out.println("Input elements of array : ");

        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            // sum = sum + arr[i];
            sum += arr[i];
        }        
        
        System.out.println("The sum of array elements is: "+sum);

        sc.close();
    
    }

}
