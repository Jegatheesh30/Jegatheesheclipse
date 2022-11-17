package Basic;
import java.util.Arrays;

public class b1 {
	public static void main(String[] args) {
		
	
	int array[]= {10,20,30,40,50,60};
	int array_new[]=new int[array.length-1];
	int given_no=40;
	for(int i=0, k=0;i<array.length;i++) {
		if(given_no!=array[i]) {
			array_new[k]=array[i];
			k++;	
		}
	}
	for(int i=0;i<array_new.length;i++) {
		System.out.println(array_new[i]);
	}
}
}