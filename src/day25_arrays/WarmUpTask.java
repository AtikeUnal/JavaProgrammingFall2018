package day25_arrays;

public class WarmUpTask {
	public static void main(String[] args) {
		String[] kitchenItems= {"knife", "wooden spoons","plates","cups","forks","pan","pot","trash can","fridge", "dishwasher"};
		for (String item:kitchenItems) {
			System.out.println(item+":"+" ");//arrays are fixed size , we can not change its size either by increasing or decreasing.
											//but we can modify/change values within it.
			switch (item) { //switch can not accept array 
			//if some of items in upper case we can put in switch (item.toLowerCase). And if some of them has spaces (item.toLowerCase.trim)
			case "knife":
				System.out.println("Used for cutting");
			break;
			case "wooden spoons":
				System.out.println("Used for eating and cooking");
			break;
			case "plates":
				System.out.println("Used for serving meal");
			break;
			case "cups":
				System.out.println("Use for drinking tea");
			break;
			case "forks":
				System.out.println("Spoon like item");
			break;
			case "pan":
				System.out.println("Used for keeping food inside");
			break;
			case "pot":
				System.out.println("Same as pan");
			break;
			case "trash can":
				System.out.println("Used for throwing away trash");
			break;
			case "fridge":
				System.out.println("Keeping food fresh");
			break;
			case "dishwasher":
				System.out.println("Washing dishes");
			break;
			}
		}

	}

}
