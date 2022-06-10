import java.util.*;

class primeNum {
    public static void main(String[] args) {    

        int i;
        int size=0;
        // int elmt;
        // int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        if(sc.hasNextInt())
        size = sc.nextInt();
        sc.close();

        int arr[]=new int[size];

        System.out.println("Enter "+size+" elements of array");

        for(i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(size+" elements of array are"+Arrays.toString(arr));
        
        if(isPrime(size)){
            System.out.println(size + " is not a prime number");
        }
        else{
            System.out.println(size + " is a prime number");

        }

        // System.out.println("Enter elements of array");

        // for(i=0;i<arr.length;i++){
        //     elmt = sc.nextInt();
        //     arr[i] = elmt;
        // }
        
        // System.out.println("The elements of array are"+Arrays.toString(arr));

        // if(isPrime(size)){
        //     System.out.println("The prime number(s) are"+size);
        // }
        // else {
        //     System.out.println("These number(s) are not prime"+size);
        // }


        // boolean flag = false;

        // for(i=2 ; i<size/2 ; i++){
        //     // condition for non prime number
        //     if(size % i == 0){
        //         flag = true;
        //         break;
        //     }
        // }

        // if(!flag)
        //     System.out.println(size + " is a prime number");
        // else
        //     System.out.println(size + " is not a prime number");
    
        // sc.close();
    
    }

    public static boolean isPrime(int x){

        int i;

        for(i=2 ; i<x/2 ; i++){
            // condition for non prime number
            if(x % i == 0){
                // flag = true;
                // break;
                return true;
            }
        }  
        return false;  
    }   
}
