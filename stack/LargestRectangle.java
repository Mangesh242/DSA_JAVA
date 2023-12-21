package stack;
import java.util.*;

public class LargestRectangle {
   
    public static void main(String[] args) {
        int[] inp={6,2,5,4,5,1,6};
        int[] NSL=new int[inp.length];
        int[] NSR=new int[inp.length];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<inp.length;i++){
            while(!st.isEmpty()&& inp[i] <= inp[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                NSL[i]=st.peek();
            }else{
                NSL[i]=-1;
            }
            st.push(i);
        }

        while(!st.isEmpty()){st.pop();}

        for(int i=inp.length-1;i>=0;i--){
            while(!st.isEmpty()&& inp[i] <= inp[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                NSR[i]=st.peek();
            }else{
                NSR[i]=inp.length;
            }
            st.push(i);
        }

        int area=Integer.MIN_VALUE;
        for(int i=0;i<inp.length;i++){
            area=Math.max(area,(NSR[i]-NSL[i]-1)*inp[i]);
        }
    
        System.out.println(area);


    }


    
    
}
