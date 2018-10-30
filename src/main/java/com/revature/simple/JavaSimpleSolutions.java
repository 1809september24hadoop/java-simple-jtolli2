package com.revature.simple;

public class JavaSimpleSolutions implements JavaSimple {

	@Override
	public int castToInt(double n) {
		// DONE
		return (int)n;
	}

	@Override
	public byte castToByte(short n) {
		// DONE
		return (byte)n;
	}

	@Override
	public double divide(double operandOne, double operandTwo) throws IllegalArgumentException {
		// DONE
		if (operandTwo == 0) {
			throw new IllegalArgumentException();
		}
		return operandOne/operandTwo;
	}

	@Override
	public boolean isEven(int n) {
		// DONE
		
		//Implementation without bitwise operation
		/*int check = n;
		for (int i = 0; i < n; i++) {
			check -= 2;
		}
		return check == -2;*/
		
		//Implementing with bitwise operation
		if ((n & 0x00000001) == 0) {
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public boolean isAllEven(int[] array) {
		// TODO Auto-generated method stub
		for(int i = 0; i < array.length; i++) {
			if ((array[i] & 0x00000001) == 1) {
				return false;
			}
		}
		return true;
	}

	@Override
	public double average(int[] array) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int max(int[] array) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int fibonacci(int n) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] sort(int[] array) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int factorial(int n) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] rotateLeft(int[] array, int n) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String isPrime(int n) {
		// TODO Auto-generated method stub
		if (n < 0) {
			throw new IllegalArgumentException();
		}
		String answer = "This number is prime.";
		
		//use isEven and rule out other cases
		//try passing a boolean all the way
		
		for(double i = 0; i < Math.sqrt(n); i++) {
			answer = ((n % i) != 0) ? " ": " "; 
		}
		return null;
	}

	@Override
	public boolean balancedBrackets(String brackets) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return false;
	}

}
