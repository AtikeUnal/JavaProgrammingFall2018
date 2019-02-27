package day37_ArrayList;


import java.util.*;
public class Conversion {
	public static void main(String[] args) {
		
		//Autoboxing and Unboxing
		//if int gets converterd to Integer type then its called autoboxing
		//Autoboxing - automatically converting frome primitive to objecttype
		//Autoboxing happens implicitly
		//(example to autoboxing)
		int age=56;
		Integer age2=age;
		
		boolean raining =false;
		Boolean raining2=raining;
		int i=10;
		List<Integer> ages=new ArrayList<>();
		ages.add(34);
		//valueOf-->gets value of certain data type
		String amount="transaction amount is 45.3";
		String [] arr=amount.split(" ");
		double d=Double.valueOf(arr[arr.length-1]);
		System.out.println(d);
		
		//-If integer gets converted to int tyep then its Unboxing
		//-When object type gets converted into primitive type its called UNBOXING
		//UNBOXING
		Character c= 'd';
		char cc = c;
		
		} 
	}

