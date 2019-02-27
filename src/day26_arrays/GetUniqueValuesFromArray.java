package day26_arrays;

public class GetUniqueValuesFromArray {
	public static void main(String[] args) {
		int [] nums= {1,2,3,4,2,3,4,44,12,20,100,33,100,4};
		//take a number from array
		//compare with the rest of numbers in the array. If no matches found
		//it is unique and print it out
		
		
		//take a number from array
		//create variable counter and assign 0 to it. int counter=0;
		//compare the number with all other numbers (dont compare the number with itself)
		//if a match found counter++, if not touch counter 
		//check if counter is still 0, if yes, print that number because it is unique
		
		for (int outer=0; outer <nums.length; outer++) {
			int currentNum=nums[outer];							//outer=0
			boolean unique=true;							//inner
															
			for (int inner=0; inner<nums.length; inner++) {		//currentNum=1
				
				if(nums[inner]==currentNum&&outer!=inner) {		//inner=0
					unique=false;
					break;
				}
			}if (unique) {
				System.out.print(currentNum+" ");
				//for each loop -enhanced for loop .Same meaning
								
			
			}
		}
		int counter=0;
		
		
		
	}
}
