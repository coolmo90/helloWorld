package helloWorld;

public class HelloWorld {
	public static void main(String[] args) {
		String name = "Hong Kildong";
	    name = "홍길동";
	    System.out.println("My name is" + name);        
        int height = 170;
        System.out.println(name + "키는" + "입니다");
	
	    String name1 = "박현명";
	    int age1 = 29;
	    double height1 = 170.8;
	    
	    System.out.println(name1 + "의 키는" + height1 + "이고 나이는" + age1 + "입니다");
        
	    String name2 = "두 사람 ";
	    int age2 = 42;
	    double height2 = 70.5;
	    System.out.println(name2 + "나이의 합은 " + age2 + "입니다");	
	
	    System.out.println("두 사람 나이의 합은 " + (age1 + age2) + "입니다");
	}
	
}
