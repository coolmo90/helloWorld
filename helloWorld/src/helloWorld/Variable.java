package helloWorld;

public class Variable {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = 10;
		System.out.println("sum: " + sum);
		sum = num1 % num2; //0.5 는 못읽음 1임
		System.out.println("sum: " + sum);
	    //sum은 정수만 담을수있음, %는 나머지
		sum = num1 * num2;
		System.out.println("sum: " + sum);	
	    sum = num1 / num2;
		System.out.println("sum: " + sum);
	
		boolean trueOfFalse = 10 > 20;
		System.out.println(trueOfFalse);

	    if(trueOfFalse) {
			System.out.println("결과 참입니다.");
	    } else { 
			System.out.println("결과 거짓입니다.");
			
		}
	    trueOfFalse = num1 < num2;
	    System.out.println(trueOfFalse);
	    trueOfFalse = sum == 10;
	    System.out.println(trueOfFalse);

	    
	    
	}
}
