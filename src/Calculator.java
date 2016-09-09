import java.util.Scanner;

public class Calculator {
	public double addition(double n1,double n2){
		return n1+n2;
	}
	public double subraction(double n1,double n2){
		return n1-n2;
	}
	public double multiplication(double n1,double n2){
		return n1*n2;
	}
	public double division(double n1,double n2){
		return n1/n2;
	}
	public double modulus(double n1,double n2){
		return n1%n2;
	}
	
	public static void calc (double n1, double n2, int c){
		Calculator calc = new Calculator();
		switch(c){
		case 1: System.out.println(n1+" + "+ n2 +" = "+ calc.addition(n1, n2));return;
		case 2:System.out.println(n1+" + "+ n2 +" = "+ calc.subraction(n1, n2));return;
		case 3:System.out.println(n1+" + "+ n2 +" = "+ calc.multiplication(n1, n2));return;
		case 4: System.out.println(n1+" + "+ n2 +" = "+ calc.division(n1, n2));return;
		default :System.out.println(n1+" + "+ n2 +" = "+ calc.modulus(n1, n2));
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double n1,n2;
		int c;
		System.out.print("What is the first number?: ");
		n1 = sc.nextInt();
		System.out.println("1 - Addition");
		System.out.println("2 - Subraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division");
		System.out.println("5 - Modulus");
		
		System.out.print("What do you want to do?: ");
		c=sc.nextInt();
		System.out.println("What is the second number?: ");
		n2=sc.nextInt();
		calc(n1,n2,c);
		sc.close();
		
	}

}
