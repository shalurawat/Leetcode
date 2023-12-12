import java.util.*;

public class quickSort {
    public static int partition(int arr[],int si,int ei){
        //pivot element
        int pivot = arr[ei];
        int i = si-1;

        for(int j = si;j<ei;j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
            }
        }
        i++;
        ///swap i th element with pivot element
        int temp = pivot;
        arr[ei] = arr[i];       //pivot =arr[i] is wrong cox we have to put element in index not in a variable
        arr[i] = temp;
    
        return i;
    }

    public static void quickSorting(int arr[],int si,int ei){

        if(si>=ei)
            return;
            
        //pivot index
        int pIdx = partition(arr,si,ei);
        quickSorting(arr, si, pIdx-1);
        quickSorting(arr, pIdx, ei);
    }

    public static void main(String args[]){
        int arr[] = {5,1,2,8,6,3};
        quickSorting(arr, 0, arr.length-1);

        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]+" ");
    }
}
