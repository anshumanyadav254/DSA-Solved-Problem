{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(isBalance(str));
	}
	static boolean isBalance(String s)
	{
	   /* Stack<Character>s=new Stack<Character>();
	    for(int i=0;i<str.length();i++)
	    {
	        char c=str.charAt(i);
	        if(c=='('|| c=='{'|| c=='[')
	        {
	            s.push(c);
	        }
	        else{
	            if(s.isEmpty()==true)
	            {
	                return false;
	            }
	            else if(matching(c,s.peek())==false){
	                return false;
	                
	            }
	            else{
	            s.pop(); 
	            }
	        }
	    }
	    return (s.isEmpty());*/
	    Stack<Character> stack  = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {     
                stack.push(c);
            } else if(c == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }           
            } else if(c == '}') {
                if(stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
	
	/*static boolean matching(char a,char b)
	{
	    return((a=='(' && b==')')||(a=='{'&& b=='}')||(a=='['&& b==']')); 
	}*/
}

/* input= [[[]]] output=true*/
