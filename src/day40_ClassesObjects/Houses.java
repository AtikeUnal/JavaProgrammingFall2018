package day40_ClassesObjects;

public class Houses {
public static void main(String[] args) {
	House house1=new House();
    
    house1.type="Town House";
    house1.address="9389 Dee rd. Des Plaines";
    house1.numRooms=3;
    
    House house2=new House();
    house2.type="Apartment";
    house2.address="Nar Agach 12, Ashgabat";
    house2.numRooms=4;
    
    
    House house3=new House();
    house3.type="Yali";
    house3.address="210 8th Street Fairview";
    house3.numRooms=5;
    
    House house4=new House();
    house4.type="Family house";
    house4.address="45 Divisoin st. Chicago";
    house4.numRooms=3;
   System.out.println("House 1 is: "+house1.type+"\n"+"House 2 type is: "+house2.type+"\n"+"and House 3 type is: "+house3.type);
}
}
