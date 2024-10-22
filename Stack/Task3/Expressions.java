import java.util.Stack;
public class Expressions{
	public static void main(String[] args) {
		String Expression1="[{(a+b) + (a-2 + (a-2))}]";

		String Expression2="[{a+(a+b + (a)}]";

		String Expression3="](a+2)";

		String Expression4="[{(a+b)}]";


		boolean result1=CheckForBalanacedDelimiters(Expression1);

		boolean result2=CheckForBalanacedDelimiters(Expression2);

		boolean result3=CheckForBalanacedDelimiters(Expression3);

		boolean result4=CheckForBalanacedDelimiters(Expression4);

		

		System.out.println("Expression "+Expression1+" is Balanced : "+result1);

		System.out.println("Expression "+Expression2+" is Balanced : "+result2);

		System.out.println("Expression "+Expression3+" is Balanced : "+result3);

		System.out.println("Expression "+Expression4+" is Balanced : "+result4);


	}
	public static boolean CheckForBalanacedDelimiters(String exp){
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<exp.length();i++){
			char c=exp.charAt(i);

			if(c=='('||c=='{'||c=='['){
				stack.push(c);
			}else if(c==')'||c=='}'||c==']'){
				
				if(stack.isEmpty()){
					return false;

			}else{
				char top=stack.pop();
				if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                        return false;
                    }
			}

		}
		
	}
		return stack.isEmpty();
	}
	

}