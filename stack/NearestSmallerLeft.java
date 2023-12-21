package stack;

import java.util.*;

public class NearestSmallerLeft {
    
    public static void main(String[] args) {
        int[] arr={8,2,4,9,7,6,3,10};

        System.out.println(Arrays.toString(NSEL(arr)));
    }

    static int[] NSEL(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] res=new int[arr.length];

        for(int i=0;i<arr.length;i++){

            while(!st.isEmpty() && arr[i] <=st.peek()){
                st.pop();
            }
            if(!st.isEmpty())
            {
                res[i]=st.peek();
            }else{
                res[i]=-1;
            }
            st.push(arr[i]);
        }

        return res;

        
    }
}
