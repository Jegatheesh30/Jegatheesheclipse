package String;

public class s4 {
	public static void main(String[] args) {
		String s="this my new key word";
		int count=1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') 
				count++;
		}
		System.out.println(count);
	}

}
