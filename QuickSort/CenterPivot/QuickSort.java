public class QuickSort{
	public static void main(String[] args) {

		int[] array={7,9,4,5,2,10,3,0};

		System.out.println("\nArray Before Apllying QuickSort");
		display(array);

		int p=0;
		int r=array.length-1;
		int pivotIndex=(p+r)/2;
		swap(array,pivotIndex,r);

		System.out.println("Array After Swapped ");
		display(array);

		QuickSort(array,p,r);
		System.out.println("\nArray After Applied QuickSort");
		display(array);


	}//main
	public static void swap(int[]a,int i,int r){
		int temp= a[i];
		a[i]=a[r];
		a[r]=temp;
	}

	public static void QuickSort(int[] a,int p,int r){

		if(p<r){

		int q=Partition(a,p,r);

		QuickSort(a,p,q-1);

		QuickSort(a,q+1,r);

		}//if		
		
	}//QuickSort

	public static int Partition(int[] a,int p,int r){
		int pivot=arr[r];
		int i=p-1;
		for(int j=p;j<=r;j++){
			if(arr[j]<pivot){
				i++;
		swap(arr, i, j);
			}
		}
		swap(arr, i+1, r);
		
		return i+1;

	}//Partition

	public static void display(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		
		}//for
		System.out.println();

	}//display

}//class

