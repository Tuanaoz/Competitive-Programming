class ValidParanthesis{
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('|| s.charAt(i) == '{'|| s.charAt(i) == '[' ){
                stack.push(s.charAt(i));
            }
            else if(stack.empty() != true && s.charAt(i) == ')'){
                    if(stack.peek() != '('){return false; }
                    else{stack.pop();}
            }
            else if(stack.empty() != true && s.charAt(i) == '}'){
                    if(stack.peek() != '{'){return false;}
                    else{stack.pop();}
            }
            else if(stack.empty() != true && s.charAt(i) == ']'){
                    if(stack.peek() != '['){return false;}
                    else{stack.pop();}
            }
            else if(stack.empty() == true && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')){return false;}
            else{continue;}   
        }
        if(stack.empty() != true){return false;}
        return true; 
    }
}