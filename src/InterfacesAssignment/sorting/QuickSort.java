package InterfacesAssignment.sorting;

public class QuickSort implements Sortable {
    void quick(int []arr, int start, int end){
        if(start < end){
            int p=Partition(arr, start,end);
            quick(arr, start, p-1);
            quick(arr, p+1, end);
        }

    }

    private int Partition(int[] arr, int start, int end) {
        int pivot=arr[end];
        int p=start-1;
        for(int k=start;k<=end-1;k++) {
            if(arr[k]<pivot) {
                p++;
                int temp=arr[p];
                arr[p]=arr[k];
                arr[k]=temp;
            }
        }
        int temp=arr[p+1];
        arr[p+1]=arr[end];
        arr[end]=temp;

        return p+1;
    }

    @Override
    public void sort(int[] arr) {
        quick(arr, 0, arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
