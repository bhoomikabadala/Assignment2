
public class SS {

	public static void main(String[] args) {
		int[] a = {5,4,3,2,1};
		int min;
		
		for(int i =0;i<a.length;i++)
		{
			min = a[i];
			for(int j=i;j<a.length;j++) {
				if(a[j]<min) {
					min = a[j];
					int temp = a[j];
					a[j]=a[i];
					a[i] = temp;
				}
			}
			for(int j=0;j<a.length;j++) 
				System.out.print(a[j]+" ");
			System.out.println();
		}	
	}
}
