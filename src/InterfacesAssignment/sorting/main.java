package InterfacesAssignment.sorting;

import java.util.Scanner;

/*Define an interface named Sortable with a method sort() . Implement this interface in classes representing different sorting algorithms such as bubble sort, quicksort, and merge sort. Allow the user to input an array, select a sorting algorithm, and display the sorted array.*/


public class main {
    public static void main(String[] args) {
        int []arr={4,6,8,3,7,1,2};
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("\nEnter your choice \n1.BubbleSort\n2.QuickSort\n3.MergeSort\n4.Exit");
            System.out.println("Enter your choice");
            int choice=scanner.nextInt();
            switch(choice){
                case 1:
                    Sortable b=new BubbleSort();
                    b.sort(arr);
                    break;
                case 2:
                    Sortable qs=new QuickSort();
                    qs.sort(arr);
                    break;
                case 3:
                    Sortable ms=new MergeSort();
                    ms.sort(arr);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

    }
}
