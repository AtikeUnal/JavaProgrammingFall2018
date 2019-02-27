package day7_conditions;

public class SwapVarValues {
	public static void main(String[] args) {
	int apples=222;
	int oranges=45;
	
	
	//	apples=oranges;---->didnt work
	//oranges=apples;
	
	int tempContainer=apples;
	apples=oranges;
	oranges=tempContainer;
	System.out.println("oranges: "+oranges+" apples: "+apples);
	System.out.println("1"+2+3);
	}
}
