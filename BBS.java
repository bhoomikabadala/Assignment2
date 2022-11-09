
public class BBS {

	public static void main(String[] args) {
		
		int[] a = {99, 13, 89, 45, 10, 78};
		
		for(int i=0;i<a.length;i++) 
			System.out.print(a[i]+" ");
		
		System.out.println();
		
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length;j++) {
				if(a[j]<a[j-1]) {
					int temp = a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) 
			System.out.print(a[i]+" ");
		
	}

}
