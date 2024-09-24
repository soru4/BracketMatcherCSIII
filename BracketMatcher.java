public class BracketMatcher
{
    

    public static void main(String[] args)
    {
        
    }
    
    public static String matchBrackets(String str)
    
    
    {
        Stack<Character> s = new MyStack();
       
       for(int i = 0; i < str.length(); i++){
           char x = str.charAt(i);
           if(x == '(' || x == '{'||x== '['){
               s.push(str.charAt(i));
           }
           else if(x == ')' || x == '}' || x == ']'){
               if(s.isEmpty()){
                   return "Too many closing brackets";
                }
                else{
                    if(!eq(s.pop(), x)){
                        return "Bracket mismatch";
                    }
                }
            }
        
        }
        if(s.isEmpty()){
            return "Balanced";
        }else{
            return "Not enough closing brackets";
        }
       
    }
    
        private static  boolean eq(Character c, Character y){
            switch(c){
                case '(':
                        return ')' == y;
                case '{':
                    return '}' == y;
                case '[':
                    return ']' == y;
                default:
                    return false;
            }
        }
    }

       
            
        
        
        
    
    
   
    
