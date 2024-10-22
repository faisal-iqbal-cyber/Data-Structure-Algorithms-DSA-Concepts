public class Perfect{
    public static void main(String[] args) {
        int[] array = {7, 9, 4, 5, 2, 9, 10, 3, 0};

        System.out.println("Array Before Applying QuickSort:");
        display(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("\nArray After Applying QuickSort:");
        display(array);
    }

    public static void quickSort(int[] a, int p, int r) {
        if (p < r) {
            int q = partition(a, p, r);
            quickSort(a, p, q - 1);
            quickSort(a, q + 1, r);
        }
    }

    public static int partition(int[] a, int p, int r) {
        int pivot = a[p];
        int pivotIndex = p;
	swap(a,pivotIndex,r);
	int i=p-1;

        for (int j = p ; j <= r-1; j++) {
            if (a[j] <= pivot) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i+1, r);

        return i+1;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void display(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
