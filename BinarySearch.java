
public class BinarySearch {

	public static void main(String[] args) {
		int a[] ={2,5,9,15,43};
		int num=18;
		System.out.println("Array to find the element: ");
		printArray(a);
		System.out.println("Element to be found: "+ num);
		boolean result = binarySearch(a,0,a.length-1,num);
        if(!result){
        	System.out.println("Element " + num  +" not found in the provided array");
        }
        else
        	System.out.println("Element " + num + " found in the given array");

	}

	private static boolean binarySearch(int[] a, int i, int length, int num) {
		if(length>=i){
		int mid = i+(length-i)/2;
		
		if(a[mid] == num){
			return true;
		}
		if(a[mid] > num){
			return binarySearch(a, i, mid-1, num);
		}
		    return binarySearch(a, mid+1, length, num);
		}
		return false;
		
	}

	private static void printArray(int[] a) {
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
