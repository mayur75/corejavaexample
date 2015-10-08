package com.wallgrens.examples;

public class MathOperation2 {

	public static void main(String[] args) {
	   addition();
	   subtraction();
	   multiplication();
	   divide();
	}
		// addition logic, subtraction,multiplication, divide
		// this method for addition
		public static void addition() {
		int number1 = 10	;
        int number2 = 20    ;
        int result = number1 + number2 ;
        System.out.println ("result!!!!!" + result);
	   	}
		// this method for subtraction
		public static void subtraction() {
			int number1 = 28 ;
			int number2 = 27 ;
			int result = number1 - number2 ;
			System.out.println ("result1---" + result);
		}
		// this method for multiplication
		 public static void multiplication () {
		    int number1 = 10;
		    int number2 = 20;
		    int result = number1 * number2;
		    System.out.println("result***" + result);
		 }
		  // this method for divide
		  public static void divide() {
			  int number1 = 40;
			  int number2 = 20;
			  int result = number1/number2 ;
			  System.out.println ("result///" + result);
		  }

	}
