
public class HighestProductArray {

	public static void main(String[] args) {
		int a[] = {2, 4, 1, 3, 5};
		
		System.out.println("Highest product of 3 numbers is: "+ highestProductOf3(a));
	}

	public static int highestProductOf3(int array[]){
		
		if(array.length<3){
			throw new IllegalArgumentException();
		}
		
		int highestProduct2 = array[0]*array[1];
		int lowestProduct2 = array[0]*array[1];
		
		int highest = Math.max(array[0], array[1]);
		int lowest = Math.min(array[0], array[1]);
		
		int highestProduct3 = array[0]*array[1]*array[2];
		
		for(int i=2;i<array.length;i++){
			int current = array[i];
			highestProduct3 = Math.max(Math.max(highestProduct3,current*highestProduct2),current*lowestProduct2);
			
			highestProduct2 = Math.max(Math.max(current*highest, highestProduct2),current*lowest);
			
			lowestProduct2 = Math.max(Math.max(lowestProduct2, current*lowest),current*highest);
			
			highest = Math.max(highest, current);
			
			lowest = Math.max(lowest, current);
		}
		return highestProduct3;
	}
}
