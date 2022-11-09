class MS {
    void mergeSort(int[] array, int l, int r)
    {
    	if(l+1<r) {//1<4,1<2
    		int m;
        	if((l+r)%2==0) {
    			m = (l+r)/2;//m=2,1
    		}
    		else {
    			m = (l+r)/2 + 1;
    		}
        	
        	int[] L = new int[m];//L[2],L[1]
        	int[] R = new int[r-m+1];//R[3],R[2]
        	
        	for(int i=0; i<L.length;i++) {
        		L[i]=array[i];//L[0]=5,L[1]=4,L[0]=3
        	}
        	
        	//for(int j=0;j<L.length;j++) 
    		//	System.out.print(L[j]+" ");
    		//System.out.println();
        	
        	for(int i=0; i<R.length;i++) {
        		R[i]=array[m+i];//R[0]=3,R[1]=2,R[2]=1,R[0]=2,R[1]=1
        	}
        	
        	//for(int j=0;j<R.length;j++) 
    		//	System.out.print(R[j]+" ");
    		//System.out.println();
        	
        	mergeSort(L,0,L.length-1);//({5,4},0,1),({3},0,0)
        	mergeSort(R,0,R.length-1);//({3,2,1},0,2),({{2,1},0,1)
        	
        	
        	for(int i=0;i<array.length;i++) {
        		for(int j=i;j<array.length;j++) {
        			if(array[j]<array[i]) {
        				int temp = array[i];
        				array[i]=array[j];
        				array[j]=temp;
        			}
        		}
        	}
        	//for(int j=0;j<array.length;j++) 
        	//	System.out.print(array[j]+" ");
        	//System.out.println();
    	}
    	
    	
    }
	
	
	
    public static void main(String args[])
    {
    	int[] a = {3, 4, 5, 2, 1};
    	
    	MS obj = new MS();
    	obj.mergeSort(a, 0, a.length-1);
    	for(int j=0;j<a.length;j++) 
    		System.out.print(a[j]+" ");
    	System.out.println();
    }
}
