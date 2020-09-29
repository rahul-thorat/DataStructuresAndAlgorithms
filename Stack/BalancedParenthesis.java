package Stack;

import java.util.Stack;

public class BalancedParenthesis {

    public static boolean isBalanced(String s){
        Stack<Character> a=new Stack<>();
        if(s.length()==0){
            return true;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='('){
                a.push(s.charAt(i));
            }
            else if(!matching(a.peek(),s.charAt(i)))
                return false;
            else
                a.pop();
        }
        if(!a.isEmpty())
            return false;
        return true;
    }

    public static boolean matching(char d,char e){
        if ((d =='(' && e==')') || (d =='{' && e=='}') || (d =='[' && e==']'))
            return true;

        return  false;
    }

    public static void main(String[] args) {
        String s="{({}})";
        System.out.println(isBalanced(s));
    }
}
