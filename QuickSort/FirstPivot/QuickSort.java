public class QuickSort{
	public static void main(String[] args) {

		int[] array={7,9,4,5,2,10,3,0};

		System.out.println("\nArray Before Applying QuickSort");
		display(array);

		QuickSort(array,0,array.length-1);

		System.out.println("\nArray After Applied QuickSort");
		display(array);


	}//main

	public static void QuickSort(int[] a,int p,int r){

		if(p<r){

		int q=Partition(a,p,r);

		QuickSort(a,p,q-1);

		QuickSort(a,q+1,r);

		}//if		
		
	}//QuickSort

	public static int Partition(int[] a,int p,int r){
		int start=p;
		int end =r;
		while(start<end){
			int pivot=a[p];

			while(a[start]<pivot){
				start++;
			}
			while(a[end]>pivot){
			end--;
			}
			if(start<end){
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
			}	

		}

			int temp1=a[p];
			a[p]=a[end];
			a[end]=temp1;
		
		
		return end;

	}//Partition

	public static void display(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		
		}//for
		System.out.println();

	}//display

}//class

