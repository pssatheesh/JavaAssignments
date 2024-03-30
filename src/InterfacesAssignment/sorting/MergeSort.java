package InterfacesAssignment.sorting;

public class MergeSort implements Sortable{
    public static void merge(int []arr, int mid, int start, int end) {
        int N1=mid-start+1;
        int N2=end-mid;

        int []Left=new int[N1];
        int []Right=new int[N2];

        int i,j,k;
        for(i=0;i<N1;i++)
            Left[i]=arr[start+i];
        for(j=0;j<N2;j++)
            Right[j]=arr[mid+j+1];

        i=0;j=0;
        k=start;
        while(i<N1 && j<N2) {
            if(Left[i]<Right[j]) {
                arr[k]=Left[i];
                i++;
            }else {
                arr[k]=Right[j];
                j++;
            }
            k++;
        }
        while(i<N1) {
            arr[k]=Left[i];
            i++;
            k++;
        }
        while(j<N2) {
            arr[k]=Right[j];
            j++;
            k++;
        }

    }

    public static void mergeSort(int []arr, int start, int end){
        if(start<end) {
            int mid=(start+end)/2;
            mergeSort(arr,start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, mid, start, end);
        }

    }

    @Override
    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
