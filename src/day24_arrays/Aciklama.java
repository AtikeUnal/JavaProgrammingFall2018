package day24_arrays;

public class Aciklama {
	public static void main(String[] args) {
		
		//Whenever we declare an array with size, depending on what type it isi, it will get default values assigned.
		int [] arr=new int[3];//0,0,0;
		arr[0]=0;
		arr[1]=0;
		arr[2]=0;//bir arrayi declare edip initialize etmezsen default degerleri 0 olur.
		
		//for each loop only works with arrays or other data collections /structures
		// for(TypeOfArray tempVariable: arrayName){
		//}
	
		int[] nums= {4,6,3,1,4};
		for (int number:nums) {
			System.out.println(number+", ");
		}
		
	}
}
