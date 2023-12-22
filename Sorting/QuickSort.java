package Sorting;
import java.util.*;
public class QuickSort {

    public static void main(String[] args) {
        int[] arr={55,10,43,22,8,10};
            QuickSorting(arr, 0, arr.length-1);
            System.out.println("Sorted array is:: "+Arrays.toString(arr));

    }

    static void QuickSorting(int[] arr,int start,int end){
        if(start>end)return;

        int pIndex=partitionIndexAscending(arr, start, end);
        QuickSorting(arr, start, pIndex-1);
        QuickSorting(arr, pIndex+1,end);
    }
    static int partitionIndexDescending(int[] arr,int start,int end){
        
        int pivot=arr[start];
        int l=start+1;
        int r=end;

        while(l<=r){
            if(pivot <= arr[l]){
                l++;
            }
            else if(pivot > arr[r]){
                r--;
            }
            else
            {
                int temp=arr[r];
                arr[r]=arr[l];
                arr[l]=temp;
                l++;
                r--;
            }
        }
        arr[start]=arr[r];
        arr[r]=pivot;
        return r;
    }


    static int partitionIndexAscending(int[] arr,int start,int end){
        
        int pivot=arr[start];
        int l=start+1;
        int r=end;

        while(l<=r){
            if(arr[l]<=pivot){
                l++;
            }
            else if(arr[r] > pivot){
                r--;
            }
            else
            {
                int temp=arr[r];
                arr[r]=arr[l];
                arr[l]=temp;
                l++;
                r--;
            }
        }
        arr[start]=arr[r];
        arr[r]=pivot;
        return r;
    }
    
}
