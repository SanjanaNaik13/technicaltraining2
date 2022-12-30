package array;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		int[] arr, arr2,a,b,c;
//		int []arr, a,b,c,d;
//		int arr[], a=10, b=20,c =30;
		//array declaration
		int[] arr;
		int arrSize;
		arrSize = in.nextInt();
		//creation of an array
		arr = new int[arrSize];
		//Getting array inputs
		for (int i = 0; i<arr.length; i++)
			arr[i] = in.nextInt();
		//reversing an array
		for (int i = 0, j=arr.length-1;i<j;i++,j--)
			//Swapping left element with right element
			arr[i] = (arr[i] + arr[j]) - (arr[j]=arr[i]);
		for(int i =0; i<arr.length; i++)
			System.out.println(arr[i]);
	}

}
