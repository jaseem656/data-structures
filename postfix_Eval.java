public class postfix_Eval{
	public static void main(String[] args){
		String postfix="123*+4-";
		Eval(postfix);
	}
	public static void Eval(String exp){
		int top=-1;
		double stk[]=new double[exp.length()];
		for(int i=0;i<exp.length();i++){
			char c=exp.charAt(i);
			if(Character.isDigit(c)){
				stk[++top]=c-'0';
			}
			else{
				double a=stk[top--];
				double b=stk[top--];
				if(c=='+')
					stk[++top]=a+b;
				else if(c=='-')
					stk[++top]=b-a;
				else if(c=='*')
					stk[++top]=b*a;
				else if(c=='/')
					stk[++top]=b/a;
				else
					System.out.println("Invalid Characters");
			}
			System.out.println("Evaluted value="+stk[top]);
		}
	}
}

				
					