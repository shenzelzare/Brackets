import java.util.*;
public class Brackets {
    public int solution(String S){
        Stack<String> zeki = new Stack<>();
        for(int i=0;i<S.length();i++){
            String s = S.substring(i,i+1);
            if(s.equals("(")||s.equals("[")||s.equals("{")){
                zeki.push(s);
            }
            if(zeki.isEmpty()){
                return 0;
            }
            if(s.equals(")")){
                if(!zeki.pop().equals("(")){
                    return 0;
                }
            }
            if(s.equals("]")){
                if(!zeki.pop().equals("[")){
                    return 0;
                }
            }
            if(s.equals("}")){
                if(!zeki.pop().equals("{")){
                    return 0;
                }
            }
        }
        if(zeki.isEmpty()){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        Brackets brackets = new Brackets();
        System.out.println(brackets.solution("{[()()]}"));
    }
}
