
public class MergeSort {

	public static void main(String[] args) {
		
		int a[] = {12, 11, 13, 5, 6, 7};
		System.out.println("Original array: ");
		printArray(a);
		MergeSort m= new MergeSort();
		m.sort(a,0,a.length-1);
		System.out.println("Sorted array: ");
		printArray(a);
		
	}

	 void sort(int[] a, int i, int j) {
		if(i<j){
		// Get the middle point
		int	m=(i+j)/2;
		sort(a,i,m);
		sort(a,m+1,j);

		//Merge the sorted halves
		merge(a,i,m,j);
		}
		
	}

	 void merge(int[] a, int i, int m, int j) {
		//Get sizes of array to be merged
		 int s1 = m-i+1;
		 int s2 = j-m;
		 
		 //create temp arrays
		 int L[] = new int [s1];
		 int R[] = new int [s2];
		 
		 //copy data to temp arrays
		 for(int k=0;k<s1;k++){
			 L[k] = a[i+k];
		 }
		 for(int p=0;p<s2;p++){
			 R[p] = a[m+1+p];
		 }
		 /* Merge the temp arrays */
		 
	        // Initial indexes of first and second subarrays
	        int idx1 = 0, idx2 = 0;
	     // Initial index of merged sub array
	        int kb = i;
	        while (idx1 < s1 && idx2 < s2)
	        {
	            if (L[idx1] <= R[idx2])
	            {
	                a[kb] = L[idx1];
	                idx1++;
	            }
	            else
	            {
	                a[kb] = R[idx2];
	                idx2++;
	            }
	            kb++;
	        }
	        /* Copy remaining elements of L[] if any */
	        while (idx1 < s1)
	        {
	            a[kb] = L[idx1];
	            idx1++;
	            kb++;
	        }
	 
	        /* Copy remaining elements of R[] if any */
	        while (idx2 < s2)
	        {
	            a[kb] = R[idx2];
	            idx2++;
	            kb++;
	        }
		 }
		
	

	/* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
