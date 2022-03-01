class prac2_1{
	public static void main(String s[]){
		int num1 = Integer.parseInt(s[0]);
		int num2 = Integer.parseInt(s[2]);
		char c = s[1].charAt(0);
		switch(c){
			case '+':
				System.out.println("Addition is "+(num1+num2));
				break;
			case '-':
				System.out.println("Subtraction is "+(num1-num2));
				break;
			case '*':
				System.out.println("Multiplication is "+(num1*num2));
				break;
			case '/':
				System.out.println("Division is "+(num1/num2));
				break;
		}
	}
}

