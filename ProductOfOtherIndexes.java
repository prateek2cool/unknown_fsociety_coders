
public class ProductOfOtherIndexes {

	public static void main(String[] args) {
		
		int a[] = {2, 4, 1, 3, 5};		
		System.out.println("Original Array: " );
		printArray(a);
		System.out.println("Product of other Indexes: " );
		printArray(getProduct(a));
	}

	public static int[] getProduct(int[] a) {
		 if (a.length < 2) {
		        throw new IllegalArgumentException("Getting the product of numbers at other indices requires at least 2 numbers");
		    }
		 
		int productsExceptIndex[] = new int[a.length];
		int productOfInts = 1;
		
		for(int i=0;i<a.length;i++){
			productsExceptIndex[i] = productOfInts;
			productOfInts *=a[i];
		}
		productOfInts = 1;
		for(int j=a.length-1;j>=0;j--){
			productsExceptIndex[j] *= productOfInts;
			productOfInts *=a[j];
		}
		
		return productsExceptIndex;
	}
	 static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }

}
