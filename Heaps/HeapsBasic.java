package Heaps;

import java.util.ArrayList;

public class HeapsBasic {
    public int solve(ArrayList<Integer> A) {
        int ans=0;
      int N=A.size();
      for(int i=(N-2)/2;i>=0;i--){
          heapiFy(A,i);
      }
//    System.out.println(" "+A);

        while(A.size()!=1){
            if(A.size()>1){
                int no1=A.get(0);
                removeMin(A);
                // System.out.println("no1: "+no1);
                // System.out.println(" "+A);
                int no2=A.get(0);
                removeMin(A);
                // System.out.println("no2: "+no2);
                // System.out.println(" "+A);

                insert(no1+no2,A);
                // System.out.println("After insert new addition:  "+A);
                ans=ans+no1+no2;
            }
            // System.out.println(" "+heap);
        }
        return ans;
    }
    void insert(int x,ArrayList<Integer> heap){
        heap.add(x);

        int i=heap.size()-1;
        while(i>0){
            int pi=(i-1)/2;
            if(heap.get(i) < heap.get(pi)){
                int temp=heap.get(i);
                heap.set(i,heap.get(pi));
                heap.set(pi,temp);
                i=pi;
            }else{
                break;
            }
        }
    }
    
    void removeMin(ArrayList<Integer> heap){
        // int temp=heap.get(0);
        heap.set(0,heap.get(heap.size()-1));
        heap.set(heap.size()-1,Integer.MAX_VALUE);

        int index=heap.size()-1;
        heap.remove(index);
        heapiFy(heap,0);

    }

    void heapiFy(ArrayList<Integer> heap,int i){
            int N=heap.size();
            // int i=0;

            while((2*i+1) < N ){
                int x=Math.min(heap.get(i),heap.get(2*i+1));
                int no3= ( (2*i + 2) < N) ? heap.get(2*i+2) : Integer.MAX_VALUE;
                x=Math.min(x,no3);

                if(x== heap.get(i))break;

                else if(x == heap.get(2*i+1)){
                    int temp=heap.get(i);
                    heap.set(i,heap.get(2*i+1));
                    heap.set(2*i+1,temp);
                    i=2*i+1;
                }else if(x == no3){
                    int temp=heap.get(i);
                    heap.set(i,heap.get(2*i+2));
                    heap.set(2*i+2,temp);
                    i=2*i+2;
                }
            }

    }
}
