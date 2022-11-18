package String;

public class s3 {
	public static void main(String[] args) {
		String s="abcdefghijklmnopqrstuvwxyz";
		int count =0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			switch(ch) {
			case 'a':
				count++;
				break;
			case 'e':
				count++;
				break;
			case 'i':
				count++;
				break;
			case 'o':
				count++;
				break;
			case 'u':
				count++;
				break;
			}
		}
		System.out.println(count);
		 
	}

}
