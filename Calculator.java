import java.util.*;
public class Calculator{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("please Enter the First Number"+" ");
	int a = sc.nextInt();
	
	System.out.print("please Enter the Second Number"+" ");
	int b = sc.nextInt();
	
	System.out.print("Enter the Operation"+" ");
	System.out.println("Choose the operation");
	System.out.println("1 - Add");
	System.out.println("2 - Subtraction");
	System.out.println("3 - Multiplication");
	System.out.println("4 - Division");
	int n= sc.nextInt();
	
	
	
	
	
	if(n==1){
		int result = add(a,b);
		System.out.print("So the result is : "+ result);
	}
	else if(n==2){
		System.out.print("The result is: "+sub(a,b));
	}
	else if(n==3){
		System.out.print("The Result is : "+multiply(a,b));		
	}
	else{
		System.out.print("The result is: "+diff(a,b));
	}
}
	
	static int add(int a, int b) {
        return a + b;
    }
	static int sub(int a, int b) {
        return a - b;
    }
	static int multiply(int a, int b) {
        return a * b;
    }
	static int diff(int a, int b) {
        return a / b;
    }
	
		
	
}