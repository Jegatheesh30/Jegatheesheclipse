package String;

public class s1 {
	
	private static int[] array_addtion(int a[],int b[]) {
		int s=a.length;
		int c[]=new int [a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		return c;
		
	}

	public static void main(String[] args) {
		int a[]= {10,20,30};
		int b[]= {40,50,60,70};
		int c[]=s1.array_addtion(a,b);
		
		/*
		 * int s=a.length; int c[]=new int [a.length+b.length]; for(int
		 * i=0;i<a.length;i++) { c[i]=a[i]; } for(int i=0;i<b.length;i++) {
		 * c[a.length+i]=b[i]; } for(int i=0;i<c.length;i++) { System.out.println(c[i]);
		 * }
		 */
		
	}	
} 
