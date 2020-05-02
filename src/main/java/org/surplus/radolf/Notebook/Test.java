package org.surplus.radolf.Notebook;

import java.util.Collection;
import java.util.TreeSet;

public class Test {
	
	private synchronized  void test5() {
		while (true) {
			try {
				wait(2000);
				System.out.println("1");
			}catch(InterruptedException e) {
				
				
			}
			
		}
		
	}

	public static void main(String[] args) {

		//Test t = new Test();
		//t.test5();
		
		System.out.println(divideRecursionMethod(1,0));
		System.out.println(divideIterativenMethod(10,2));
		
		//test3();
		
		test4();	


		
		

	}





	private static void test4() {
		
		Collection<String> col = new TreeSet <>();
		col.add("HOLA");
		col.add("CHAO");
		col.add("Hacia");
		col.add("Desde");
		col.add("HOLA");
		
		for (String s  : col) {
			
			
			System.out.println(s + " ");
		}
		
		
		
		
	}


	private static void test3() {
		
		String s1 = "hola";
		
		String s2=s1;
		
		String s3 = new String(s1);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s2.equals(s3));
		
		System.out.println(s1 == s2);
		
		System.out.println(s2 ==s3);
	
		
	}


	/**
	 *Metodo recursivo, el cociente será el número de restas ejecutadas:
	 * 
	 * @param dividend
	 * @param divisor
	 * @return
	 */


	public static int divideRecursionMethod (int dividend, int divisor ) {	
		int result=1;  
		try {		        	
			if(divisor>dividend || divisor==0 ){
				return 0;
			} else {
				return result + divideRecursionMethod(dividend-divisor, divisor);
			}	        	

		} catch (ArithmeticException e) {		
			System.out.println("Error inside the duvideRecursionMethod");

		}	        
		return result;	        

	}
	/**
	 * Metodo iterativo, el cociente será el número de restas ejecutadas:
	 * @param dividend
	 * @param divisor
	 * @return 
	 */

	public static int divideIterativenMethod (int dividend, int divisor ) {	
		int result=0; 		
		try {	
			if(divisor>dividend || divisor==0 ){
				return 0;
			}else {
				while(dividend>0) {
					result++;
					dividend=dividend-divisor;				
				}   
			}

		} catch (ArithmeticException e) {		
			System.out.println("Error inside the divideIterativenMethod");
		}	        
		return result;	        

	}
	
	public class Tester {
		
		private  void test5() {
			while (true) {
				try {
					wait();
				}catch(InterruptedException e) {
					
					
				}
				
			}
			
		}
		
	}

}


