public class Palindrome
{

    public static void main(String[] args)
    {
        
    }
    
    public static boolean isPalindrome(String str)
    {
        
        Stack<Character> s = new MyStack<Character>();
        Queue<Character> q = new MyQueue<Character>();
        
        
        for(int i = 0 ; i < str.length(); i++){
            char c = str.charAt(i);
            String legal = "abscdefghijklmnopqrstuvwxyz";
            char lowerCaseLetter = Character.toLowerCase(c);
            if( legal.indexOf( lowerCaseLetter ) > -1 )
            {
                s.push(lowerCaseLetter);
                q.add(lowerCaseLetter);
                
            //letter is a legal character
            }   
        }
        String regular = "";
        String reverse = "";
        Character x = '\0';
        while(x != null){
            x = s.pop();
            if(x!=null)
                reverse += x;
        }
        if(x == null)
            x = '\0';
        while(x != null){
            x = q.remove();
            if(x!=null)
              regular += x;
        }
        
        if(reverse.equals(regular)){
            return true;
        }
        
        return false;
    }
}