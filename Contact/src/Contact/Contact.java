package Contact;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;
public class Contact {
	
	public static void add(String st1,String st2,HashMap<String,String> contact) {
		if(st1!=null&&st2!=null) {
			if(contact.get(st1)==null) {
				contact.put(st1, st2);
			}else {
				System.out.println("error");
			}
			
		}else {
			System.out.println("error");
		}
	}
	public static void show(String st1,HashMap<String,String> contact) {
		if(st1==null) {
			Iterator<String> cIter=contact.keySet().iterator();
			while(cIter.hasNext()) {
				String name=cIter.next();
				String number=contact.get(name);
				System.out.println(name+" "+number);
			}
			
		}else {
			System.out.println("error");
			
		}
	}
	public static void delete(String st1,String st2,HashMap<String,String> contact) {
		if(st1!=null&&st2==null) {
			if(contact.get(st1)!=null) {
				contact.remove(st1);
			}else {
				System.out.println("error");
			}
		}else {
			System.out.println("error");
		}
	}
	public static void find(String st1,String st2,HashMap<String,String> contact) {
		if(st1!=null&&st2==null) {
			if(contact.get(st1)!=null) {
				System.out.println(contact.get(st1));
			}else {
				System.out.println("error");
			}
		}else {
			System.out.println("error");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> contact=new HashMap<>();
		Scanner s=new Scanner(System.in);
		
		while(1<2) {
			String str;
			str=s.nextLine();
			String[] temp=str.split(" ");
			String[] st=Arrays.copyOf(temp,3);
			
			switch(st[0]) {
			case "add":
				add(st[1],st[2],contact);
				break;
			case "delete":
				delete(st[1],st[2],contact);
				break;
			case "show":
				show(st[1],contact);
				break;
			case "find":
				find(st[1],st[2],contact);
				break;
			default:
				System.out.println("error");
				break;			
			}
		}

	}

}
