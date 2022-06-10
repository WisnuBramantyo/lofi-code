import java.util.Arrays;
import java.util.Scanner;

public class reversedWord2 {
    public void reverseWordInMyString(String str)
   {
		String[] words = str.split(" ");
		int j = words.length;
		String[] reversedPosition = new String[j];
		// String splitWord;

		String reversedWord;
		String rvsResult= "";

		String rvsString= "";

		for(int i=0 ; i<=j ; i++){
			reversedPosition[j-1] = words[i];
			j = j -1;
		}

		System.out.println("Reversed array position is \n"+Arrays.toString(reversedPosition)+"\n");

		int m = reversedPosition.length;

		for(int k=0 ; k<m ; k++){
			reversedWord = reversedPosition[k];
			for(int l = reversedWord.length()-1 ; l >=0 ; l--){
				rvsResult = rvsResult + reversedWord.charAt(l);
			}
			rvsString = rvsResult + " ";
		}

		System.out.println("Reversed string is \n"+rvsString);


		
   }
   public static void main(String[] args) 
   {
	// System.out.println("Enter the words");
	// Scanner sc = new Scanner(System.in);

	// // String myString = sc.next();
	// String myString = sc.next();
	// String[] arrString = myString.split(" ");

	// sc.close();
	// System.out.println("Words are"+Arrays.toString(arrString));

	reversedWord2 obj = new reversedWord2();
	// obj.reverseWordInMyString(myString);
	obj.reverseWordInMyString("1st 2nd");
   }
    
}

