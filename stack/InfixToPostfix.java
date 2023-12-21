 package stack;
import java.util.*;

public class InfixToPostfix {

    Stack<Character> stack=new Stack<>();

    public String solve(String A) {
         StringBuilder sb=new StringBuilder();
            for(int i=0;i<A.length();i++){
                char ch=A.charAt(i);
                if (Character.isLetterOrDigit(ch)){
                    sb.append(String.valueOf(ch));
                }
                else if(ch=='('){
                    stack.push(ch);
                }
                else if(ch==')'){
                   
                          while(!stack.isEmpty() && !stack.peek().equals('(')){
                                    sb.append(String.valueOf(stack.peek()));
                                    stack.pop();
                                }
                                // if(!stack.isEmpty())
                                stack.pop();
                }
                else
                {
                    // System.out.println("Char processing is: "+ch);
                     while(!stack.isEmpty() && getPreference(stack.peek())>=
                            getPreference(ch)){
                                sb.append(String.valueOf(stack.pop()));
                            }
                            stack.push(ch);
                } 
            
            }
              while(!stack.isEmpty()){
                     if(stack.peek()=='(') return "invalid expression";
                    sb.append(String.valueOf(stack.pop()));
                 }
            return sb.toString();
    }

            
        public int getPreference(Character ch){
            
            switch (ch) {
                case '+':
                case '-':
                    return 1;    
                
                case '/':
                case '*':
                    return 2;

                case '^':
                    return 3;
                default:
                    break;
            }
            return -1;
        }

        public static void main(String[] args) {
            String input="(a+b)*c";
            // String input2="(a*b*c)/((f*g)-d)";

            InfixToPostfix obj=new InfixToPostfix();
            System.out.println(obj.solve(input));

        }
    
}
//quick sort,
//count sort
//sequential search