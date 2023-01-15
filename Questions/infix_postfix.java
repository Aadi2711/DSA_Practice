package class_question;

import java.util.Stack;

public class infix_postfix {
    public static int sign(char x){
        switch (x){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    public static boolean digitorletter(char C){
        if(C!='+'&& C!='-' && C!='*'&& C!='/' && C!='^' && C!='(' && C!=')'){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Stack s= new Stack<>();
        String x= "x+y/1/3+7*n*(5-6+2)";
        String post="";
        infix_postfix inpo= new infix_postfix();
        for(int i=0; i<x.length(); i++){
            char c= x.charAt(i);
            if(digitorletter(c)){
                post+=c;
            }
            else if (c=='(') {
                s.add(c);
            }
            else if (c==')') {
                while(!s.peek().equals('(')){
                    post+=s.peek();
                    s.pop();
                }
                s.pop();
            }
            else {
                while (!s.isEmpty() && sign((c)) <= sign((Character) s.peek())) {
                    post += s.peek();
                    s.pop();
                }
                s.push(c);
            }

        }
        while (!s.isEmpty()) {
            if (s.peek().equals('(')){
                System.out.println("Invalid Expression");;
            }
            post += s.peek();
            s.pop();
        }
        System.out.println(post);
    }
}
