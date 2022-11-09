
public class Match {

	public static void main(String[] args) {
		int[] a = {10,20,70,90,90};
		
		boolean flag = false;
		
		for(int i=0; i<a.length; i++) {
			for(int j=i; j<a.length;j++) {
				if(a[i]==a[j] && i!=j) {
					System.out.println("Dupliactes found at index "+i+" and "+j);
					flag=true;
				}
			}
		}
		
		if(flag==false)
			System.out.println("No Duplicates Found");

	}

}
