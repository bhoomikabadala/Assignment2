        public class QS {
	public void quickSort(int[] array,int left,int right,int pivot) {
		int mid;
		if((left+right)%2==0) {
			mid = (left+right)/2;
		}
		else {
			mid = (left+right)/2 + 1;
		}
		
		while(left!=right) {
			if(array[left]<array[right]) {
				if(pivot<mid) {
					right--;
				}
				else {
					left++;
				}
			}
			else if(array[left]>array[right]) {
				if(pivot<mid) {
					int temp = array[right];
					array[right] = array[left];
					array[left] = temp;
					pivot=right;
					left++;
				}
				else {
					int temp = array[right];
					array[right] = array[left];
					array[left] = temp;
					pivot=left;
					right--;
				}
			}
		}
		for(int j=0;j<array.length;j++) 
			System.out.print(array[j]+" ");
		System.out.println();
		
		if(pivot>1) {
			int[] L = new int[pivot];
			int[] R = new int[array.length-pivot-1];
			
			for(int i=0; i<L.length;i++) {
				L[i]=array[i];
			}
			
			for(int i=0; i<R.length;i++) {
				R[i]=array[i+pivot+1];
			}
			
			quickSort(L,0,L.length-1,0);
			quickSort(R,0,R.length-1,0);
			
			for(int i=0; i<L.length;i++) {
				array[i]=L[i];
			}
			
			for(int i=0; i<R.length;i++) {
				array[i+pivot+1]=R[i];
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		int[] a= {3,5,1,4,2};
		
		QS obj = new QS();
		obj.quickSort(a, 0, a.length-1, 0);
			
		for(int j=0;j<a.length;j++) 
			System.out.print(a[j]+" ");
		System.out.println();
	}
}
