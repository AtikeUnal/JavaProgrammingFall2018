package day47_AccessModifiers02;

import day47_AccessModifiers01.Student;

public class OtherPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student=new Student();
		 
		student.name="Mike";
		//student.ssn private
		//student.age=27; is protected so in different package it can not be used directly. It can be used as subclass.
		
	}

}
