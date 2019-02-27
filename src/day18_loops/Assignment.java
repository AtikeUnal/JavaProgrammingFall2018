package day18_loops;

public class Assignment {
	public static void main(String[] args){
		String SMSmessage="Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
		String sender;
		String phoneNumber;
		String message;
		sender=SMSmessage.substring(SMSmessage.indexOf("<")+1,SMSmessage.indexOf(">"));
		phoneNumber=SMSmessage.substring(SMSmessage.indexOf("[")+1,SMSmessage.indexOf("]"));
		message=SMSmessage.substring(SMSmessage.indexOf("{")+1,SMSmessage.indexOf("}"));
		System.out.println(sender+"\n"+phoneNumber+"\n"+message);
		
	}
}
