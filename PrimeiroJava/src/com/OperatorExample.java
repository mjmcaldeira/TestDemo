package com;

public class OperatorExample {

	public static void main(String[] args) {
	int a=10,b=3;
	int add,sub,mul,div,mod;
	add=a+b;
	sub=a-b;
	mul=a*b;
	div=a/b;
	mod=a%b;
	System.out.println("Arithmetic operation");
	System.out.println("Add "+add);
	System.out.println("Sub "+sub);
	System.out.println("Mul "+mul);
	System.out.println("Div "+div);
	System.out.println("Mod "+mod);
	boolean res1,res2,res3,res4;
	res1 = a>b;
	res2 = a<b;
	res3 = a!=b;
	res4 = a ==b;
	System.out.println("Result 1 "+res1);
	System.out.println("Result 2 "+res2);
	System.out.println("Result 3 "+res3);
	System.out.println("Result 4 "+res4);
	int n=10;
	System.out.println("Value of n is "+n);
	n=n+1;
	System.out.println("Value of n is "+n);
	n++;
	System.out.println("Value of n is "+n);
	}
	

}
