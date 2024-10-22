public class QuickSort{
	public static void main(String[] args) {

		int[] array={7,9,4,5,2,10,3,0};

		System.out.println("\nArray Before Apllying QuickSort");
		display(array);

		QuickSort(array,0,array.length-1);
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
		int mid=(p+r)/2;
		int pivotIndex=medianOfThree(a,p,mid,r);

		int pivot=a[pivotIndex];
		swap(a,pivotIndex,r);

		int i=(p-1);      //i should be on -1 index
		for(int j=p;j<=r-1;j++){
			if(a[j]<=pivot){
				i++;
				swap(a,i,j);
			}//if
			
		}//for
		swap(a,i+1,r);
		
		return i+1;

	}//Partition
	public static int medianOfThree(int[] a,int low,int mid,int high){
		if(a[low]>a[mid]&&a[low]<a[high]||a[low]<a[mid]&&a[low]>a[high]){
			return low;
		}else if(a[mid]>a[low]&&a[mid]<a[high]||a[mid]<a[low]&&a[mid]>a[high]){
			return mid;
		}else{
			return high;
		}
	}

	public static void display(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		
		}//for
		System.out.println();

	}//display

}//class

