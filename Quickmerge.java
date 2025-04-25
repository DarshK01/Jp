interface Sortable {
    void sort(int[] arr);
}

class QuickSort implements Sortable {
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high], i = low - 1;
        for (int j = low; j < high; j++)
            if (arr[j] > pivot) swap(arr, ++i, j);
        swap(arr, i + 1, high);
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}

class MergeSort implements Sortable {
    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private void merge(int[] arr, int l, int m, int r) {
        int[] L = new int[m - l + 1], R = new int[r - m];
        for (int i = 0; i < L.length; i++) L[i] = arr[l + i];
        for (int i = 0; i < R.length; i++) R[i] = arr[m + 1 + i];
        int i = 0, j = 0, k = l;
        while (i < L.length && j < R.length)
            arr[k++] = (L[i] >= R[j]) ? L[i++] : R[j++];
        while (i < L.length) arr[k++] = L[i++];
        while (j < R.length) arr[k++] = R[j++];
    }
}

public class SortTest {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 9, 1, 7}, arr2 = {5, 2, 9, 1, 7};
        Sortable quick = new QuickSort(), merge = new MergeSort();
        quick.sort(arr1);
        merge.sort(arr2);

        System.out.println("Quick Sort:");
        for (int n : arr1) System.out.print(n + " ");
        System.out.println("\nMerge Sort:");
        for (int n : arr2) System.out.print(n + " ");
    }
}