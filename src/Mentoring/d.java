package Mentoring;

public class d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int month=1;
			String[] monthWords = {"January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December"};
			String[] numbersLessThanTen = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
			String[] numbersBetweenTenAndTwenty = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
			String[] multiplesOfTen = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
			String[] yearWords = {"Hundred", "Thousand"};
			
			// TO DO 
			int j=1;
			for(int i=0; i<monthWords.length; i++) {
				if(month==j) {
					System.out.println(monthWords[i]);
					j++;
				}
				
			}
	}

}
