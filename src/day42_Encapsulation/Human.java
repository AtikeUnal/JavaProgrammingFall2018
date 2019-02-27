package day42_Encapsulation;

public class Human {
 private String gender;
 private int age;
 static String todaysDate;
 
 public String getGender() {
	
	 return gender;	
 }
  public void setGender(String gender) {
	  if(!gender.equals("male")||!gender.equals("female")) {
		  System.out.println("Gender must be only male or female");
	  }this.gender=gender;
	  
	  
	  }
  public int getAge() {
	  
	  return age;
  }
  
  public void setAge(int age) 
  { if(age>=0&&age<=150) {
	  this.age=age;
	  }
  }
 
}
