
public class s1 {
	
	public static void main(String[] args) {
		String s="this my java book. My mail id jsanstark@gmail.com";
		int i=0;
		int count=0;
		for(i=0;i<s.length();i++) {
			if(s.charAt(i)=='.')
				if(s.charAt(i+1)==' ')
					count ++;
		}
		System.out.println("not of sentence in line "+count);
	}
	

}
