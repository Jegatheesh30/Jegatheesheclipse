package String;

public class s2 {

	public static void main(String[] args) {
		int a[]= {2,4,6,5,7,8,9,3,1};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				int sum=a[i]*a[j];
				if(sum==10) {
					System.out.println(a[i]+"and "+a[j]+"is equal to 10");
				}
			}
		}
	}

}
