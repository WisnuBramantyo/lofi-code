import java.util.Arrays;
import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int amount = sc.nextInt();
        
        int[] num = new int[amount];

        System.out.println("Enter number(s): ");
        for(int i=0 ; i<num.length ; i++){
            num[i] = sc.nextInt();
        }

        int[] odd = new int[amount];
        int[] even = new int[amount];
        int x,y;

        for(int j=0 ; j<num.length ; j++){
            if(num[j] % 2 == 0){
                odd[j] = num[j];
                System.out.println("Even numbers : "+Arrays.toString(odd));
            }
            else{
                even[j] = num[j];
                System.out.println("Odd numbers : "+Arrays.toString(even));
            }
        }

        
    }

    // public void oddEven(int num, int amount){

    // }
    
}
