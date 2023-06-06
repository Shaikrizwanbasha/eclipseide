package interfacetopic;

import java.util.Scanner;

public class insttest1 {
public static void main(String[] args) {
	
	
	Scanner s=new Scanner(System.in);

	System.out.println("please enter the group _________");
	inst R;
	String group = s.next();
	if(group.equals("bsc")) {
		R=new bsc();
		R.programminglanguage();
		R.fee();
	}else if (group.equals("btech")) {
		R=new btech();
		R.programminglanguage();
		R.fee();
	}else if(group.equals("msc")){
		R=new msc();
		R.programminglanguage();
		R.fee();
	}
	else {
		System.out.println("Please enter correct group");
	}

}
}
