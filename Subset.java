
public class Subset {

	public static void main(String[] args) {
		int[] a= {12, 23, 67, 90, 66, 13};
		int[] b = {12,91,13};
		int count=0;
		
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					count++;
				}
			}
		}
		if(count==b.length) {
			System.out.println("Second array is the subset of Array 1");
		}
		else {
			System.out.println("Second array is not the subset of Array 1");
		}
	}
}