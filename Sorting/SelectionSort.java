package Sorting;

public class SelectionSort{
    public static void main(String[] args) {
        int[] arr={5,3,2,6,3};

        for(int i=0;i<arr.length;i++){
            int smallestElem=arr[i];
            for(int j=i;j<arr.length;i++){
                smallestElem=Math.min(arr[j],smallestElem);
            }
            int temp=arr[i];
            arr[i]=smallestElem;
            
        }
    }
}